package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = x + 10;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 4; i++) {
            int temp = y + 10;
            System.out.println(temp);
            x = y;
            y = temp;
        }
    }
}
