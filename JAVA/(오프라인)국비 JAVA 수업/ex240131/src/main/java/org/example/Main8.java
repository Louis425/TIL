package org.example;

import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) {
        String a = "오후:08:22";

        StringTokenizer st = new StringTokenizer(a,":");
        while(st.hasMoreElements()){
            String temp = st.nextToken();
            System.out.println(temp);
        }

        System.out.println();

        String[] arr =  a.split(":");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
