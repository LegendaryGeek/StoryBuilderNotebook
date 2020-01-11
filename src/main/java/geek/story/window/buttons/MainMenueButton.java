package geek.story.window.buttons;

import static geek.story.window.NotebookFrame.getMainMenuePanel;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import geek.story.StoryBuilderNotebook;

public class MainMenueButton extends JButton implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3378659272986043437L;
	Logger log = LogManager.getLogger(this.getClass());

	public MainMenueButton() {
		this.setName("Main Menue Button");
		this.setText("Main Menue");
		this.setFont(new Font(Font.SANS_SERIF, 200, 20));
		this.setActionCommand("Switching to the main menue");
		this.setSize(400, 40);
		this.addActionListener(this);
	}

	public MainMenueButton(Icon arg0) {
		super(arg0);
	}

	public MainMenueButton(String arg0) {
		super(arg0);
	}

	public MainMenueButton(Action arg0) {
		super(arg0);
	}

	public MainMenueButton(String arg0, Icon arg1) {
		super(arg0, arg1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		log.info(e.getActionCommand());

		// set the content pane to the main menue, revalidate, and repaint to draw the
		// menue to the frame.
		StoryBuilderNotebook.getFrame().setContentPane(getMainMenuePanel());
		StoryBuilderNotebook.getFrame().revalidate();
		StoryBuilderNotebook.getFrame().repaint();

		// Log current Component Locations and then change and log the new positions
		Component[] comps = getMainMenuePanel().getComponents();
		Arrays.stream(comps).forEach(comp -> {
			log.info(StoryBuilderNotebook.SEPERATOR);
			log.info("Component Name: {}", comp.getName());
			log.info("Component Location: x = {}, y = {}", comp.getX(), comp.getY());
			log.info("Component Size: width = {}, height = {}", comp.getSize().width, comp.getSize().height);
			log.info(StoryBuilderNotebook.SEPERATOR);

			switch (comp.getName()) {

			case "Main Menue Button":
				break;
			case "Notebook Drop Down list":
				getMainMenuePanel().remove(comp);
				NotebookComboBox boxy = new NotebookComboBox();
				getMainMenuePanel().add(boxy);
				boxy.setLocation(200, 20);
				boxy.setSize(400, 40);
				break;
			case "Exit Button":
				comp.setLocation(200, 700);
				comp.setSize(400, 40);
				break;
			case "Options Menue Button":
				comp.setLocation(200, 75);
				comp.setSize(400, 40);
				break;
			case "New Book Button":
				comp.setLocation(200, 130);
				comp.setSize(400, 40);
				break;
			default:
				log.info("{} was passed but is not a default component. cannot set its location.", comp.getName());
				break;
			}
			log.info(StoryBuilderNotebook.SEPERATOR);
			log.info("Component Name after edits: {}", comp.getName());
			log.info("Component Location after edits: x = {}, y = {}", comp.getX(), comp.getY());
			log.info("Component Size after edits: width = {}, height = {}", comp.getSize().width,
					comp.getSize().height);
			log.info(StoryBuilderNotebook.SEPERATOR);

		});

	}

}
