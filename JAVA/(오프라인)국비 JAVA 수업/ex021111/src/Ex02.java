public class Ex02 {
    public static void main(String[] args) {
        String a = "ABCDE";

        char[] ca = a.toCharArray();

        System.out.println(ca);
        System.out.println("ca[0]= " + ca[0]);

        for (int i=0; i<ca.length; i++){
            System.out.println(ca[i]);
        }
    }
}
