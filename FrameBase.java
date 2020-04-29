import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;

public class FrameBase {
    JFrame frame;
    private PanelBase panel = new Setup(this);
    public boolean bedsideLamp = false;
    public String name = "Alex";
    public int gender = 0; // 0 male, 1 female, 2 neutral
    public int outfit = 0; // 0 default, 1 fancy, 2 plain, 3 bunny
    public boolean yadraCard = false;
    public int yadraState = 0; // 0 no conversation, 1 you don't remember, 2 apologized, 3 followed
    public int nerisState = 0; // 0 no interaction, 1 biting, 2 giving chase, 
    public int captureFrom = 0; // 0 no one, 1 Yadra, 2 (vampire)
    public int hallEnd = 0; // 0 from room, 1 elevator, 2 stairs
    public int captureSeq = 0; // 0 captured, 1 progressed, 2 they enter, 3 escape from Neris
    public boolean werewolf = false;
    
    //booleans to reduce near duplicate states
    public boolean fromHall = false;
    public boolean fromPicture = false;
    public boolean fromPicture2 = false;
    public boolean carrotBox = false;
    public boolean shockCoat = false;
    public boolean coatFixed = false;
    public boolean lockedDoor = false;
    public boolean doorProblem = false;
    public boolean drawerCheck = false;
    public boolean hallButton2 = false;
    public boolean fromLobby = false;
    public boolean lobbyButton1 = false;
    public boolean fromStairs = false;
    public boolean fromHell = false;
    public boolean free = false;
    public boolean struggling = false;
    public boolean firstEnter = true;
    
    public int ending = 0;
    public void setup() {
        frame = new JFrame("Hotel of Horrors");
        frame.setPreferredSize(new Dimension(1300, 650));
        frame.setLocation(300, 200);
        frame.setIconImage(new ImageIcon(getClass().getResource("HH.png")).getImage());
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
    
    public void variableReset() {
    	ending = 0;
    	fromHall = false;
        fromPicture = false;
        fromPicture2 = false;
        carrotBox = false;
        shockCoat = false;
        coatFixed = false;
        lockedDoor = false;
        doorProblem = false;
        yadraCard = false;
        bedsideLamp = false;
        drawerCheck = false;
        outfit = 0;
        captureFrom = 0;
        yadraState = 0;
        nerisState = 0;
        hallButton2 = false;
        fromLobby = false;
        lobbyButton1 = false;
        fromStairs = false;
        fromHell = false;
        werewolf = false;
        free = false;
        captureSeq = 0;
        struggling = false;
        firstEnter = true;
    }
    
    public static void main(String[] args) {
        FrameBase f = new FrameBase();
        f.setup();
    }
}
