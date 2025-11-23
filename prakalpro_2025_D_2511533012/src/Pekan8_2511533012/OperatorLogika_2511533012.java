package Pekan8_2511533012;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OperatorLogika_2511533012 extends JFrame {

    private JComboBox<String> inputA;
    private JComboBox<String> inputB;
    private JTextArea outputArea;
    private JButton btnHitung;

    public OperatorLogika_2511533012() {
    	getContentPane().setBackground(new Color(128, 0, 255));

        setTitle("Demo Operator Logika");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());

        String[] pilihan = {"true", "false"};
        inputA = new JComboBox<>(pilihan);
        inputB = new JComboBox<>(pilihan);

        btnHitung = new JButton("Hitung");

        outputArea = new JTextArea(8, 30);
        outputArea.setEditable(false);

        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean A = Boolean.parseBoolean((String) inputA.getSelectedItem());
                boolean B = Boolean.parseBoolean((String) inputB.getSelectedItem());

                StringBuilder hasil = new StringBuilder();
                hasil.append("A = " + A + "\n");
                hasil.append("B = " + B + "\n\n");
                hasil.append("A AND B = " + (A && B) + "\n");
                hasil.append("A OR B = " + (A || B) + "\n");
                hasil.append("NOT A = " + (!A) + "\n");
                hasil.append("NOT B = " + (!B) + "\n");

                outputArea.setText(hasil.toString());
            }
        });

        JLabel label = new JLabel("Pilih nilai A:");
        label.setForeground(new Color(255, 255, 255));
        label.setBackground(new Color(255, 255, 255));
        getContentPane().add(label);
        getContentPane().add(inputA);
        JLabel label_1 = new JLabel("Pilih nilai B:");
        label_1.setForeground(new Color(255, 255, 255));
        getContentPane().add(label_1);
        getContentPane().add(inputB);
        getContentPane().add(btnHitung);
        getContentPane().add(outputArea);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OperatorLogika_2511533012();
    }
}
