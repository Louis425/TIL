package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\javastudy\\PathDemo.java");

        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        Path curpath = Paths.get("");

        if(curpath.isAbsolute())
            System.out.println(curpath);
        else{
            String temp = curpath.toAbsolutePath().toString();
            System.out.println(temp);
        }
//상대경로
        try(FileOutputStream fos = new FileOutputStream("aa.dat")) {
            //절대경로
            //"D:\Students\java_work\ex0220\aa.dat"
            fos.write(10);
            fos.write(20);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}