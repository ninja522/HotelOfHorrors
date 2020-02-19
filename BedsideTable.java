import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BedsideTable extends PanelBase {
    
    public BedsideTable(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        String str = "The bedside table has a lamp and phone on it. There is also a drawer in it.";
        if (frame.bedsideLamp) {
            str = str + " Currently the lamp is on.";
        }
        else {
            str = str + " Currently the lamp is off.";
        }
        return str;
    }
    
    public JPanel constructButtonPanel() {
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(0, 3));
        buttons.setBackground(Color.white);
        if (frame.bedsideLamp){
            JButton b1 = new JButton("Turn off the lamp");
            b1.setFont(font2);
            b1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.bedsideLamp = false;
                    frame.changePanel(new BedsideTable(frame));
                }
            });
            buttons.add(b1);
        }
        else {
            JButton b1 = new JButton("Turn on the lamp");
            b1.setFont(font2);
            b1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.bedsideLamp = true;
                    frame.changePanel(new BedsideTable(frame));
                }
            });
            buttons.add(b1);
        }
        JButton b2 = new JButton("Check the phone");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b2);
        JButton b3 = new JButton("Open the drawer");
        b3.setFont(font2);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b3);
        JButton b4 = new JButton("Open the closer door");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b4);
        JButton b5 = new JButton("Open the farther door");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b5);
        JButton b6 = new JButton("examine the dresser");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("look out the window");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b7);
        JButton b8 = new JButton("look closer at the picture");
        b8.setFont(font2);
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b8);
        JButton b9 = new JButton("Try to go back to sleep");
        b9.setFont(font2);
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b9);
        return buttons;
    }
}
