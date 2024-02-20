package org.example;

class Outer{
    private static int num = 0;
    public static class Nested1{
        public void add(int n){ num+=n; }
    }
    public static class Nested2{
        public int get(){
            int a = 10;
            return num + a;
        }
        public void doPrint(){
            System.out.println(num);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Outer.Nested1 ns1 = new Outer.Nested1();
        Outer.Nested2 ns2 = new Outer.Nested2();

        ns1.add(100);
        System.out.println(ns2.get());
        ns2.doPrint();
    }
}