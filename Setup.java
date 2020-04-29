import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonModel;

public class Setup extends PanelBase {
	
	private JPanel choices;
	private JTextField nameIn;
	private ButtonGroup gender;
    
    public Setup(FrameBase f) {
    	super(f);
        this.add(this.setupSelectionPanel(), BorderLayout.CENTER);
    }
    
    private JPanel setupSelectionPanel() {
    	choices = new JPanel(new GridBagLayout());
    	choices.setBackground(bgColor);
    	GridBagConstraints namePromptGbc = new GridBagConstraints();
    	GridBagConstraints nameGbc = new GridBagConstraints();
    	GridBagConstraints genderPromptGbc = new GridBagConstraints();
    	GridBagConstraints genderGbc = new GridBagConstraints();
    	namePromptGbc.gridx = 0;
    	namePromptGbc.gridy = 0;
    	//namePromptGbc.weightx = 0.2;
    	nameGbc.gridx = 1;
    	nameGbc.gridy = 0;
    	nameGbc.weightx = 0.2;
    	nameGbc.fill = GridBagConstraints.HORIZONTAL;
    	genderPromptGbc.gridx = 0;
    	genderPromptGbc.gridy = 1;
    	//genderPromptGbc.weightx = 0.2;
    	genderGbc.gridx = 1;
    	genderGbc.gridy = 1;
    	//genderGbc.weightx = 0.2;
    	JTextArea namePrompt = new JTextArea();
    	namePrompt.setFont(font);
    	namePrompt.setBackground(bgColor);
    	namePrompt.setText("Name: ");
    	nameIn = new JTextField(frame.name);
    	nameIn.setFont(font);
    	nameIn.setBackground(bgColor);
    	JTextArea genderPrompt = new JTextArea();
    	genderPrompt.setFont(font);
    	genderPrompt.setBackground(bgColor);
    	genderPrompt.setText("Pronoun preference: ");
    	JPanel radio = new JPanel();
    	radio.setLayout(new GridLayout(3, 1));
    	radio.setBackground(bgColor);
    	JRadioButton m = new JRadioButton("He/Him/His", true);
    	m.setFont(font);
    	JRadioButton f = new JRadioButton("She/Her/Hers");
    	f.setFont(font);
    	JRadioButton n = new JRadioButton ("They/Them/Theirs");
    	n.setFont(font);
    	m.setBackground(bgColor);
    	f.setBackground(bgColor);
    	n.setBackground(bgColor);
    	m.setActionCommand("male");
    	f.setActionCommand("female");
    	n.setActionCommand("neutral");
    	gender = new ButtonGroup();
    	gender.add(m);
    	gender.add(f);
    	gender.add(n);
    	choices.add(namePrompt, namePromptGbc);
    	choices.add(nameIn, nameGbc);
    	choices.add(genderPrompt, genderPromptGbc);
    	radio.add(m);
    	radio.add(f);
    	radio.add(n);
    	choices.add(radio, genderGbc);
    	return choices;
    }
    
    public String constructSetting() {
        return "This is a choose your own adventure story where you take on the role of " +
                "a normal human who has just awoken in a mysterious unknown location. " +
                "It is up to you to determine what happens to your character as you explore " +
                "the Hotel of Horrors. (There are 26 endings to find)";
    }
    
    public JPanel constructButtonPanel(JPanel buttons) {
        JButton b1 = new JButton("Begin");
        b1.setFont(font2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	String hold = nameIn.getText();
            	if (!hold.isEmpty()){
            		frame.name = hold;
            	}
            	ButtonModel g = gender.getSelection();
            	if (g.getActionCommand().equals("male")) {
            		frame.gender = 0;
            	}
            	else if(g.getActionCommand().equals("female")) {
            		frame.gender = 1;
            	}
            	else if (g.getActionCommand().equals("neutral")) {
            		frame.gender = 2;
            	}
            	
            	frame.changePanel(new StartRoom(frame));
            }
        });
        JButton hidden = new JButton("Hidden Button");
        hidden.setVisible(false);
        buttons.add(hidden);
        buttons.add(b1);
        return buttons;
    }
}
