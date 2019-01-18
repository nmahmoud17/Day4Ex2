package com.company;

public class Main {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int i;
        int j[] = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (i = 2050; i<max; i++) {
                if(i % j == 0 ) {
                    System.out.println(j);
            }


        }
    }
}
