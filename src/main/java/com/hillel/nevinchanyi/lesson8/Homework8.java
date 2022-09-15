package com.hillel.nevinchanyi.lesson8;
import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        int [] team1 = new int[25];
        int [] team2 = new int[25];

        for (int i = 0; i < 25; i++) {
            team1[i] = (int)(18 + Math.random() * 23);
            team2[i] = (int)(18 + Math.random() * 23);

        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        double avg1 = 0;
        double avg2 = 0;

        for (int i = 0; i < 25; i++) {
            avg1 += team1[i];
            avg2 += team2[i];
        }
        avg1/=25;
        avg2/=25;
        System.out.println("Avarage age of team 1 is: " + avg1);
        System.out.println("Avarage age of team 2 is: " + avg2);


        if(avg1 > avg2){
            System.out.println("Avarage age of team 1 ("+avg1+") is bigger than avarage age of "+
                    "team 2 ("+avg2+")");
        } else if(avg1 < avg2){
            System.out.println("Avarage age of team 1 ("+avg1+") is lover сhan avarage age of "+
                    "team 2 ("+avg2+")");
        } else {
            System.out.println("The average ages of both teams are equal ("+avg1+")");
        }
    }
}
