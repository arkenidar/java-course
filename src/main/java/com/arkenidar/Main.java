package com.arkenidar;

import java.util.Scanner;
public class Main {
    private static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        squaresTesting();
    }

    public static void squaresTesting(){
        int n=3;
        System.out.println("square: integer?"); n=in.nextInt();
        if(n<0) n=-n;
        int square=0;
        int next=1;
        for(int i=1; i<=n; i++){
            // square(n)
            square+=next;
            next+=2;
        }
        System.out.printf("square(%d): %d",n,square);
    }

    public static void fibonacciTesting(){
        int n=45;
        System.out.println("fibonacci: integer?"); n=in.nextInt();
        if(n<0) return;
        int fib=-1;
        Integer prev1=0,prev2=1;
        for(int i=0; i<=n; i++){
            // fib(n)
            if(i<=1) fib=i;
            else{
                fib=prev1+prev2;
                prev1=prev2;
                prev2=fib;
            }
        }
        System.out.printf("fibonacci(%d): %d",n,fib);
    }

    public static void minAndMaxTesting(){
        String line="3,2,1,-1";
        
        String[] split = line.split(",");

        Integer min=null, max=null;
        for(String is: split){
            int i=Integer.parseInt(is);
            if(min==null) min=i;
            if(max==null) max=i;
            if(i<min) min=i;
            if(i>max) max=i;
        }
        System.out.printf("min: %d ; max: %d",min,max);
    }
    
    public static void anagramTesting() {
        String pairs[][] = new String[][]{
                {"aba", "baa"},
                {"ab", "aa"},
                {"aabbb", "babab"}
        };
        for (String pair[] : pairs)
            System.out.printf("isAnagram(%s,%s): %b\n", pair[0], pair[1], isAnagram(pair[0], pair[1]));
    }

    public static boolean isAnagram(String str1, String str2) {
        return new Anagram(str1).equals(new Anagram(str2));
    }
}