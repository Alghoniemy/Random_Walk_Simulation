package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int Step = 1;
        int RandomNumber = 0;
        String Direction = " ";
        int x = 0;
        int y = 0;

        while (Step <= 10) {
            RandomNumber = generate_random_number();
            if (direction(RandomNumber) == "F") {
                Direction = "Forward";
                y++;
            } else if (direction(RandomNumber) == "L") {
                Direction = "Left   ";
                x--;
            } else {
                Direction = "Right  ";
                x++;
            }

            System.out.println("Step : " + Step + " | Random Numbers : " + RandomNumber + " | Direction : "+ Direction + " | X Coordinate : "+ x + " | Y Coordinate : "+ y);
            Step++;
        }
    }


    public static int generate_random_number() {
        Random random_number = new Random();
        int RN = random_number.nextInt(10);
        return RN;

    }


    public static String direction(int x) {
        if (x >= 0 && x <= 4)
            return "F";
        else if (x >= 5 && x <= 7)
            return "L";
        else return "R";
    }
}
