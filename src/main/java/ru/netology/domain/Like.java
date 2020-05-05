package ru.netology.domain;

public class Like {
    private int counter;
    private boolean registered;
    private boolean canLike;
    private boolean alreadyLike;

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

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isAlreadyLike() {
        return alreadyLike;
    }

    public void setAlreadyLike(boolean alreadyLike) {
        this.alreadyLike = alreadyLike;
    }
}