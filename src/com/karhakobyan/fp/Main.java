package com.karhakobyan.fp;

import java.util.Scanner;

public class Main {
    private static int n;
    private static int k;

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.set_prop();
        bicycle.start();

        Scanner set = new Scanner(System.in);  
        System.out.println("How much accelerate");
        n = Integer.parseInt(set.nextLine());

        System.out.println("How much break");
        k = Integer.parseInt(set.nextLine());

        for (int i = 0; i < n; i++) {
            bicycle.accelerate();
        }
        for (int i = 0; i < k; i++) {
            bicycle.pressBreak();
        }

        bicycle.stop();
    }
}
