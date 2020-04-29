import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class HallwayFromRoom extends PanelBase {

    public HallwayFromRoom(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if(frame.fromHell) {
    		frame.fromHell = false;
    		str = "You push the button and the doors close. The elevator shoots upwards and " +
    				"presses you to the floor with the movement. When the doors open again " +
    				"you see the second floor again.";
    	}
    	else if (frame.lockedDoor) {
    		str = "That door is locked and you can't get in.";
    		frame.lockedDoor = false;
    	}
    	else if (frame.fromLobby) {
    		frame.fromLobby = false;
    		frame.hallEnd = 1;
    		str = "The elevator takes you back up to the 2nd floor.";
    	}
    	else if (frame.fromStairs) {
    		frame.fromStairs = false;
    		frame.hallEnd = 2;
    		str = "You take the stairs back up to the 2nd floor.";
    	}
    	else if (frame.hallButton2) {
    		frame.hallButton2 = false;
    		str = "The doors close and open again since you are already on floor 2";
    	}
    	else if (frame.hallEnd == 1) {
    		str = "There is an Elevator at this end of the hall.";
    	}
    	else if (frame.hallEnd == 2) {
    		str = "There are stairs at this end of the hall.";
    	}
    	else {
    		str = "You open the door farther from you and find that beyond it is a hallway " +
                    "with other doors. Each door has a number above it. Turning around, you see that " + 
                    "you have come from room 208. You...";
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
    	if (frame.hallEnd == 1) {
            JButton b14 = new JButton("Push the button marked 2");
            b14.setFont(font2);
            b14.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                	frame.hallButton2 = true;
                	frame.changePanel(new HallwayFromRoom(frame));
                }
            });
            buttons.add(b14);
            JButton b15 = new JButton("Push the button marked 1");
            b15.setFont(font2);
            b15.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
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
    	}
    	if (frame.hallEnd == 2) {
    		JButton b14 = new JButton("Go down the stairs");
            b14.setFont(font2);
            b14.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                	frame.changePanel(new Dining(frame));
                }
            });
            buttons.add(b14);
    	}
        JButton b1 = new JButton("Try the door to room 207");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.captureFrom = 2;
            	frame.changePanel(new Captured(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Go back into room 208");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromHall = true;
                frame.changePanel(new StartRoom(frame));
            }
        });
        buttons.add(b2);
        if (frame.hallEnd != 1) {
	        JButton b3 = new JButton("Head down the hall to the left");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.hallEnd = 1;
	            	frame.changePanel(new HallwayFromRoom(frame));
	            }
	        });
	        buttons.add(b3);
        }
        if (frame.hallEnd != 2) {
	        JButton b4 = new JButton("Head down the hall to the right");
	        b4.setFont(font2);
	        b4.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.hallEnd = 2;
	            	frame.changePanel(new HallwayFromRoom(frame));
	            }
	        });
	        buttons.add(b4);
        }
        JButton b5 = new JButton("Try the door to room 200");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new Neris(frame));
            }
        });
        buttons.add(b5);
        JButton b6 = new JButton("Try the door to room 201");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("Try the door to room 202");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b7);
        JButton b8 = new JButton("Try the door to room 203");
        b8.setFont(font2);
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b8);
        JButton b9 = new JButton("Try the door to room 204");
        b9.setFont(font2);
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b9);
        JButton b10 = new JButton("Try the door to room 205");
        b10.setFont(font2);
        b10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b10);
        JButton b11 = new JButton("Try the door to room 206");
        b11.setFont(font2);
        b11.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b11);
        JButton b12 = new JButton("Try the door to room 209");
        b12.setFont(font2);
        b12.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b12);
        JButton b13 = new JButton("Try the door to room 210");
        b13.setFont(font2);
        b13.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.lockedDoor = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b13);
        return buttons;
    }
}
