import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class RoomPicture extends PanelBase {

    public RoomPicture(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
        return "When you approach the picture it starts to move, the boat sailing " +
        		"across the water and the waves crashing on the shore.";
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Jump Back from the picture");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.fromPicture = true;
            	frame.changePanel(new StartRoom(frame));
            }
        });
        buttons.add(b1);
        JButton b2 = new JButton("Touch the picture");
        b2.setFont(font2);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new InsidePicture(frame));
            }
        });
        buttons.add(b2);
        return buttons;
    }
}
