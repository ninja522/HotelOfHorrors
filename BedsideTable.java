import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

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
        if (frame.drawerCheck) {
        	str = str + " There is nothing of interest in the drawer.";
        }
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
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
        if(frame.yadraCard) {
	        JButton b2 = new JButton("Call the number from the card for Yadra.");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.changePanel(new Yadra(frame));
	            }
	        });
	        buttons.add(b2);
        }
        if (!frame.drawerCheck) {
	        JButton b3 = new JButton("Open the drawer");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.drawerCheck = true;
	            	frame.changePanel(new BedsideTable(frame));
	            }
	        });
	        buttons.add(b3);
        }
        JButton b4 = new JButton("Open the closer door");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new ClosetDoor(frame));
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
        JButton b6 = new JButton("Search the dresser");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new Dresser(frame));
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("Look out the window");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomWindow(frame));
            }
        });
        buttons.add(b7);
        JButton b8 = new JButton("Examine the picture");
        b8.setFont(font2);
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomPicture(frame));
            }
        });
        buttons.add(b8);
        JButton b9 = new JButton("Try to go back to sleep");
        b9.setFont(font2);
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomSleep(frame));
            }
        });
        buttons.add(b9);
        return buttons;
    }
}
