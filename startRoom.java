import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class startRoom extends PanelBase {
    
    public startRoom(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "You awaken to find yourself in a fairly small room. You are laying on " +
                "a bed but have no memory of how you got there. The walls are blank save " +
                "for a lone picture of a beach with a sail boat in the distance. There is " +
                "a bedside table, dresser, and one window as well as two doors in the room. " +
                "One door is closer to you than the other. You...";
    }
    
    public JPanel constructButtonPanel() {
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(0, 3));
        buttons.setBackground(Color.white);
        JButton b1 = new JButton("Open the closer door.");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Open the farther door.");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b2);
        JButton b3 = new JButton("Examine the bedside Table");
        b3.setFont(font2);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changePanel(new BedsideTable(frame));
            }
        });
        buttons.add(b3);
        JButton b4 = new JButton("Examine the dresser");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b4);
        JButton b5 = new JButton("look out the window");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b5);
        JButton b6 = new JButton("Examine the Painting");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("Go Back to Sleep");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        buttons.add(b7);
        return buttons;
    }
}
