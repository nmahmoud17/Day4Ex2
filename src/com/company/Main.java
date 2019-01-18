package com.company;

public class Main {

//    public static void main(String[] args) {
//        int max = Integer.MAX_VALUE;
//        int i;
//        int j[] = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        for (i = 2050; i<max; i++) {
//                if(i % j == 0 ) {
//                    System.out.println(j);
//            }
//
//
//        }

    int max = Integer.MAX_VALUE;
    int i;

    for(i=1;i<max; i++){

        if (i % 10 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0
                && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 &&
                i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
            System.out.println(i);
            break;
        }
    }

}
//10 11 12 13 14 15 16 17 18 19 20



