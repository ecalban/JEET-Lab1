/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wat.jeet.studentdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Student
 */

public class DatabaseInitilazier {

    private static final String DB_URL = "jdbc:h2:~/testdb";

    public static void initialize() {
        try {
            Class.forName("org.h2.Driver");

            try (Connection connection = DriverManager.getConnection(DB_URL, "sa", ""); Statement statement = connection.createStatement()) {

                String createTableSQL = """
CREATE TABLE IF NOT EXISTS users (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL
)
""";
                statement.execute(createTableSQL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
