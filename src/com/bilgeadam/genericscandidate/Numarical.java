package com.bilgeadam.genericscandidate;

public class Numarical extends Candidate{
    public Numarical() {
    }

    public Numarical(String name,int turkish, int maths, int phsical, int social, int biology) {
        super(name, turkish, maths, phsical, social, biology);
    }

    @Override
    public double calculateScore() {
        return (getTurkish()*0.7)+(getMaths()*2)+(getSocial()*0.3)+(getPhsical()*1)+(getBiology()*1);
    }
}