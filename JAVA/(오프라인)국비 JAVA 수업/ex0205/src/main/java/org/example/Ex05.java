package org.example;

enum Person{
    MAM, WOMAN
}
enum Animal{
    DOG, CAT;
}
public class Ex05 {
    public static void who(Person p){
        switch (p){
            case MAM:
                System.out.println("남성입니다.");
                break;
            case WOMAN:
                System.out.println("여성입니다.");
                break;
        }
    }
    public static void main(String[] args) {
        who(Person.MAM);

        // Animal 은 에러임
    //    who(Animal.DOG);
    }
}
