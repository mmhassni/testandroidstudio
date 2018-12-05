package com.example.messaoud.simulationwhatsapp;

public class Article {
    private String name;
    private String status;
    private int avatar;

    public Article(String name, String status, int avatar) {
        this.name = name;
        this.status = status;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getAvatar() {
        return avatar;
    }
}

