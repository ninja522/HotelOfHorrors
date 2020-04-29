import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Lobby extends PanelBase {

    public Lobby(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if(frame.fromHell) {
    		frame.fromHell = false;
    		str = "You push the button and the doors close. The elevator shoots upwards and " +
    				"presses you to the floor with the movement. When the doors open again " +
    				"you see what appears to be a hotel lobby and front desk area";
    	}
    	else if (frame.hallEnd == 1) {
    		str = "The elevator brings you down to the first floor. The doors open " +
    				"on what looks to be a hotel lobby. There are a set of doors that lead farther " +
    				"into the building as well as a set that leads outside.";
    	}
    	else {
    		str = "Through those doors is what looks to be a hotel lobby. " +
    				"Off to one side is an elevator with several buttons" +
    				"There is currently no one at the desk.";
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Leave out the front door");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.ending = 10;
            	frame.changePanel(new Ending(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Go farther into the building.");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromLobby = true;
            	frame.changePanel(new Dining(frame));
            }
        });
        buttons.add(b2);
        JButton b14 = new JButton("Push the button marked 2");
        b14.setFont(font2);
        b14.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromLobby = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b14);
        JButton b15 = new JButton("Push the button marked 1");
        b15.setFont(font2);
        b15.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lobbyButton1 = true;
            	frame.changePanel(new Lobby(frame));
            }
        });
        buttons.add(b15);
        JButton b16 = new JButton("Push the unmarked button");
        b16.setFont(font2);
        b16.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new Hell(frame));
            }
        });
        buttons.add(b16);
        return buttons;
    }
}
