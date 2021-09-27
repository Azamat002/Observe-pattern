package com.company;

public class Post {
    private Integer IG_post_id;
    private String IG_post_link;
    private String IG_post_text;

    public Post(Integer IG_post_id, String IG_post_link, String IG_post_text) {
        this.IG_post_id = IG_post_id;
        this.IG_post_link = IG_post_link;
        this.IG_post_text = IG_post_text;
    }

    public Integer getIG_post_id() {
        return IG_post_id;
    }

    public void setIG_post_id(Integer IG_post_id) {
        this.IG_post_id = IG_post_id;
    }

    public String getIG_post_link() {
        return IG_post_link;
    }

    public void setIG_post_link(String IG_post_link) {
        this.IG_post_link = IG_post_link;
    }

    public String getIG_post_text() {
        return IG_post_text;
    }

    public void setIG_post_text(String IG_post_text) {
        this.IG_post_text = IG_post_text;
    }

    @Override
    public String toString() {
        return "Post{" +
                "\npost_id=" + IG_post_id +
                ", post_link='" + IG_post_link + '\'' +
                '}';
    }
}