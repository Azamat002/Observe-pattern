package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here-
        IGAccount account = new IGAccount();
        Followers f1 = new Followers(1,account);
        Followers f2 = new Followers(2,account);
        account.add(f1);
        account.add(f2);
        Post newPost = new Post("namePost", "definition", "image1.jpg");
        account.publishPost(newPost);
        Video newVideo = new Video("nameVideo", 720, 48);
        account.publishVideo(newVideo);

    }
}
