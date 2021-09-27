package com.company;

import com.company.IObserver;

public class Follower implements IObserver {
    private Integer follower_id;
    private Account account;

    public Follower(Integer follower_id, Account account) {
        this.follower_id = follower_id;
        this.account = account;
        account.add(this);
    }

    @Override
    public void update(Integer postType) {
        if(postType == 1) {
            Post newPost = account.getNewPost();
            System.out.println("Follower by ID " + follower_id + " received a new Post in INSTAGRAM: " + newPost);
        } else if(postType == 2) {
            Video newVideo = account.getNewVideo();
            System.out.println("Follower by ID " + follower_id + " received a new Video in INSTAGRAM: " + newVideo);
        }
    }
}