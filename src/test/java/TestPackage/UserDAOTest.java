/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackage;

/**
 *
 * @author Student
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UserDAOTest {

    private UserDAO userDAO;

    @BeforeEach
    public void setup() {
        DatabaseInitializer.initialize();
        userDAO = new UserDAO();
    }

    @Test
    public void testAddAndRetrieveUsers() {
        userDAO.addUser("John", "john@example.com");
        userDAO.addUser("Alice", "alice@example.com");
        List<String> users = userDAO.getAllUsers();
        assertEquals(2, users.size());
        assertTrue(users.contains("John - john@example.com"));
        assertTrue(users.contains("Alice - alice@example.com"));
    }
}
