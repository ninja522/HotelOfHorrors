import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Yadra extends PanelBase {

    public Yadra(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.yadraState == 0){
	    	str = "Almost instantly after the number is dialed, a furious looking " +
	    			"wizard appears in the room. “How DARE you come into my room!” " +
	    			"He slaps you across the face and knocks you to the ground. “Explain yourself.”";
    	}
    	else if (frame.yadraState == 1){
	    	str = "“Hmm, that’s strange...” He paces a little. “So you honestly don’t remember how you got here?”";
    	}
    	else {
    		str = "“Hmph, I guess I can’t hold you responsible if you truly have no memory. " +
    				"I must share this interesting development with the others though. Come.” He " +
    				"starts to leave the room through the farther door, waiting for you to follow.";
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
    	if (frame.yadraState == 0) {
	        JButton b1 = new JButton("“I don’t know how I got here, I can’t remember.”");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.yadraState = 1;
	            	frame.changePanel(new Yadra(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("“How DARE you.” Try to punch the wizard.");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 6;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
	        JButton b3 = new JButton("“I’m sorry Yadra. I didn’t know this was your room.”");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.captureFrom = 1;
	            	frame.changePanel(new Captured(frame));
	            }
	        });
	        buttons.add(b3);
    	}
    	else if (frame.yadraState == 1){
    		JButton b1 = new JButton("“No, I don’t.”");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 8;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("“I was just kidding, I climbed in here through the window.”");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 7;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
	        JButton b3 = new JButton("“I’m sorry, I didn’t know this was your room.”");
	        b3.setFont(font2);
	        b3.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.yadraState = 2;
	            	frame.changePanel(new Yadra(frame));
	            }
	        });
	        buttons.add(b3);
    	}
    	else if (frame.yadraState == 2){
    		JButton b1 = new JButton("Go with him");
	        b1.setFont(font2);
	        b1.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 18;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b1);
	        JButton b2 = new JButton("“Can’t I just go home?”");
	        b2.setFont(font2);
	        b2.addActionListener(new ActionListener() {
	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	frame.ending = 9;
	            	frame.changePanel(new Ending(frame));
	            }
	        });
	        buttons.add(b2);
    	}
        return buttons;
    }
}
