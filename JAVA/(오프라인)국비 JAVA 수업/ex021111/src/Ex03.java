import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

/*      int a[] = {10,20,30};
        int b[] = {40,50,60};
        int [][] score = {a,b};*/

        int[] a = {90,80,100};
        int[][] score = {
                {10,20,30},
                {40,50,60,70}
        };

        System.out.println("score 의 길이는: " + score.length);
        System.out.println("score[0]의 길이는: " + score[0].length);
        System.out.println("score[1]의 길이는: " +score[1].length);

        score[1] = a;
        System.out.println("score[1]의 길이는: " +score[1].length);



        System.out.println(Arrays.toString(score));
    }
}
