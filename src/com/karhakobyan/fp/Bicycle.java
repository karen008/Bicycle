package com.karhakobyan.fp;

import java.util.Scanner;

public class Bicycle {

    private String name;
    private String type;
    private int size;
    private int speed = 0;
    private int wheelsCount = 2;
    private String color;
    private boolean hasBottlePlace;
    private boolean hasBreak = true;
    private String breakType;
    private float price;
    private static final int MAX_SPEED = 70;



    public void set_prop(){
        Scanner set = new Scanner(System.in);
        System.out.println("Enter name");
        name = set.nextLine();

        System.out.println("Enter type");
        type = set.nextLine();

        System.out.println("Enter size");
        size = Integer.parseInt(set.nextLine());

        System.out.println("Enter color");
        color = set.nextLine();

        System.out.println("Name is: " + name);
        System.out.println("Type is: " + type);
        System.out.println("Size is: " + size);

    }

    public void start() {
        System.out.println("Starting with speed: " + speed);
    }

    public void stop() {
        while (speed > 0) {
            pressBreak();
        }
        System.out.println("Stopped");
    }

    public void pressBreak () {
        System.out.println("Break is pressed on speed: " + speed);
        if (hasBreak) {
            if(speed > 40) {
                speed -= 5;
            }
            else if (speed > 30) {
                speed -= 4;
            }
            else if (speed > 20) {
                speed -= 3;
            }
            else if (speed > 10) {
                speed -= 2;
            }
            else {
                speed --;
            }
        }
        System.out.println("Speed breaked to: " + speed);
    }

    public void accelerate () {
        System.out.println("Accelerate on speed: " + speed);
        if (speed < MAX_SPEED) {
            if(speed > 40) {
                speed += 1;
            }
            else if (speed > 30) {
                speed += 2;
            }
            else if (speed > 20) {
                speed += 3;
            }
            else if (speed > 10) {
                speed += 4;
            }
            else {
                speed += 5;
            }
        }
        System.out.println("Accelerate to: " + speed);
    }
}
