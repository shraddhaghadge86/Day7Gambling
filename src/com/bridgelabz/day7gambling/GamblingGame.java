package com.bridgelabz.day7gambling;

import java.util.Random;

public class GamblingGame {
    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Game");
        int money = 100;
        int playCount = 0;
        int wonCount = 0;
        int month = 12;
        int lossCount = 0;
        int perMonthWon = 0;
        int perMonthLoss = 0;
        int perMonthPlayCount=0;
        int perDailyWon = 0;
        int perDailyLoss = 0;
        int luckyDay = 0;
        int luckyMonth = 0;
        int unLuckyDay = 0;
        int unLuckyMonth = 0;
        int lastWonCount = 0;
        int lastLossCount = 0;
        Random random = new Random();
        int day = 0;
        int forDay = 20;

        //External for loop represents Month
        for (int j = 1; j <= month; j++) {

            // This for loop represents day
            for (int i = 0; i < forDay; i++) {
                day++;

                // This switch case for to decide to play or not for a day
                int playOrNot = random.nextInt(2);
                switch (playOrNot){
                    // case 0: if he wants to play
                    case 0:
                        //  to play until he loose his 50% of stake or win 50% of his stake
                        while (money > 50 && money < 150){

                            // This switch case for Loss or win
                            int bet = random.nextInt(2);
                            switch (bet) {
                                case 0:
                                    money = money + 1;
                                    // for daily won
                                    perDailyWon++;

                                    // for monthly
                                    perMonthWon++;
                                    perMonthPlayCount++;

                                    // for yearly
                                    wonCount++;
                                    playCount++;

                                    break;
                                case 1:
                                    money = money - 1;

                                    // for daily loss
                                    perDailyLoss++;

                                    // for monthly
                                    perMonthLoss++;
                                    perMonthPlayCount++;

                                    // for yearly
                                    lossCount++;
                                    playCount++;

                                    break;
                                default:
                                    return;
                            }
                        }
                        break;

                    // case 1: if he wants to skip for a day
                    case 1:
                        System.out.println("player stop Gambling for a day");
                        break;

                    default:
                        return;
                }

                if (lastWonCount < perDailyWon){
                    lastWonCount = perDailyWon;
                    luckyMonth = j;
                    luckyDay = i;
                }
                if (lastLossCount >= perDailyLoss){
                    lastLossCount = perDailyLoss;
                    unLuckyMonth = j;
                    unLuckyDay = i;
                }

                System.out.println("current day " + day);
                System.out.println("current money is " + money);
                System.out.println("current daily won " + perDailyWon);
                System.out.println("current daily Loss " + perDailyLoss);
                System.out.println("=================================");
                money = 100;
                perDailyLoss = 0;
                perDailyWon = 0;
            }
            System.out.println("********* Monthly Report *************");
            System.out.println("current Month " + j);
            System.out.println("No of times Played:" + perMonthPlayCount);
            System.out.println("No Of Times Lost:" + perMonthLoss);
            System.out.println("No Of Times Won:" + perMonthWon);
            System.out.println("No Of Times skiped: " + (day - perMonthPlayCount));


            System.out.println("**************************************");
            perMonthPlayCount = 0;
            perMonthWon = 0;
            perMonthLoss = 0;
            day = 0;
        }
        System.out.println("********* Yearly Report *************");
        System.out.println("No of times Played:" + playCount);
        System.out.println("No Of Times Won:" + wonCount);
        System.out.println("No Of Times Lost:" + lossCount);
        System.out.println("My luckyest day is: " + luckyDay + " of "+ luckyMonth + " month");
        System.out.println("My worst day is: " + unLuckyDay + " of "+ unLuckyMonth + " month");
        System.out.println("**************************************");

        System.out.println("No of times Played:"+playCount);
        System.out.println("No Of Times Won:"+wonCount);
        System.out.println("No Of Times Lost:"+(playCount-wonCount));
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
