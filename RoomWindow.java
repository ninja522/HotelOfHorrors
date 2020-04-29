import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class RoomWindow extends PanelBase {

    public RoomWindow(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "It is hard to see what is outside as when you approach" +
        		" the window you realize it is dark outside. There appear " +
        		"to be a large number of trees around and the sky is filled " +
        		"with clouds; however, the moon light shines brightly on the " +
        		"landscape below. You find that you are on the second story of the building.";
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Jump out the window");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	if (frame.outfit == 3) {
            		frame.ending = 4;
            	}
            	else {
            		frame.ending = 2;
            	}
            	frame.changePanel(new Ending(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Open the closer door");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new ClosetDoor(frame));
            }
        });
        buttons.add(b2);
        JButton b3 = new JButton("Open the farther door");
        b3.setFont(font2);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	if (frame.outfit == 3) {
            		frame.doorProblem = true;
            		frame.changePanel(new BunnyRoom(frame));
            	}
            	else {
            		frame.changePanel(new HallwayFromRoom(frame));
            	}
            }
        });
        buttons.add(b3);
        if (frame.outfit != 3) {
        	JButton b4 = new JButton("Examine the bedside table");
        	b4.setFont(font2);
        	b4.addActionListener(new ActionListener() {

        		@Override
        		public void actionPerformed(ActionEvent e) {
        			frame.changePanel(new BedsideTable(frame));
        		}
        	});
        	buttons.add(b4);
        	JButton b5 = new JButton("Search the dresser");
        	b5.setFont(font2);
        	b5.addActionListener(new ActionListener() {

        		@Override
        		public void actionPerformed(ActionEvent e) {
        			frame.changePanel(new Dresser(frame));
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
        	JButton b7 = new JButton("Try to go back to sleep");
        	b7.setFont(font2);
        	b7.addActionListener(new ActionListener() {

        		@Override
        		public void actionPerformed(ActionEvent e) {
        			frame.changePanel(new RoomSleep(frame));
        		}
        	});
        	buttons.add(b7);
        }
        else {
        	JButton b7 = new JButton("Try to go Back to Sleep");
            b7.setFont(font2);
            b7.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                	frame.ending = 3;
                	frame.changePanel(new Ending(frame));
                }
            });
            buttons.add(b7);
        }
        return buttons;
    }
}
