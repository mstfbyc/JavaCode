package com.bilgeadam.genericscandidate;

public class Verbalist extends Candidate{
    public Verbalist() {
    }

    public Verbalist(String name, int turkish, int maths, int phsical, int social, int biology) {
        super(name, turkish, maths, phsical, social, biology);
    }

    @Override
    public double calculateScore() {
        return (getTurkish()*2)+(getMaths()*0.7)+(getSocial()*1)+(getPhsical()*0.3)+(getBiology()*0.3);
    }
}

