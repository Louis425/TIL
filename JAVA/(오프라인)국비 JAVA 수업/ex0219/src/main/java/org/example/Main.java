package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public Main(){
        fileWriter();
        fileRead();
    }

    private void fileRead() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.dat");
            int dat = fis.read();
            System.out.println(dat);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        while(true){
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println("테스트");
//        }
    }

    public void fileWriter(){
        try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            fos.write(7);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}