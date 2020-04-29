import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class ClosetDoor extends PanelBase {

    public ClosetDoor(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.outfit == 3) {
    		str = "You manage to get this door open after a minute. " +
    				"It is a closet. Inside the closet is a single coat seemingly " +
    				"slung on its hanger with little care as it seemed near ready to " +
    				"fall off. On the floor below the coat there is a large shoe box";
    	}
    	else if (frame.carrotBox) {
    		frame.carrotBox = false;
    		str = "You open the box and there are some carrots inside. They have a "+
    				"strange smell to them which prevents you from eating any. You close the box";
    	}
    	else if (frame.shockCoat) {
    		str = "You go to put on the coat, but before you can get it off the hanger, " +
    				"you feel an electric shock and pull your hand away. Clearly the coat " +
    				"does not wish to be worn by you.";
    	}
    	else if (frame.coatFixed && frame.yadraCard) {
    		str = "Inside the closet is a single coat hung nicely now. On the floor below it " +
    				"is the a large shoe box.";
    	}
    	else if (frame.coatFixed) {
    		frame.yadraCard = true;
    		str = "You fix the coat to be straightend on the hanger and a card falls out of the sleeve. " +
    				"It seems to be the business card for some magician named Yadra the great. " +
    				"There is a phone number written on the card.";
    	}
    	else {
    		str = "Upon opening the door closer to you, you find that is is a closet. " +
        		"Inside the closet is a single coat seemingly slung on its hanger " +
        		"with little care as it seems near ready to fall off. On the floor " +
        		"below the coat there is a large shoe box.";
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
    	if (frame.outfit != 3) {
    		if (!frame.coatFixed) {
    			JButton b1 = new JButton("Fix the coat on the hanger better.");
    			b1.setFont(font2);
    			b1.addActionListener(new ActionListener() {

    				@Override
    				public void actionPerformed(ActionEvent e) {
    					frame.coatFixed = true;
    					frame.changePanel(new ClosetDoor(frame));
    				}
    			});
    			buttons.add(b1);
    		}
    		if (!frame.shockCoat) {
    			JButton b2 = new JButton("Take the coat off the hanger and put it on.");
    			b2.setFont(font2);
    			b2.addActionListener(new ActionListener() {

    				@Override
    				public void actionPerformed(ActionEvent e) {
    					frame.shockCoat = true;
    					frame.changePanel(new ClosetDoor(frame));
    				}
    			});
    			buttons.add(b2);
    		}
    		if (!frame.carrotBox) {
    			JButton b3 = new JButton("Open the shoe box to see what's inside.");
    			b3.setFont(font2);
    			b3.addActionListener(new ActionListener() {

    				@Override
    				public void actionPerformed(ActionEvent e) {
    					frame.carrotBox = true;
    					frame.changePanel(new ClosetDoor(frame));
    				}
    			});
    			buttons.add(b3);
    		}
    	}
    	else {
    		JButton b3 = new JButton("Open the shoe box to see what's inside.");
			b3.setFont(font2);
			b3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.ending = 5;
					frame.changePanel(new Ending(frame));
				}
			});
			buttons.add(b3);
    	}
        JButton b4 = new JButton("Open the farther door");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	if (frame.outfit == 3){
            		frame.doorProblem = true;
                    frame.changePanel(new BunnyRoom(frame));
            	}
            	else {
            		frame.changePanel(new HallwayFromRoom(frame));
            	}
            }
        });
        buttons.add(b4);
        if (frame.outfit != 3) {
	        JButton b5 = new JButton("Examine the bedside table");
	        b5.setFont(font2);
	        b5.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.changePanel(new BedsideTable(frame));
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
        }
        JButton b7 = new JButton("Look out the window");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomWindow(frame));
            }
        });
        buttons.add(b7);
        if (frame.outfit != 3) {
		    JButton b8 = new JButton("Examine the picture");
		    b8.setFont(font2);
		    b8.addActionListener(new ActionListener() {
		
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	frame.changePanel(new RoomPicture(frame));
		        }
		    });
		    buttons.add(b8);
		    JButton b9 = new JButton("try to go back to sleep");
		    b9.setFont(font2);
		    b9.addActionListener(new ActionListener() {
		
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	frame.changePanel(new RoomSleep(frame));
		        }
		    });
		    buttons.add(b9);
        }
        else {
        	JButton b9 = new JButton("Try to go Back to Sleep");
            b9.setFont(font2);
            b9.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                	frame.ending = 3;
                	frame.changePanel(new Ending(frame));
                }
            });
            buttons.add(b9);
        }
        return buttons;
    }
}
