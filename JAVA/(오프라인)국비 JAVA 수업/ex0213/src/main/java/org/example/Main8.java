package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main8 {
    public static void main(String[] args) {

        IntFunction<String> stringIntFunction = value -> value+"";
        String result = stringIntFunction.apply(10);
        System.out.println(result);
    }
}
