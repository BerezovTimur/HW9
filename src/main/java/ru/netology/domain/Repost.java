package ru.netology.domain;

public class Repost {
    private int counter;
    private boolean registered;
    private boolean canRepost;
    private boolean alreadyRepost;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isAlreadyRepost() {
        return alreadyRepost;
    }

    public void setAlreadyRepost(boolean alreadyRepost) {
        this.alreadyRepost = alreadyRepost;
    }
}
