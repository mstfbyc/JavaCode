package com.bilgeadam.genericscandidate;

public abstract class Candidate {
    private String name;
    private int turkish;
    private int maths;
    private int phsical;
    private int social;
    private int biology;

    public Candidate() {
    }

    public Candidate(String name, int turkish, int maths, int phsical, int social, int biology) {
        this.name = name;
        this.turkish = turkish;
        this.maths = maths;
        this.phsical = phsical;
        this.social = social;
        this.biology = biology;
    }

    public int getTurkish() {
        return turkish;
    }

    public void setTurkish(int turkish) {
        this.turkish = turkish;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhsical() {
        return phsical;
    }

    public void setPhsical(int phsical) {
        this.phsical = phsical;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateScore();
}

