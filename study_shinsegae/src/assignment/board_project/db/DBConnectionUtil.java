package assignment.board_project.db;

import static assignment.board_project.db.ConnectionConst.PASSWORD;
import static assignment.board_project.db.ConnectionConst.URL;
import static assignment.board_project.db.ConnectionConst.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

  public static Connection getConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }catch (SQLException e){
      throw new IllegalStateException(e.getMessage());
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }


  }

}