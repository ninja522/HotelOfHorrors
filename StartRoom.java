import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class StartRoom extends PanelBase {
    
    public StartRoom(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.fromPicture) {
    		str = "You jump back from the picture and the picture stops moving.";
    		frame.fromPicture = false;
    	}
    	else if (frame.fromPicture2) {
    		str = "You head through the floating square and arrive back in the " +
    				"room you had been in before. Nothing seems to have changed.";
    		frame.fromPicture2 = false;
    	}
    	else if (frame.fromHall) {
    		str = "You walk back into room 208.";
    	}
    	else {
    		str = "You awaken to find yourself in a fairly small room. You are lying on " +
                "a bed but have no memory of how you got there. The walls are blank save " +
                "for a lone picture of a beach with a sail boat in the distance. There is " +
                "a bedside table, dresser, and one window as well as two doors in the room. " +
                "One door is closer to you than the other. You...";
    	}
    	return str;
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
        JButton b6 = new JButton("Examine the Picture");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomPicture(frame));
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("Try to go Back to Sleep");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomSleep(frame));
            }
        });
        buttons.add(b7);
        return buttons;
    }
}
