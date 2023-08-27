package com.Javadsa;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Rohit";
        char chr = 'q';

//        System.out.println(str);

        if (search(str,chr))
            System.out.println("Character Found!");
        else
            System.out.println("Character Not Found!");
    }
    static boolean search(String str, char chr){
        for (int i = 0; i < str.length(); i++){
            if (chr == str.charAt(i))
                return true;
        }
        return false;
    }
}
