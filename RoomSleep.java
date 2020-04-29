import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class RoomSleep extends PanelBase {
    
    public RoomSleep(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "You lay back in bed and try to sleep but find yourself unable to.";
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Open the closer door.");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new ClosetDoor(frame));
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
        JButton b4 = new JButton("Search the dresser");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new Dresser(frame));
            }
        });
        buttons.add(b4);
        JButton b5 = new JButton("Look out the window");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomWindow(frame));
            }
        });
        buttons.add(b5);
        JButton b6 = new JButton("Examine the picture");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomPicture(frame));
            }
        });
        buttons.add(b6);
        return buttons;
    }
}
