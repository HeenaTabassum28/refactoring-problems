package com.deserve;

public class Player {
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int score) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void wonPoint() {
        this.score = this.score + 1;
    }

}
