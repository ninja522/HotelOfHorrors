import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Hell extends PanelBase {

    public Hell(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "You push the unlabeled button and the elevator doors close. " +
        		"You feel as though you are in freefall as the elevator heads downward. " +
        		"You anticipate the crash with the ground that would kill you but it " +
        		"doesn’t come. You do however stop with a jerk movement but nothing too " +
        		"severe to injure you. It knocks you over and the doors open. Outside " +
        		"the elevator appears pitch black. A cold wind enters the elevator that " +
        		"chills you to your core. No sounds can be heard from the space outside the elevator.";
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Leave the Elevator and explore.");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.ending = 11;
            	frame.changePanel(new Ending(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Push the button marked 1");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromHell = true;
            	frame.changePanel(new Lobby(frame));
            }
        });
        buttons.add(b2);
        JButton b3 = new JButton("Push the button marked 2");
        b3.setFont(font2);
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromHell = true;
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b3);
        return buttons;
    }
}
