import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class HallwayFromRoom extends PanelBase {

    public HallwayFromRoom(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "You open the door farther from you and find that beyond it is a hallway " +
                "with other doors. Each door has a number above it. Turning you see that " + 
                "you have come from room 208. You...";
    }
    
    public JPanel constructButtonPanel() {
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(0, 3));
        buttons.setBackground(Color.white);
        JButton b1 = new JButton("Try the door to room 207");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Go back into room 208");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changePanel(new startRoom(frame));
            }
        });
        buttons.add(b2);
        JButton b3 = new JButton("Head down the hall to the left");
        b3.setFont(font2);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b3);
        JButton b4 = new JButton("Head down the hall to the right");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b4);
        JButton b5 = new JButton("Try the door to room 200");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b5);
        JButton b6 = new JButton("Try the door to room 201");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("Try the door to room 202");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b7);
        JButton b8 = new JButton("Try the door to room 203");
        b8.setFont(font2);
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b8);
        JButton b9 = new JButton("Try the door to room 204");
        b9.setFont(font2);
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b9);
        JButton b10 = new JButton("Try the door to room 205");
        b10.setFont(font2);
        b10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b10);
        JButton b11 = new JButton("Try the door to room 206");
        b11.setFont(font2);
        b11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b11);
        JButton b12 = new JButton("Try the door to room 209");
        b12.setFont(font2);
        b12.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b12);
        JButton b13 = new JButton("Try the door to room 210");
        b13.setFont(font2);
        b13.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b13);
        return buttons;
    }
}
