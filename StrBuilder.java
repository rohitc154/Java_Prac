package com.Javadsa;

public class StrBuilder {
    public static void main(String[] args) {
//        String series = new String("");
        StringBuilder build = new StringBuilder();

        for (int i=0; i < 26; i++ ){
//            series += (char)('a' + i);
            build.append((char)('a' + i));
        }
//        System.out.println(series);
        System.out.println(build);
    }
}
