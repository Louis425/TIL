package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main2 {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("aa.pptx");
                FileOutputStream fos = new FileOutputStream("bb.pptx");
        ){
            byte[] buf = new byte[1024];
            int data;
            while(true){
                data = fis.read(buf);
                if(data==-1){
                    break;
                }
                fos.write(buf,0,data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
