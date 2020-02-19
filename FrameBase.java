import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FrameBase {
    JFrame frame;
    private PanelBase panel = new startRoom(this);
    public boolean bedsideLamp = false;
    public void setup() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(1200, 600));
        frame.setLocation(300, 200);
        frame.setVisible(true);
        frame.add(panel);
        frame.pack();
    }
    
    public void changePanel(PanelBase p) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {


                frame.remove(panel);
                panel = p;
                frame.add(panel);
                frame.invalidate();
                frame.revalidate();

            }

        });
    }
    public static void main(String[] args) {
        FrameBase f = new FrameBase();
        f.setup();
    }
}
