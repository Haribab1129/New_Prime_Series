/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.git_usages;

/**
 *
 * @author ICX
 */
public class Prime_Series {

    public static void main(String[] args) {
        int limit = 100;

        System.out.println("Prime numbers between 1 and " + limit + " are:");

        // loop through each number from 2 to limit
        for(int i = 2; i <= limit; i++) {
            boolean isPrime = true;

            // check if i is prime
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // print i if it is prime
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }

}
