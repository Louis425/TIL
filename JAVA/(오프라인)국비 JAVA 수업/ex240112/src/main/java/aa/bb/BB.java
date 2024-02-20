package aa.bb;

import java.util.Scanner;

public class BB {
    public void doA(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void doB(){
        for(int i=0; i<10; i++){
            System.out.print(i);
        }
    }
}
