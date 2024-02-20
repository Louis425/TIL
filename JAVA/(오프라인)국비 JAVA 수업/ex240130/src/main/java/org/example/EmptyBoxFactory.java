package org.example;

public class EmptyBoxFactory {
    public static <T> Box<T> makeBox(){
        Box<T> box = new Box<T>();
        return box;
    }

//    public static <T> void peekBox(Box<T> box){
//        System.out.println(box);
//    }
//
//    public static void peekBox2(Box<Object> box){
//        System.out.println(box);
//    }
    public static void peekBox(Box<?> box, String a){
        System.out.println(box);
    }
    public static void outBox(Box <? extends Toy> box, Toy n){
        Toy outbox = box.getObj();
        System.out.println(outbox);
        // extends 는 get 만 가능해서 set 안됨
    //    box.setObj(new Toy());
    }

    public static void inBox(Box <? super Toy> box, Toy n){
        // extends 는 set 만 가능해서 get 안됨
        //Toy inbox = box.getObj();
        //System.out.println(inbox);

        box.setObj(new Toy());
    }


}
