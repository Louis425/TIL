import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
    static String name;
    static String age;
    static String mbti;


    public static void mbtiA() {

        //드라이버 연결
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


        //계정연결
        String url = "jdbc:mysql://192.168.0.38:3306/2zo";
        String userName = "root";
        String password = "1234";

        Connection con = null;

        try {
        con = DriverManager.getConnection(url, userName, password);
        }catch (SQLException e){
            e.printStackTrace();
        }

        String spl = " INSERT INTO MEMBER "
                + " VALUES (?, ?, ?, ?) ";

        PreparedStatement pstm = null;

        try {
            //3. Query준비
            pstm = con.prepareStatement(spl);
            pstm.setInt(1, 0);
            pstm.setString(2,  name);
            pstm.setString(3,  age);
            pstm.setString(4,  mbti);

            //4. Query 실행 및 리턴
            int res = pstm.executeUpdate();
            if(res > 0) {
//                System.out.println("입력 성공");
            } else {
//                System.out.println("입력 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //5. DB종료
            try {
                pstm.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
