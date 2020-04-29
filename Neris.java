import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Neris extends PanelBase {

    public Neris(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.nerisState == 0){
	    	str = "You open the door to room 200 and your eyes are instantly drawn towards " +
	    			"the wolf eating in the middle of the room. She has what looks like a sheep " +
	    			"that was torn open, although it was eaten enough to be difficult to tell. " +
	    			"When you open the door the wolf licks her lips and leaves the sheep where " +
	    			"it is on the floor. She starts towards you at a quick pace.";
    	}
    	else if (frame.nerisState == 1){
	    	str = "You try to kick the wolf and it bites onto your leg and takes you to the ground.";
    	}
    	else{
    		if (frame.werewolf) {
    			str = "You kick the wolf off your leg and it yelps in pain. You then manage to get up " +
    					"and get through the doorway. You limp down the hallway and " +
    					"due to the wolf having to turn out of her room to catch up to you she is slowed " +
    					"and this gives you enough lead that she doesn’t just catch you outright " +
    					"despite your limping. " +
    					"You manage to reach the elevator and push the button to call it rapidly. " +
    					"You jump into the elevator and mash on the close door button. The doors are " +
    					"nearly closed when the wolf sticks its head into the elevator and they slowly " +
    					"start to open. It will soon be able to reach you.";
    		}
    		else {
    			str = "due to the wolf having to turn out of her room to catch up to you she is slowed " +
    					"and this gives you enough lead that she doesn’t just catch you outright. " +
    					"You manage to reach the elevator and push the button to call it rapidly. " +
    					"You jump into the elevator and mash on the close door button. The doors are " +
    					"nearly closed when the wolf sticks its head into the elevator and they slowly " +
    					"start to open. It will soon be able to reach you.";
    		}
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
    	if (frame.nerisState == 0) {
	        JButton b1 = new JButton("Run");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.nerisState = 2;
	            	frame.changePanel(new Neris(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Slam the door.");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 12;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
	        JButton b3 = new JButton("Kick the wolf");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.nerisState = 1;
	            	frame.werewolf = true;
	            	frame.changePanel(new Neris(frame));
	            }
	        });
	        buttons.add(b3);
    	}
    	else if (frame.nerisState == 1){
    		JButton b1 = new JButton("Kick it with your other foot");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.nerisState = 2;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Cry out for help");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 13;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
    	}
    	else if (frame.nerisState == 2){
    		JButton b1 = new JButton("Break the close Button");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	if (frame.werewolf) {
	            		frame.ending = 14;
	            	}
	            	else {
	            		frame.ending = 15;
	            	}
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Punch the wolf");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	if (frame.werewolf) {
	            		frame.ending = 16;
	            	}
	            	else {
	            		frame.ending = 17;
	            	}
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
    	}
        return buttons;
    }
}
