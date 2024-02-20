package org.example;

public class Main2 {
    public static void main(String[] args) {
        Box<String> box1 = new SteelBox<String>();

        Box<Integer> box2 = EmptyBoxFactory.makeBox();
        Box<String> box3 = EmptyBoxFactory.makeBox();

//        Box<Integer> box4 = EmptyBoxFactory.peekBox(box2);
//        Box<String> box5 = EmptyBoxFactory.peekBox2(box3);

        EmptyBoxFactory.peekBox(box3, "오버로딩");

    }
}
