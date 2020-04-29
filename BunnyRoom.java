import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class BunnyRoom extends PanelBase {
    
    public BunnyRoom(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.doorProblem){
    		str = "You have trouble getting the door open.";
    		frame.doorProblem = false;
    	}
    	else {
    		str = "You put on the one piece bunny suit and instantly find yourself " +
    				"turned into a tiny little bunny rabbit. The suit seems to have " +
    				"become a solid fur coat and thus apparently can’t be removed by you.";
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
            	frame.doorProblem = true;
                frame.changePanel(new BunnyRoom(frame));
            }
        });
        buttons.add(b2);
        JButton b5 = new JButton("Look out the window");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomWindow(frame));
            }
        });
        buttons.add(b5);
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
        return buttons;
    }
}
