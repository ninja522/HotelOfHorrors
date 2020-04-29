import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class InsidePicture extends PanelBase {

    public InsidePicture(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "When you touch the picture there is a flash of light and you are " +
        		"suddenly on the beach that had been in the picture. The boat sails " +
        		"out of sight in the distance. Looking about there appears to be a " +
        		"square floating in the distance that shows part of the room you had been in.";
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Head back through the floating square.");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromPicture2 = true;
            	frame.changePanel(new StartRoom(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Explore the area around");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.ending = 1;
            	frame.changePanel(new Ending(frame));
            }
        });
        buttons.add(b2);
        return buttons;
    }
}
