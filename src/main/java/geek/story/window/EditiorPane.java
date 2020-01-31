package geek.story.window;

import java.util.List;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import geek.story.Notebook;
import geek.story.StoryBuilderNotebook;
import geek.story.elements.GSCharacter;

public class EditiorPane extends JTabbedPane {

	Logger log = LogManager.getLogger(EditiorPane.class);
	private Notebook book;
	private List<GSCharacter> characters = book.getCharacters();
	private JTextArea suchTexty = new JTextArea();

	private static final long serialVersionUID = 509467761740982125L;

	public EditiorPane(Notebook book) {
		this.book = book;

	}

	public EditiorPane(int tabPlacement) {
		super(tabPlacement);
		// TODO Auto-generated constructor stub
	}

	public EditiorPane(int tabPlacement, int tabLayoutPolicy) {
		super(tabPlacement, tabLayoutPolicy);
		// TODO Auto-generated constructor stub.
	}

	public void TestPrint() {
		book = StoryBuilderNotebook.books.get(0);
		StringBuffer text = new StringBuffer();
		characters.stream().forEach(action -> {
			action.getName();
			text.append("Character name: " + action.getName() + "\n");
			action.getInventory().forEach(action1 -> {
				text.append("inventory item name: " + action1.getName() + "\n");
				text.append("inventory item type: " + action1.getType() + "\n");
			});
			text.append(StoryBuilderNotebook.SEPERATOR);
		});
		suchTexty.setText(text.toString());
		log.info(text.toString());
		this.add(suchTexty, 0);
	}

}
