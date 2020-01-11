package geek.story.window.buttons;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import geek.story.StoryBuilderNotebook;

public class ExitButton extends JButton implements ActionListener {

	private static final long serialVersionUID = -809251431645726302L;
	Logger log = LogManager.getLogger(this.getClass());

	public ExitButton() {
		this.setName("Exit Button");
		this.setText("Exit");
		this.setFont(new Font(Font.SANS_SERIF, 200, 20));
		this.setActionCommand("Exit Button Pressed");
		this.setSize(400, 40);
		this.addActionListener(this);
	}

	public ExitButton(Icon arg0) {
		super(arg0);
	}

	public ExitButton(String arg0) {
		super(arg0);
	}

	public ExitButton(Action arg0) {
		super(arg0);
	}

	public ExitButton(String arg0, Icon arg1) {
		super(arg0, arg1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		log.info(e.getActionCommand());
		StoryBuilderNotebook.setRunning(false);
		log.info(StoryBuilderNotebook.isRunning());
		System.exit(0);

	}

}
