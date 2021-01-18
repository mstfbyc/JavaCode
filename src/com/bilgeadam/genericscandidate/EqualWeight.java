package com.bilgeadam.genericscandidate;

public class EqualWeight extends Candidate{
    public EqualWeight(String name, int turkish, int maths, int phsical, int social, int biology) {
        super(name, turkish, maths, phsical, social, biology);
    }

    public EqualWeight() {
    }

    @Override
    public double calculateScore() {

        return (getTurkish()*1.5)+(getMaths()*1.5)+(getSocial()*0.5)+(getPhsical()*0.5)+(getBiology()*0.4);
    }
}
