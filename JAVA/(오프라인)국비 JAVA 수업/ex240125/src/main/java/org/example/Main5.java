package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {
    public static void doA(){
       // BufferedWriter fw = null;
        Path file = Paths.get("a.txt");

        try(BufferedWriter fw = Files.newBufferedWriter(file))  {
         //   fw = Files.newBufferedWriter(file);
            fw.write("A");
            fw.write("Z");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            doA();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
