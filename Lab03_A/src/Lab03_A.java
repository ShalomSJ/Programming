import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab03_A extends JFrame {

    private JTextField studentNumberField;
    private JTextField markField;

    public Lab03_A() {
        setTitle("Student Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel studentNumberLabel = new JLabel("Student Number:");
        panel.add(studentNumberLabel);

        studentNumberField = new JTextField();
        panel.add(studentNumberField);

        JLabel markLabel = new JLabel("Mark:");
        panel.add(markLabel);

        markField = new JTextField();
        panel.add(markField);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String studentNumber = studentNumberField.getText();
                String mark = markField.getText();

                int markInt=Integer.parseInt(mark);
                String grade;

                if (markInt >= 75 && markInt <= 100) {
                    grade = "Distinction";
                } else if (markInt >= 70 && markInt <= 74) {
                    grade = "Merit";
                } else if (markInt >= 60 && markInt <= 69) {
                    grade = "Credit";
                } else if (markInt >= 50 && markInt <= 59) {
                    grade = "Pass";
                } else if (markInt >= 0 && markInt <= 49) {
                    grade = "Fail";
                } else {
                    grade = "Out of Grade";
                }

                JOptionPane.showMessageDialog(Lab03_A.this,"Grade: " + grade);
            }
        });
        panel.add(okButton);

                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                });
                panel.add(cancelButton);

                add(panel);

                setVisible(true);

    }

        public static void main(String[]args) {
             new Lab03_A();

    }

}

