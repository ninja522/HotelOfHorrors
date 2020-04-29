import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Dresser extends PanelBase {

    public Dresser(FrameBase f) {
        super(f);
    }
    
    public String constructSetting() {
    	String str = "The dresser is filled with a wide variety of clothes. Currently you are wearing ";
    	if (frame.outfit == 0) {
    		str = str + "a long sleeve shirt and Khaki pants.";
    	}
    	if (frame.outfit == 1) {
    		str = str + "a dress shirt with a suit jacket.";
    	}
    	if (frame.outfit == 2) {
    		str = str + "blue jeans and a white tee shirt.";
    	}
        return str;
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
    	if (frame.outfit != 1) {
    		JButton b1 = new JButton("Try on something fancy");
    		b1.setFont(font2);
    		b1.addActionListener(new ActionListener() {

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				frame.outfit = 1;
    				frame.changePanel(new Dresser(frame));
    			}
    		});
    		buttons.add(b1);
    	}
    	if (frame.outfit != 2) {
    		JButton b2 = new JButton("Try on something plain");
    		b2.setFont(font2);
    		b2.addActionListener(new ActionListener() {

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				frame.outfit = 2;
    				frame.changePanel(new Dresser(frame));
    			}
    		});
    		buttons.add(b2);
    	}
    	if (frame.outfit != 0) {
    		JButton b3 = new JButton("Put back on your original clothes");
    		b3.setFont(font2);
    		b3.addActionListener(new ActionListener() {

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				frame.outfit = 0;
    				frame.changePanel(new Dresser(frame));
    			}
    		});
    		buttons.add(b3);
    	}
        JButton b4 = new JButton("Try on the one piece bunny suit");
        b4.setFont(font2);
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.outfit = 3;
            	frame.changePanel(new BunnyRoom(frame));
            }
        });
        buttons.add(b4);
        JButton b5 = new JButton("Open the closer door");
        b5.setFont(font2);
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new ClosetDoor(frame));
            }
        });
        buttons.add(b5);
        JButton b6 = new JButton("Open the farther door");
        b6.setFont(font2);
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new HallwayFromRoom(frame));
            }
        });
        buttons.add(b6);
        JButton b7 = new JButton("Examine the bedside table");
        b7.setFont(font2);
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new BedsideTable(frame));
            }
        });
        buttons.add(b7);
        JButton b8 = new JButton("Look out the window");
        b8.setFont(font2);
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomWindow(frame));
            }
        });
        buttons.add(b8);
        JButton b9 = new JButton("Examine the picture");
        b9.setFont(font2);
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomPicture(frame));
            }
        });
        buttons.add(b9);
        JButton b10 = new JButton("Try to go back to sleep");
        b10.setFont(font2);
        b10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.changePanel(new RoomSleep(frame));
            }
        });
        buttons.add(b10);
        return buttons;
    }
}
