package Prac_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingPrac extends JFrame {

    private int k1 = 0, k2 = 0;

    private JButton button1 = new JButton("Ac Milan");

    private JButton button2 = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + k1 + " X " + k2);
    private JLabel scorer = new JLabel("Last Scorer: ");
    private JLabel winner = new JLabel("Winner: ");

    public SwingPrac() {

        super("Football match: Ac Milan VS Real Madrid");
        this.setBounds(500, 300, 400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(result, BorderLayout.CENTER);
        container.add(scorer,BorderLayout.SOUTH);
        container.add(winner, BorderLayout.NORTH);

        button1.addMouseListener(new ButtonEventListener1());
        container.add(button1, BorderLayout.WEST);
        button2.addMouseListener(new ButtonEventListener2());
        container.add(button2,BorderLayout.EAST);
        setVisible(true);

    }

    class ButtonEventListener1 implements MouseListener {
        public void mouseClicked(MouseEvent e)  {
            kPlus(1);
            result.setText("Result: " + k1 + " X " + k2);
            scorer.setText("Last Scorer: Ac Milan");
            if (k1 > k2) {
                winner.setText("Winner: Ac Milan");
            }
            else if (k1 == k2) {
                winner.setText("Winner: DRAW");
            }
            else {
                winner.setText("Winner: Real Madrid");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    class ButtonEventListener2 implements MouseListener {
        public void mouseClicked(MouseEvent e)  {
            kPlus(2);
            result.setText("Result: " + k1 + " X " + k2);
            scorer.setText("Last Scorer: Real Madrid");
            if (k1 > k2) {
                winner.setText("Winner: Ac Milan");
            }
            else if (k1 == k2) {
                winner.setText("Winner: DRAW");
            }
            else {
                winner.setText("Winner: Real Madrid");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public void kPlus(int n) {
        if (n == 1) k1++;
        else if (n == 2) k2++;
    }

    public static void main(String[] args) {

        SwingPrac ex1 = new SwingPrac();


    }
}