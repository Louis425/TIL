package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Main4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate xmas = LocalDate.of(today.getYear(),12,25);
        System.out.println(xmas);

        LocalDate eve = xmas.minusDays(1);
        System.out.println(eve);

        Period left = Period.between(today,xmas);
        System.out.println(left);

        System.out.println(left.getMonths()+"개월"+left.getDays()+"일");
    }
}
