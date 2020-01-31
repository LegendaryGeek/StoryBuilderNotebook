package geek.story.window;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import geek.story.StoryBuilderNotebook;
import geek.story.window.buttons.ExitButton;
import geek.story.window.buttons.MainMenueButton;
import geek.story.window.buttons.NewBookButton;
import geek.story.window.buttons.NotebookComboBox;
import geek.story.window.buttons.OptionsMenueButton;

/**
 * @author LegendaryGeek
 *
 */
public class NotebookFrame extends JFrame {

	// misc
	static FlowLayout flowLayout = new FlowLayout();
	Logger log = LogManager.getLogger(NotebookFrame.class);

	// panes
	private static JPanel mainMenuePanel = new JPanel(flowLayout);
	private static JPanel optionsPanel = new JPanel(flowLayout);

	// buttons, levers, and switches oh my!
	JButton newBookButton = new JButton();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotebookFrame() {
		this.setName(StoryBuilderNotebook.appName);
		this.setTitle(StoryBuilderNotebook.appName);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);
		this.setResizable(false);
		this.setVisible(true);
		this.setContentPane(mainMenuePanel);

		this.initButtons();
		this.initPanes();

		if (StoryBuilderNotebook.isDebugMode()) {
			JFrame controlFrame = new JFrame();
			controlFrame.setLayout(flowLayout);
			controlFrame.add(new MainMenueButton());
			controlFrame.add(new OptionsMenueButton());
			controlFrame.add(new ExitButton());
			controlFrame.setTitle("Debug Controller");
			controlFrame.setSize(400, 400);
			controlFrame.setVisible(true);
		}

	}

	/**
	 * updates the frame
	 */
	public void update() {
		this.revalidate();
		this.repaint();
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
		this.update(getGraphics());
	}

	/**
	 * sets any settings buttons or the like need
	 */
	public void initButtons() {
		log.info("Initializing Buttons");

		log.info("All Buttons Initialized");
	}

	/**
	 * adds and sets things like buttons and background colour
	 */
	public void initPanes() {

		log.info(StoryBuilderNotebook.SEPERATOR);
		log.info("Initializing Window Panes");

		mainMenuePanel.setBackground(Color.decode("#00137F"));
		mainMenuePanel.add(new ExitButton());
		mainMenuePanel.add(new NotebookComboBox());
		mainMenuePanel.add(new OptionsMenueButton());
		mainMenuePanel.add(new NewBookButton());
		Component[] comps = getMainMenuePanel().getComponents();
		Arrays.stream(comps).forEach(comp -> {
			log.info(StoryBuilderNotebook.SEPERATOR);
			log.info("Initializing Main Menue");
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
			log.info("Component Name: {}", comp.getName());
			log.info("Component Location: x = {}, y = {}", comp.getX(), comp.getY());
			log.info("Component Size: width = {}, height = {}", comp.getSize().width, comp.getSize().height);
			log.info(StoryBuilderNotebook.SEPERATOR);

		});

		optionsPanel.setBackground(Color.decode("#00137F"));
		optionsPanel.add(new MainMenueButton());

		log.info("Window Panes Initalized");

		log.info(StoryBuilderNotebook.SEPERATOR);
	}

	/**
	 * @return the layout used by the options and main menue's
	 */
	public static FlowLayout getFlowLayout() {
		return flowLayout;
	}

	/**
	 * @param flowLayout sets the layout for the options and main menue's
	 */
	public static void setFlowLayout(FlowLayout flowLayout) {
		NotebookFrame.flowLayout = flowLayout;
	}

	/**
	 * @return the mainMenuePanel
	 */
	public static JPanel getMainMenuePanel() {
		return mainMenuePanel;
	}

	/**
	 * @return the optionsPanel
	 */
	public static JPanel getOptionsPanel() {
		return optionsPanel;
	}

}