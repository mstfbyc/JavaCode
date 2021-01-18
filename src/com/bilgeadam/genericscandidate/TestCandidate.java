package com.bilgeadam.genericscandidate;

public class TestCandidate {

    public static void main(String[] args) {
        Candidate candidate1 = new Numarical("Mustafa",40,45,15,10,20);
        Candidate candidate2 = new Numarical("Hasan",30,40,20,5,18);
        Candidate candidate3 = new Numarical("Ahmet",20,42,22,4,25);
        Candidate candidate4 = new Numarical("Mehmet",25,44,25,2,30);

        Candidate candidate5 = new EqualWeight("Mustafa",40,45,15,10,20);
        Candidate candidate6 = new EqualWeight("Hasan",30,40,20,5,18);
        Candidate candidate7 = new EqualWeight("Ahmet",20,42,22,4,25);
        Candidate candidate8 = new EqualWeight("Mehmet",25,44,25,2,30);

        Candidate fistCandidate = calculateFirstCandidate(candidate1,candidate2,candidate3,candidate4);
        System.out.println(fistCandidate.getName());

    }
    public static <E extends Candidate > E calculateFirstCandidate(E... e){
        E firstCandidate = e[0];

        for (int i = 1; i < e.length ; i++) {
            if(firstCandidate.calculateScore() > e[i].calculateScore()){
                firstCandidate = firstCandidate;
            }else{
                firstCandidate = e[i];
            }
        }
        return firstCandidate;
    }
}
