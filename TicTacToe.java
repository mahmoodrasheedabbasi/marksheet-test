import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {

    String player1 = JOptionPane.showInputDialog(null, "Enter name of Player1"),
            player2 = JOptionPane.showInputDialog(null, "Enter name of Player2");

    Font f;
    JFrame frame;
    JPanel panel;
    JButton[][] buttons = new JButton[3][3];

    boolean turn1 = true, turn2 = false, p1 = false, p2 = false;

    TicTacToe(){

        frame = new JFrame("Tic Tac Toe");
        panel = new JPanel(new GridLayout(3,3));
        f = new Font("Arail", Font.BOLD, 50);

        for (int i = 0; i < buttons.length; i++) {

            for (int j = 0; j < buttons[i].length; j++) {

                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(f);
                buttons[i][j].addActionListener(this);
                panel.add(buttons[i][j]);
            }
        }

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void check(){


        if ((buttons[0][0].getText() == "X" && buttons[0][1].getText() == "X" && buttons[0][2].getText() == "X") ||
            (buttons[1][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[1][2].getText() == "X") ||
            (buttons[2][0].getText() == "X" && buttons[2][1].getText() == "X" && buttons[2][2].getText() == "X") ||
            (buttons[0][0].getText() == "X" && buttons[1][0].getText() == "X" && buttons[2][0].getText() == "X") ||
            (buttons[0][1].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][1].getText() == "X") ||
            (buttons[0][2].getText() == "X" && buttons[1][2].getText() == "X" && buttons[2][2].getText() == "X") ||
            (buttons[0][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][2].getText() == "X") ||
            (buttons[2][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[0][2].getText() == "X") )
            p1 = true;

        if ((buttons[0][0].getText() == "O" && buttons[0][1].getText() == "O" && buttons[0][2].getText() == "O") ||
            (buttons[1][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[1][2].getText() == "O") ||
            (buttons[2][0].getText() == "O" && buttons[2][1].getText() == "O" && buttons[2][2].getText() == "O") ||
            (buttons[0][0].getText() == "O" && buttons[1][0].getText() == "O" && buttons[2][0].getText() == "O") ||
            (buttons[0][1].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][1].getText() == "O") ||
            (buttons[0][2].getText() == "O" && buttons[1][2].getText() == "O" && buttons[2][2].getText() == "O") ||
            (buttons[0][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][2].getText() == "O") ||
            (buttons[2][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[0][2].getText() == "O") )
                p2 = true;

        if (p1){

            JOptionPane.showMessageDialog(null, player1+" Won the game.");
            System.exit(0);
        }
        if (p2){

            JOptionPane.showMessageDialog(null, player2+" Won the game.");
            System.exit(0);
        }

        if (buttons[0][0].getText().length() == 1 && buttons[0][1].getText().length() == 1 &&
            buttons[0][2].getText().length() == 1 && buttons[1][0].getText().length() == 1 &&
            buttons[1][1].getText().length() == 1 && buttons[1][2].getText().length() == 1 &&
            buttons[2][0].getText().length() == 1 && buttons[2][1].getText().length() == 1 &&
            buttons[2][2].getText().length() == 1 && p1 == false && p2 == false){

            JOptionPane.showMessageDialog(null, "Game draw.");
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < buttons.length; i++) {

            for (int j = 0; j < buttons[i].length; j++) {

                if (e.getSource() == buttons[i][j]) {

                    if (turn1) {

                        buttons[i][j].setText("X");
                        buttons[i][j].setBackground(Color.RED);
                        turn1 = false;
                        turn2 = true;
                    }
                    else {

                        buttons[i][j].setText("O");
                        buttons[i][j].setBackground(Color.GREEN);
                        turn2 = false;
                        turn1 = true;
                    }

                    buttons[i][j].setEnabled(false);
                    check();
                }
            }
        }
    }
}