package com.bridgelabz.day7gambling;

import java.util.Random;

public class GamblingGame {
    public static void main(String[] args) {
        int money = 100;
        int playCount = 0;
        int wonCount = 0;
        int lossCount = 0;
        Random random = new Random();
        int day = 1;
        int forDay = 20;
        for (int i = day;i <= forDay; i++){
            playCount++;
            int bet = random.nextInt(3);
            switch (bet){
                case 1:
                    money = money+1;
                    wonCount++;
                    System.out.println("player current money is "+money);
                    break;
                case 2:
                    money = money-1;
                    lossCount++;
                    System.out.println("player loss bet so current money is "+money);
                    break;
                default:
                    System.out.println("player stop Gambling for a day");
            }
            System.out.println("current day "+ day++);
        }

        System.out.println("No of times Played:"+playCount);
        System.out.println("No Of Times Won:"+wonCount);
        System.out.println("No Of Times Lost:"+(playCount-wonCount));
    }
}
