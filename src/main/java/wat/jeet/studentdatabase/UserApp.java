/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wat.jeet.studentdatabase;
/**
 *
 * @author Student
 */
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UserApp {

    private final UserDAO userDAO;

    public UserApp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void launch() {
        JFrame frame = new JFrame("User Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JButton addButton = new JButton("Add User");
        JTextArea userList = new JTextArea(10, 30);
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            userDAO.addUser(name, email);
            updateUserList(userList);
        });
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(nameField, BorderLayout.NORTH);
        panel.add(emailField, BorderLayout.CENTER);
        panel.add(addButton, BorderLayout.SOUTH);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(new JScrollPane(userList), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void updateUserList(JTextArea userList) {
        List<String> users = userDAO.getAllUsers();
        userList.setText("");
        users.forEach(user -> userList.append(user + "\n"));
    }

    public static void main(String[] args) {
        DatabaseInitializer.initialize();
        UserDAO userDAO = new UserDAO();
        new UserApp(userDAO).launch();
    }
}
