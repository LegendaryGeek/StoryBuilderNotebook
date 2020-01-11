package geek.story.window.buttons;

import javax.swing.JComboBox;

import geek.story.Notebook;
import geek.story.StoryBuilderNotebook;

public class NotebookComboBox extends JComboBox<Notebook> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3463504566196635987L;

	public NotebookComboBox() {
		this.setName("Notebook Drop Down list");
		this.setSize(400, 40);
		this.setRenderer(new NotebookComboBoxRenderer());
		StoryBuilderNotebook.books.forEach(book -> this.addItem(book));
	}

}
