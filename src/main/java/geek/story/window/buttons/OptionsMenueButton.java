package geek.story.window.buttons;

import static geek.story.window.NotebookFrame.getOptionsPanel;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import geek.story.StoryBuilderNotebook;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class OptionsMenueButton extends JButton implements ActionListener {

  /**
   *
   */
  private static final long serialVersionUID = -1346872696514232658L;

  //Logger log = LogManager.getLogger(this.getClass());

  public OptionsMenueButton() {
    this.setName("Options Menue Button");
    this.setText("Options");
    this.setFont(new Font(Font.SANS_SERIF, 200, 20));
    this.setActionCommand("Switching to the options menue");
    this.setSize(400, 40);
    this.addActionListener(this);
  }

  public OptionsMenueButton(Icon arg0) {
    super(arg0);
  }

  public OptionsMenueButton(String arg0) {
    super(arg0);
  }

  public OptionsMenueButton(Action arg0) {
    super(arg0);
  }

  public OptionsMenueButton(String arg0, Icon arg1) {
    super(arg0, arg1);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    //log.info(e.getActionCommand());

    StoryBuilderNotebook.getFrame().setContentPane(getOptionsPanel());
    StoryBuilderNotebook.getFrame().revalidate();
    StoryBuilderNotebook.getFrame().repaint();

    Component[] comps = getOptionsPanel().getComponents();
    Arrays
      .stream(comps)
      .forEach(
        comp -> {
          //	log.info("component name: {}", comp.getName());
          //		log.info("Component Location: x = {}, y = {}", comp.getX(), comp.getY());

        }
      );
  }
}
