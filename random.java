//package com.mkyong.example.test;
import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {

        System.out.print("enter the length:");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = t;

        for (int i = 0; i < t ; i++) {
            System.out.println(Random(s));
        }

    }

    private static int Random(int a) {

        Random r = new Random();
        return r.nextInt(a);

    }

}

