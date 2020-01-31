package geek.story.window.buttons;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import geek.story.Notebook;
import geek.story.StoryBuilderNotebook;

public class NewBookButton extends JButton implements ActionListener {
	public static final int YES = 0;
	public static final int NO = 1;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2708316486776959671L;
	Logger log = LogManager.getLogger(this.getClass());
	Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public NewBookButton() {
		this.setName("New Book Button");
		this.setText("Create a new Notebook");
		this.setFont(new Font(Font.SANS_SERIF, 200, 20));
		this.setActionCommand("Create New Notebok Dialogue opened");
		this.addActionListener(this);
	}

	public NewBookButton(Icon arg0) {
		super(arg0);
	}

	public NewBookButton(String arg0) {
		super(arg0);
	}

	public NewBookButton(Action arg0) {
		super(arg0);
	}

	public NewBookButton(String arg0, Icon arg1) {
		super(arg0, arg1);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Notebook book;
		log.info(event.getActionCommand());

		String bookName = (String) JOptionPane.showInputDialog(StoryBuilderNotebook.getFrame(),
				"Enter The Title For your new Notebook", "NoteBook Create", JOptionPane.QUESTION_MESSAGE, null, null,
				"The kingdoms anew");
		log.info("Creating a new Notebook with a name of \"{}\"", bookName);

		if (!StoryBuilderNotebook.getAppPath().toFile().exists()) {
			StoryBuilderNotebook.getAppPath().toFile().mkdirs();
			try {
				Files.createDirectories(StoryBuilderNotebook.getAppPath());
			} catch (IOException e) {
				log.catching(e);
			}
		}
		ArrayList<String> bookNameList = new ArrayList<>();
		StoryBuilderNotebook.books.forEach(action -> bookNameList.add(action.getName().toLowerCase()));
		if (bookNameList.contains(bookName.toLowerCase())) {
			String bookExistsMessage = "\"" + bookName + "\" alerady exists as a Notebook. Overwrite?";
			boolean overwrite;
			int n = JOptionPane.showConfirmDialog(StoryBuilderNotebook.getFrame(), bookExistsMessage,
					"Notebook alerady exists", JOptionPane.YES_NO_OPTION);
			if (n == YES) {
				book = new Notebook();
				book.setName(bookName);
				overwrite = true;
			} else {
				overwrite = false;
				return;
			}
			log.info("should overwrite existing file: {}", overwrite);
		} else {
			book = new Notebook();
			book.setName(bookName);
		}

		NotebookComboBox box = StoryBuilderNotebook.getFrame().notebookComboBox;
		box.addItem(book);

	}

}
