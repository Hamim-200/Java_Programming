
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DecimalFormat;

public class MoneyManagementApp {

    public static void main(String[] args) {
        new LoginFrame().createGUI();
    }
}

class LoginFrame {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public void createGUI() {
        frame = new JFrame("Money Management App - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(240, 248, 255)); // Light blue color

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Money Management App");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        panel.add(titleLabel, c);

        JLabel usernameLabel = new JLabel("Username:");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        panel.add(usernameLabel, c);

        usernameField = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(usernameField, c);

        JLabel passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        panel.add(passwordLabel, c);

        passwordField = new JPasswordField(15);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(passwordField, c);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (checkLogin(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                    frame.dispose();
                    new HomeFrame(username).createGUI();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password!");
                }
            }
        });
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        panel.add(loginButton, c);

        JButton registerButton = new JButton("Registration");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new RegistrationFrame().createGUI();
            }
        });
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        panel.add(registerButton, c);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public boolean checkLogin(String username, String password) {
        try {
            String[] userInfo = FileManager.readUserInfo();
            for (String info : userInfo) {
                String[] parts = info.split(":");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }
}

class RegistrationFrame {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField jobField;

    public void createGUI() {
        frame = new JFrame("Money Management App - Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(240, 248, 255)); // Light blue color

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Registration");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        panel.add(titleLabel, c);

        JLabel usernameLabel = new JLabel("Username:");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        panel.add(usernameLabel, c);

        usernameField = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(usernameField, c);

        JLabel passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        panel.add(passwordLabel, c);

        passwordField = new JPasswordField(15);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(passwordField, c);

        JLabel jobLabel = new JLabel("Job:");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        panel.add(jobLabel, c);

        jobField = new JTextField(15);
        c.gridx = 1;
        c.gridy = 3;
        panel.add(jobField, c);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        panel.add(registerButton, c);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void register() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String job = jobField.getText();

        try {
            FileWriter writer = new FileWriter("register.txt", true);
            writer.write(username + ":" + password + ":" + job + "\n");
            writer.close();
            JOptionPane.showMessageDialog(frame, "Registration successful! You can now log in.");
            frame.dispose();
            new LoginFrame().createGUI();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error registering user!");
            ex.printStackTrace();
        }
    }
}

class HomeFrame {

    private JFrame frame;
    private JTextField incomeField;
    private JTextField expenseField;
    private JTextField monthField;
    private JTextField remainingField;
    private String username;

    public HomeFrame(String username) {
        this.username = username;
    }

    public void createGUI() {
        frame = new JFrame("Money Management App - Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(240, 248, 255)); // Light blue color

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Money Management");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        panel.add(titleLabel, c);

        JLabel incomeLabel = new JLabel("Total Income:");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        panel.add(incomeLabel, c);

        incomeField = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(incomeField, c);

        JLabel expenseLabel = new JLabel("Total Expense:");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        panel.add(expenseLabel, c);

        expenseField = new JTextField(15);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(expenseField, c);

        JLabel monthLabel = new JLabel("Month:");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        panel.add(monthLabel, c);

        monthField = new JTextField(15);
        c.gridx = 1;
        c.gridy = 3;
        panel.add(monthField, c);

        JLabel remainingLabel = new JLabel("Remaining:");
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        panel.add(remainingLabel, c);

        remainingField = new JTextField(15);
        remainingField.setEditable(false);
        c.gridx = 1;
        c.gridy = 4;
        panel.add(remainingField, c);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        panel.add(calculateButton, c);

        JButton saveButton = new JButton("Save Data");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 2;
        panel.add(saveButton, c);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void calculate() {
        double income = Double.parseDouble(incomeField.getText());
        double expense = Double.parseDouble(expenseField.getText());
        String month = monthField.getText();

        DecimalFormat df = new DecimalFormat("#.##");
        double remaining = income - expense;

        remainingField.setText(df.format(remaining));
    }

    public void saveData() {
        double income = Double.parseDouble(incomeField.getText());
        double expense = Double.parseDouble(expenseField.getText());
        String month = monthField.getText();

        DecimalFormat df = new DecimalFormat("#.##");
        double remaining = income - expense;

        String data = username + "'s " + month + " Income: " + df.format(income) + " Expense: "
                + df.format(expense) + " Remaining: " + df.format(remaining) + "\n";
        try {
            FileWriter writer = new FileWriter("money_data.txt", true);
            writer.write(data);
            writer.close();
            JOptionPane.showMessageDialog(frame, "Data saved successfully!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error saving data!");
            ex.printStackTrace();
        }
    }
}

class FileManager {

    public static String[] readUserInfo() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("register.txt"));
        String line;
        StringBuilder data = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            data.append(line).append("\n");
        }
        reader.close();
        return data.toString().split("\n");
    }
}
