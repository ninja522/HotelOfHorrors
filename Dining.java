import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Dining extends PanelBase {

    public Dining(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str;
    	if (frame.fromLobby) {
    		str = "You enter into a large dining area from the lobby.";
    	}
    	else {
    		str = "The stairs lead you down into a large dining area";
    	}
    	str = str + "This room has a long table with 12 chairs. On one end is a single door leading to some stairs on the " +
    			"other end is a set of double doors leading to a lobby area.";
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Take the single door");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromStairs = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Take the double doors");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new Lobby(frame));
            }
        });
        buttons.add(b2);
        return buttons;
    }
}
