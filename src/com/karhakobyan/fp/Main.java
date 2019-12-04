package com.karhakobyan.fp;

import java.util.Scanner;

public class Main {
    private static int accel_num;
    private static int break_num;

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.set_prop();
        bicycle.start();

        Scanner set = new Scanner(System.in);  
        System.out.println("How much accelerate");
        accel_num = Integer.parseInt(set.nextLine());

        System.out.println("How much break");
        break_num = Integer.parseInt(set.nextLine());

        for (int i = 0; i < accel_num; i++) {
            bicycle.accelerate();
        }
        for (int i = 0; i < break_num; i++) {
            bicycle.pressBreak();
        }

        bicycle.stop();
    }
}
