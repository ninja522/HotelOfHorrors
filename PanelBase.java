import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public abstract class PanelBase extends JPanel {
    protected FrameBase frame;
    protected Font font = new Font("text font", Font.PLAIN, 32);
    protected Font font2 = new Font("button font", Font.PLAIN, 16);
    
    public PanelBase(FrameBase f) {
        frame = f;
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        JTextArea scene = new JTextArea();
        scene = this.setScene(scene);
        this.add(scene, BorderLayout.NORTH);
        this.add(this.constructButtonPanel(), BorderLayout.SOUTH);
    }
    private JTextArea setScene(JTextArea s) {
        s.setEnabled(true);
        s.setEditable(false);
        s.setLineWrap(true);
        s.setWrapStyleWord(true);
        s.setText(this.constructSetting());
        s.setFont(font);
        return s;
    }
    
    public abstract String constructSetting() ;
    
    public abstract JPanel constructButtonPanel();
}
