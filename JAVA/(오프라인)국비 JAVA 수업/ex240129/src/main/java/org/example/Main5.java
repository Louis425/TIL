package org.example;

class EBox<T extends Number>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class Main5 {
    public static void main(String[] args) {
        EBox<Integer> eBox1 = new EBox<>();
        eBox1.setT(100);
     //   eBox1.setT(:"sdfsdf");
        // eBox1 출력하면 주소값 만 나온다.
        System.out.println(eBox1);
        System.out.println(eBox1.getT());
    }

}
