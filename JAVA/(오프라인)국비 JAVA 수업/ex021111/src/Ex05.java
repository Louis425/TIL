import java.util.Arrays;

/*
    String
    성적관리 프로그램
    번호  이름   국어 영어 수학
    [0]["홍길동"][100],[80],[90]
    [1]["이길동"][70],[90],[100]
    [2]["박길동"][80],[70],[200]
*/
public class Ex05 {
    public static void main(String[] args) {
        String[] student1 = {"홍길동", "80", "90","100"};
        String[] student2 = {"이길동", "70", "60","80"};
        String[] student3 = {"박길동", "100", "90","40"};

        //학생의 숫자, 학생들 국어 평균점수, 영어 평균점수, 수학평균점수
        //모든 점수의 평균점수 1,2,3등 구하기

        String[][] all = {student1,student2,student3};
        int sum = 0;  //모든 점수의 평균점수
        int a = 0;   // 국어 점수의 평균
        int b = 0;   // 영어 점수의 평균
        int c = 0;   // 수학 점수의 평균
        int d = 0;   // 모든 점수의 평균

        int student1_total[] = new int[all.length];

        int sum1 = 0;  //홍길동의 전체 점수의 평균
        int sum2 = 0;  //이길동의 전체 점수의 평균
        int sum3 = 0;  //박길동의 전체 점수의 평균




        System.out.println("학생들의 숫자: " + all.length + "명");


        for(int i=0; i<all.length; i++){

            a += Integer.parseInt(all[i][1]);
            b += Integer.parseInt(all[i][2]);
            c += Integer.parseInt(all[i][3]);

            d =a+b+c;

            for(int j=1; j< all[i].length; j++){
                student1_total[i] += Integer.parseInt(all[i][j]);
                sum1 = student1_total[0]/3;
                sum2 = student1_total[1]/3;
                sum3 = student1_total[2]/3;

            }
        }

        System.out.println("국어 점수의 평균 : " + a/all.length);
        System.out.println("영어 점수의 평균 : " + b/all.length);
        System.out.println("수학 점수의 평균 : " + c/all.length);
        System.out.println("모든 점수의 평균 : " + d/(all.length*3));

        System.out.println(Arrays.toString(student1_total));
        System.out.println(all[0][0] + " 점수의 평균 : " + sum1);
        System.out.println(all[1][0] + " 점수의 평균 : " + sum2);
        System.out.println(all[2][0] + " 점수의 평균 : " + sum3);

        System.out.println("너가 일등이야!!! " + (sum1 > sum2 && sum1 > sum3 ? all[0][0] : all[1][0] ));

        int total[] = {sum1, sum2, sum3};
        String name[] = new String[total.length];

        for(int i=0; i<total.length; i++){
            for(int j=0; j<total.length; j++){
                if(total[i] > total[j]) {
                    int tmp = total[i];
                    total[i] = total[j];
                    total[j] = tmp;
                }
            }
        }

        if(total[0]==sum1){
            name[0]=all[0][0];
            if(total[1]==sum2){
                name[1]=all[1][0];
                name[2]=all[2][0];
            }else if(total[1]==sum3) {
                name[1] = all[2][0];
                name[2] = all[1][0];
            }
        } else if(total[0]==sum2){
            name[0]=all[1][0];
            if(total[1]==sum1){
                name[1]=all[0][0];
                name[2]=all[2][0];
            }else if(total[1]==sum3) {
                name[1] = all[2][0];
                name[2] = all[0][0];
            }
        } else if(total[0]==sum3){
            name[0]=all[2][0];
            if(total[1]==sum2){
                name[1]=all[1][0];
                name[2]=all[0][0];
            }else if(total[1]==sum1) {
                name[1] = all[0][0];
                name[2] = all[1][0];
            }
        }
        System.out.println(Arrays.toString(total));
        System.out.println("1등 : " + name[0] + ", 2등 : " + name[1] + ", 3등 : " + name[2]);
    }
}
