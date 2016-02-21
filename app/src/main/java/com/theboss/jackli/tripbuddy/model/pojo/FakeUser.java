package com.theboss.jackli.tripbuddy.model.pojo;

/**
 * Created by jianhuizhu on 2016-02-21.
 */
  public class FakeUser{
    String name;
    String like;
    String thought;

    public FakeUser(String name, String thought, String like) {
        this.name = name;
        this.thought = thought;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }
}
