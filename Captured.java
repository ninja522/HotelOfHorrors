import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Captured extends PanelBase {

    public Captured(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.free && frame.captureSeq == 3) {
    		str = "You manage to sneak out the double doors without her noticing. These doors lead you to the " +
    				"hotel lobby. Currently the small man sitting behind the desk watching the front door.";
    	}
    	else if (frame.free && frame.captureSeq == 2) {
    		str = "You hide among the suits of armor. A group of four people enter the room: " +
    				"a rough looking female in rag like clothes, a beautiful woman in very revealing " +
    				"clothes, a well tanned man with dark hair and fine clothes, and a midget of a " +
    				"man with bright red hair. Upon seeing you missing from the ropes the tanned man " +
    				"looks furious. “This is what I get for expecting you people to tie ropes properly!” " +
    				"He picks up the table and flings it at the wall rug on the other side of the room, " +
    				"it shattering into a million pieces. ";
    		if (frame.gender == 0) {
    			str = str + "“Find him and kill him, eat him, whatever ";
    		}
    		else if (frame.gender == 1) {
    			str = str + "“Find her and kill her, eat her, whatever ";
    		}
    		else {
    			str = str + "“Find them and kill them, eat them, whatever ";
    		}
    		str = str + "I don’t care at this point!” The man’s frustrations were clearly placed in the " +
    		"incompetence of the people he worked with, but unfortunately he was taking it out on you. " +
    		"The group splits up, the tanned man and beautiful woman heading back out the " +
    		"single door they had come in. The midget heads out the double doors and the " +
    		"rough woman stays in this room sniffing the air a little and looking around.";
    	}
    	else if (frame.captureSeq == 2) {
    		if (frame.struggling) {
    			str = "You are unable to break your bonds before the group enters the room. " +
    					"“Well now, it seems someone is awake.” Says the voice that you had " +
    					"heard them call Aaron. He was a short man with bright red hair. Beside " +
    					"him was a rough looking female in rag like clothes, a beautiful woman in " +
    					"very revealing clothes, and a well tanned man with dark hair and fine clothes. " +
    					"The tanned man walks up to you and slaps you across the face. “Stop struggling " +
    					"or I’ll let Neris have her way with you.” Neris, the rough woman, " +
    					"jumps for joy. “Keep struggling!” She says excitedly.";
    		}
    		else {
    			if (frame.firstEnter){
    				str = "You wait for the group to come in and the four of them do after a minute. " +
    					"There is a rough looking female in rag like clothes, a beautiful woman in very " +
    					"revealing clothes, a well tanned man with dark hair and fine clothes, and a midget " +
    					"of a man with bright red hair. The tanned man walks up to you. “T";
    			}
    			else {
    				str = "“Good. Now, t";
    			}
    			str = str + "ell me, how did you get here?”"; 
    		}
    	}
    	else if (frame.free && frame.captureSeq == 1) {
    		str = "You manage to slip out of the ropes after a minute. Now you can get a " +
    				"better look around the room you are in there are a few suits of armor along " +
    				"one wall and an elegant carpet along another. In the middle is the table you " +
    				"were tied to, which is a long and old table with Twelve chairs. " +
    				"There are two doors that lead into the room, one set of double doors and then " +
    				"opposite of those is a single door. The arguing sounds to be getting closer and " +
    				"the sound of someone starting to open the single door is heard.";
    	}
    	else if (frame.captureSeq == 1){
    		if (frame.gender == 0) {
    			str = "“But how did he get here?” a light irish male’s voice is heard saying. " +
        				"“I already told you Aaron, we’ll find out when we ask him.” A smooth voice replies " +
        				"calmly. “I say we just kill him and and be done with it.” Adds a rough sounding " +
        				"female voice. “Of course you would, you always think with your stomach Neris.” " +
        				"Replies a soothing, but loud, woman’s voice. As the group speaks they sound to be getting closer.";
    		}
    		else if (frame.gender == 1) {
    			str = "“But how did she get here?” a light irish male’s voice is heard saying. " +
        				"“I already told you Aaron, we’ll find out when we ask her.” A smooth voice replies " +
        				"calmly. “I say we just kill her and and be done with it.” Adds a rough sounding " +
        				"female voice. “Of course you would, you always think with your stomach Neris.” " +
        				"Replies a soothing, but loud, woman’s voice. As the group speaks they sound to be getting closer.";
    		}
    		else {
    			str = "“But how did they get here?” a light irish male’s voice is heard saying. " +
        				"“I already told you Aaron, we’ll find out when we ask them.” A smooth voice replies " +
        				"calmly. “I say we just kill them and and be done with it.” Adds a rough sounding " +
        				"female voice. “Of course you would, you always think with your stomach Neris.” " +
        				"Replies a soothing, but loud, woman’s voice. As the group speaks they sound to be getting closer.";
    		}
    	}
    	else if (frame.captureFrom == 1){
    		str = "“You’re sorry.” He laughs. “You should know better then to go " +
    				"barging into someone else’s room.” He raises his hand and a bolt " +
    				"of lightning flies from it square into your chest. The force of the " +
    				"blow knocks you unconscious." +
    				"When you come to, you are tied to a table and there is an argument " +
        			"seeming to be going on in the next room between several people.";
    	}
    	else if (frame.captureFrom == 2) {
    		str = "You open the door to room 207. Inside the room is very dark but you can make " +
    				"out by candle light that there is a large box around the middle of the room. " +
    				"A tall and rather pale man who was inside the room comes to meet you at the " +
    				"door. “Well isn’t this a pleasant surprise.” He says with a smile. Suddenly, the " +
    				"world fades from your vision." +
    				"When you come to, you are tied to a table and there is an argument " +
        			"seeming to be going on in the next room between several people.";
    	}
    	else {
    		str = "No one captured you, how did you get here?";
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
    	if (frame.captureSeq == 0) {
	        JButton b1 = new JButton("Try to break loose of your bondings");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureSeq = 1;
	            	frame.free = true;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Listen in on the argument from here");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureSeq = 1;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b2);
    	}
    	if (frame.captureSeq == 1 && frame.free) {
    		JButton b1 = new JButton("Rush for the door, to escape.");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 19;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Hide behind the armor");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureSeq = 2;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b2);
	        JButton b3 = new JButton("Hide behind the carpet");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 20;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b3);
    	}
    	else if (frame.captureSeq == 1) {
    		JButton b1 = new JButton("Try to break loose");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureSeq = 2;
	            	frame.struggling = true;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Wait for them to enter");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureSeq = 2;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b2);
    	}
    	else if (frame.captureSeq == 2 && frame.free) {
    		JButton b1 = new JButton("Sneak out the single door");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 21;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Sneak out the double doors");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureSeq = 3;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b2);
	        JButton b3 = new JButton("Jump out and attack the woman");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 22;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b3);
    	}
    	else if (frame.struggling && frame.captureSeq == 2){
    		JButton b1 = new JButton("Keep Struggling.");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 25;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Stop Struggling.");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.firstEnter = false;
	            	frame.struggling = false;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b2);
    	}
    	else if (frame.captureSeq == 2) {
    		JButton b1 = new JButton("Refuse to tell him anything");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 25;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("“I don’t know, I can’t remember.”");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 26;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
    	}
    	else if (frame.free && frame.captureSeq == 3) {
    		JButton b1 = new JButton("Try to sneak out the front.");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 23;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("Tackle the little man.");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 24;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
    	}
	    return buttons;
    }
}
