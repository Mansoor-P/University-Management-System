package mansoor.github.unimanage.ui;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///dbname", "root", "pwd");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
