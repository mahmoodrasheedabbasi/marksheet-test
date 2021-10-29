import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksheetTest implements ActionListener {

    JFrame win;
    JLabel javaMarksLabel;
    JTextField javaMarksField;
    JButton calculateButton;

    public MarksheetTest(){

        win = new JFrame("Marksheet");

        win.setLayout(null);

        javaMarksLabel = new JLabel("Enter Java Marks: ");
        javaMarksLabel.setBounds(100, 20, 200, 50);

        javaMarksField = new JTextField("My name is Nasir", 10);
        javaMarksField.setBounds(350, 20,200, 50);


        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
//        calculateButton.setBounds(400, 200, 200, 50);
        calculateButton.setSize(200, 50);
        calculateButton.setLocation(400, 200);

        win.add(javaMarksLabel);
        win.add(javaMarksField);
        win.add(calculateButton);

        win.setSize(800, 600);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setVisible(true);
    }

    public static void main(String[] args) {

        MarksheetTest marksheet = new MarksheetTest();
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == calculateButton){

            if (e.getSource() == calculateButton){

                javaMarksField.setText("");
            }
        }
    }
}
