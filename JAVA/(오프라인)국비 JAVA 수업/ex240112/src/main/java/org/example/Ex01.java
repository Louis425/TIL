package org.example;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import aa.bb.BB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex01 {
    public static void main(String[] args) throws Exception{
//        BB bb = new BB();
//        bb.doA();
//
//        bb.doB();
//        bb.doB();
//        bb.doB();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //int n = Integer.parseInt(br.readLine());
        //int z = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] ii = new int[m];
        int[] jj = new int[m];

        System.out.println(n + " " + m);

        for(int i=0; i<ii.length; i++){
            st = new StringTokenizer(br.readLine(), " ");

            ii[i] = Integer.parseInt(st.nextToken());
            jj[i] = Integer.parseInt(st.nextToken());

            System.out.println(ii[i] + " " + jj[i]);
            //bw.write(ii[i] + " " + jj[i] + "\t");

            System.out.println();
        }

        bw.close();
        br.close();


    }
}
