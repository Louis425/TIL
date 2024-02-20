import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] lottoNumber = new int[7];

        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = (int)(Math.random() * 45) + 1;

            for(int j=0; j< i; j++){
                if(lottoNumber[i] == lottoNumber[j]){
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(lottoNumber));

        for(int i=0; i<lottoNumber.length; i++){
            for(int j=0; j<lottoNumber.length; j++){
                if(lottoNumber[i] < lottoNumber[j]){
                    int tmp = lottoNumber[i];
                    lottoNumber[i] = lottoNumber[j];
                    lottoNumber[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(lottoNumber));

    }
}