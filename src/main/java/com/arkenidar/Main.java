package com.arkenidar;

public class Main {
    public static void main(String[] args) {
        minAndMaxTesting();
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