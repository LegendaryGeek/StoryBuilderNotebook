package geek.story.window.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

import geek.story.Notebook;
import geek.story.StoryBuilderNotebook;
import geek.story.window.EditiorPane;

public class LoadNotebookButton extends JButton implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -103143708962872073L;
	private EditiorPane editior = StoryBuilderNotebook.getFrame().getEditior();

	public LoadNotebookButton() {
		// TODO Auto-generated constructor stub
	}

	public LoadNotebookButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public LoadNotebookButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public LoadNotebookButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public LoadNotebookButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Notebook book = (Notebook) StoryBuilderNotebook.getFrame().notebookComboBox.getSelectedItem();
		StoryBuilderNotebook.getFrame().setEditior(new EditiorPane(book));

		StoryBuilderNotebook.getFrame().setContentPane(editior);
		StoryBuilderNotebook.getFrame().revalidate();
		StoryBuilderNotebook.getFrame().repaint();

	}

}
