package com.company;

import com.company.Post;
import com.company.Video;
import com.company.Account;
import com.company.Follower;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        Follower f1 = new Follower(1, account);
        Follower f2 = new Follower(2, account);

        Post newPost = new Post(1, "www.instagram.com/xo_vallee", "First post");
        Video newVideo = new Video(1, "First video", "www.instagram.com/xo_vallee/videos");
        account.publishNewPost(newPost);
        account.publishNewVideo(newVideo);

        System.out.println("---------------------------------\n");

        account.remove(f2);
        Post post2 = new Post(2, "www.instagram.com/xo_vallee", "Second post");
        account.publishNewPost(post2);
    }
}