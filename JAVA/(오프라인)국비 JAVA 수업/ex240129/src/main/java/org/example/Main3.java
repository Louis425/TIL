package org.example;

class DBox<L,R, T>{
    private L l;
    private R r;
    private T t;

    public DBox(L l, R r, T t) {
        this.l = l;
        this.r = r;
        this.t = t;
    }

    @Override
    public String toString() {
        return "DBox{" +
                "l=" + l +
                ", r=" + r +
                ", t=" + t +
                '}';
    }
}

public class Main3 {
    public static void main(String[] args) {
        DBox<String, Integer,String> dbox = new DBox<>("더블박스",10, "sdf");
        System.out.println(dbox);
    }
}
