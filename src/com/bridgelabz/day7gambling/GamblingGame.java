package com.bridgelabz.day7gambling;

import java.util.Random;

public class GamblingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Game");
        int money=100;
        int betMoney=1;
        Random random = new Random();
        System.out.println("start with a stake of " + money +" every day and bet " + betMoney +" every game.");
        int bet =random.nextInt(2);
        System.out.println(bet);
        if (bet==1){
            System.out.println("Player Win the bet");
        }else {
            System.out.println("Player loss the bet");
        }
    }
}
