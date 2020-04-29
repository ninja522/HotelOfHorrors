import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Ending extends PanelBase {

    public Ending(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String end;
    	if (frame.ending == 1) {
    		end = "You go to explore the area around and after walking on the beach for " +
            		"a few minutes you find there is nothing of interest anywhere nearby; " +
            		"So, you head back. When you arrive back where the floating square had " +
            		"been you see now that your way back is gone. You are trapped forever " +
            		"in this magic picture. -Ending 1";
    	}
    	else if (frame.ending == 2) {
    		end = "You weirdly misjudge the height and land terribly. You hear something break " +
    				"just before you pass out, never to awaken again. -Ending 2";
    	}
    	else if (frame.ending == 3) {
    		end = "You go to sleep fairly quickly. At some point you start to stir at the sound " +
    				"of someone entering the room. Before you wake up fully though, a strange warmth " +
    				"covers you and you are feel a sensation of falling. Suddenly you bolt upright " +
    				"awake in bed. You are human again and back in your own room at home. What a strange " +
    				"dream. -Ending 3";
    	}
    	else if (frame.ending == 4) {
    		end = "Your tiny bunny body doesn't make it from the window to the ground in one piece. " +
    				"This is unfortunately your end. -Ending 4";
    	}
    	else if (frame.ending == 5) {
    		end = "You manage to nudge open the shoebox and and find it is filled with carrots " +
    				"that have a scent which entrances you into eating one without thinking about " +
    				"it. After you eat it your conscious thoughts of ever being human or anything " +
    				"of that manner fade away and you live the rest of your life as little bunny " +
    				"helper to Yadra the magician. -Ending 5";
    	}
    	else if (frame.ending == 6) {
    		end = "You try to punch the wizard but your fist seems to hit an invisible barrier. " +
    				"“You are a fool to pick a fight with me.” He raises his hand and a bolt of " +
    				"lightning flies from it square into your chest and then through your chest. " +
    				"There is a big hole going through you now, but you don’t have time to worry " +
    				"about it because soon after you are dead. -Ending 6";
    	}
    	else if (frame.ending == 7) {
    		end = "“I don’t like people who lead me along with lies” He strikes you dead with a bolt " +
    				"of lightning before you have time to react. -Ending 7";
    	}
    	else if (frame.ending == 8) {
    		end = "“Hmm...this does complicate things a bit. If the others were to find you...no I can just " +
    				"send you back to wherever you come from. Lie down on this bed here and close your eyes. " +
    				"If you do so I will send you back home and you will awaken as if this had only been a dream.” " +
    				"Seeing no better course of action you choose to lay down. A moment later you hear chanting. " + 
    				"Suddently the chanting fades and you sit up quickly as though startled from a nightmare. " +
    				"Looking around you find yourself no longer inside the wizards room, but instead you are in " +
    				"your own room. Your memory of the weird place you had been slowly fades. Was it all really " +
    				"just a bad dream? The business card of Yadra the magician you find in your pocket says " +
    				"otherwise. -Ending 8";
    	}
    	else if (frame.ending == 9) {
    		end = "Of course, I could send you back to wherever you came frome. Just Lie down and close your eyes. " +
    				"You do so and hear chanting from Yadra. Moments later you open your eyes and find that you are " +
    				"now back in your own room. You start to wonder if it was all just a strange dream, until you " +
    				"find the business card still in your pocket. -Ending 9";
    	}
    	else if (frame.ending == 10) {
    		end = "You leave through the front doors and don't look back. -Ending 10";
    	}
    	else if (frame.ending == 11) {
    		end = "You leave the elevator and after walking for a bit you find yourself face to " +
    				"face with a demon. You turn to run back to the elevator and find it gone. " +
    				"You are now trapped in hell forever. -Ending 11";
    	}
    	else if (frame.ending == 12) {
    		end = "You slam the door closed but the wolf just barrles straight through it. " +
    				"Smashed door slams you against the wall hard enough to knock you out and " +
    				"you never wake up. -Ending 12";
    	}
    	else if (frame.ending == 13) {
    		end = "You cry out, but nobody comes. Mercifully, the wolf quickly ends your pain for good. -Ending 13";
    	}
    	else if (frame.ending == 14) {
    		end = "You slam your fist into the close door button and smash both it and the first floor button." +
    				"The doors close tight around the wolf's head and the elevator moves down. With one last howl" +
    				"and a large amount of blood the wolf is decapitated. The elevator opens again on the first" +
    				" floor and you make haste out the exit. You never want to see this place again. " +
    				"Unfortunately one month later, when the full moon arrives, you find yourself becoming a wolf " +
    				"much like the one you ran from. -Ending 14";
    	}
    	else if (frame.ending == 15) {
    		end = "You slam your fist into the close door button and smash both it and the first floor button." +
    				"The doors close tight around the wolf's head and the elevator moves down. With one last howl" +
    				"and a large amount of blood the wolf is decapitated. The elevator opens again on the first" +
    				" floor and you make haste out the exit. You never want to see this place again. -Ending 15";
    	}
    	else if (frame.ending == 16) {
    		end = "The wolf stumbles backwards from the punch you land square on its nose. " +
    			"This gives enough time for the elevator to close and take you down to the first floor. " +
    			"You immediately rush out of the elevator and leave the hotel through the front door. " +
    			"Unfortunately one month later, when the full moon arrives, you find yourself becoming a wolf " +
    			"much like the one you ran from. -Ending 16";
    	}
    	else if (frame.ending == 17) {
    		end = "The wolf stumbles backwards from the punch you land square on its nose. " +
        			"This gives enough time for the elevator to close and take you down to the first floor. " +
        			"You immediately rush out of the elevator and leave the hotel through the front door. -Ending 17";
    	}
    	else if (frame.ending == 18) {
    		end = "Yadra leads you to room 203 and after knocking the door is answered by a beautiful young woman. " +
    				"You are hurried into the room and the door is closed and locked behind you. " +
    				"“Who is this?” the woman asks. “I’m not sure, but I think this is the help our ally promised " +
    				"to send.” he responds. “What do you mean think?” she asks. “Well, ";
    		if (frame.gender == 0) {
    			end = end + "he doesn’t remember how he got here.”" +
    					"The woman looks you over before stating. “No, this is too risky. Send him away from here.” " +
    					"With a sudden flash of light the room blinks out of existance and you find yourself stumbling " +
    					"over in a random stretch of wood. After a bit of wandering, you find a road sign that lets you " +
    					"know you've been transported to the other end of the world. It's gonna be a long trip home -Ending 18";
    		}
    		else if (frame.gender == 1) {
    			end = end + "she doesn't remember how she got here.”" +
    					"The woman looks you over before stating. “No, this is too risky. Send her away from here.” " +
    					"With a sudden flash of light the room blinks out of existance and you find yourself stumbling " +
    					"over in a random stretch of wood. After a bit of wandering, you find a road sign that lets you " +
    					"know you've been transported to the other end of the world. It's gonna be a long trip home -Ending 18";
    		}
    		else {
    			end = end + "they don’t remember how they got here.”" +
    					"The woman looks you over before stating. “No, this is too risky. Send them away from here.” " +
    					"With a sudden flash of light the room blinks out of existance and you find yourself stumbling " +
    					"over in a random stretch of wood. After a bit of wandering, you find a road sign that lets you " +
    					"know you've been transported to the other end of the world. It's gonna be a long trip home -Ending 18";
    		}
    	}
    	else if (frame.ending == 19) {
    		end = "You rush for the single door but as you are opening it you are " +
    				"flung backward into the table, by an invisible force, and bash your head open." +
    				"You lose consciousness shortly after and without anyone tending your injury, you don't wake up -Ending 19";
    	}
    	else if (frame.ending == 20) {
    		end = "You hide behind the carpet on the wall and a group of four people enter the room: " +
    				"a rough looking female in rag like clothes, a beautiful woman in very revealing " +
    				"clothes, a well tanned man with dark hair and fine clothes, and a midget of a man " +
    				"with bright red hair. Upon seeing you missing from the ropes, the tanned man looks furious. " +
    				"“This is what I get for expecting you people to tie ropes properly!” He picks up the table " +
    				"and flings it towards the carpet too fast for you to react. It shatters to a million pieces " +
    				"and the wooden shards kill you. -Ending 20";
    	}
    	else if (frame.ending == 21) {
    		end = "She quickly turns and blocks your path before you reach the door. “I don’t think so buddy.” " +
    				"Without any hesitation she grabs your throat and rips your head clean off. At least it's quick. -Ending 21";
    	}
    	else if (frame.ending == 22) {
    		end = "You jump out and attack the rough woman, tackling her to the ground. " +
    				"“That’s what I like, a human with a backbone.” She says as she wrestles with " +
    				"you on the ground. She manages to win the hold and pin you to the ground to where " +
    				"you can’t move. “That was more fun than I’ve had in weeks. Shame that it’s over now.” " +
    				"She then transforms into a wolf form over your pinned body before eating you alive. " +
    				"You suffer a long and painful death. -Ending 22";
    	}
    	else if (frame.ending == 23) {
    		end = "You wait until he isn't looking and then try to sneak out the front door. " +
    				"The door's bell gives you away and with a snap of his fingers you find yourself " +
    				"magically back inside. You try to run, but another finger snap teleports you inside " +
    				"the front desk. You scream in agony as your flesh melds with wood. “Yikes, guess I’m out of " +
    				"practice. Sorry about that.” is the last words you hear before you die. -Ending 23";
    	}
    	else if (frame.ending == 24) {
    		end = "You tackle the little man and bring him to the ground with a heavy thud. He is knocked out. " +
    				"Now with no one between you and the exit you quickly leave and escape from " +
    				"this place safe and sound. -Ending 24";
    	}
    	else if (frame.ending == 25) {
    		end = "“I don't have patience for this. Neris, you may eat him.” From your position, helplessly tied up, " +
    				"you can only watch as the rough woman transformed into a wolf and then proceeds to eat you alive. -Ending 25";
    	}
    	else if (frame.ending == 26) {
    		end = "“You know, that actually gives me a good idea. The tanned man says with a grin.” He places a hand on " +
    				"your head and everything goes black. When you regain your sight you find yourself in the middle of " +
    				"nowhere with no memories of anything. You wander aimlessly for the rest of your days. -Ending 26";
    	}
    	else {
    		end = "Unaccounted for ending reached -Ending 0?";
    	}
        return end;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Try again from the start?");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.variableReset();
            	frame.changePanel(new Setup(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("End your adventure here");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        buttons.add(b2);
        return buttons;
    }
}
