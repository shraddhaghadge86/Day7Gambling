package com.bridgelabz.day7gambling;

import java.util.Random;

public class GamblingGame {
    public static void main(String[] args) {
        int money = 100;
        int playCount = 0;
        int wonCount = 0;
        Random random = new Random();
        while(money != 151&&money != 49){
            playCount++;
            int bet = random.nextInt(2);
            if(bet == 1){
                money = money+1;
                wonCount++;
            }else{
                money = money-1;
                System.out.println("Remaining Money Is :"+money);
            }
        }
        if (money > 150){
            System.out.println("player win more than its 50 percent of stack");
        }else {
            System.out.println("player looses more than its 50 percent of stack");
        }
        System.out.println("No of times Played:"+playCount);
        System.out.println("No Of Times Won:"+wonCount);
        System.out.println("No Of Times Lost:"+(playCount-wonCount));
    }
}
