import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public abstract class PanelBase extends JPanel {
    protected FrameBase frame;
    protected Font font;
    protected Font font2;
    protected Color bgColor;
    
    public PanelBase(FrameBase f) {
        frame = f;
        font = new Font("text font", Font.PLAIN, 32);
        font2 = new Font("button font", Font.PLAIN, 16);
        bgColor = new Color(245,245,255);
        this.setLayout(new BorderLayout());
        this.setBackground(bgColor);
        JTextArea scene = new JTextArea();
        scene = this.setScene(scene);
        this.add(scene, BorderLayout.NORTH);
        this.add(this.startButtonPanel(), BorderLayout.SOUTH);
    }
    protected JTextArea setScene(JTextArea s) {
        s.setEnabled(true);
        s.setEditable(false);
        s.setLineWrap(true);
        s.setWrapStyleWord(true);
        s.setBackground(bgColor);
        s.setText(this.constructSetting());
        s.setFont(font);
        return s;
    }
    
    public JPanel startButtonPanel() {
    	JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(0, 3));
        buttons.setBackground(bgColor);
        return constructButtonPanel(buttons);
    }
    
    public abstract String constructSetting() ;
    
    public abstract JPanel constructButtonPanel(JPanel buttons);
}
