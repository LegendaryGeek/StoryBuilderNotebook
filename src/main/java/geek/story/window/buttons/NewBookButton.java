package geek.story.window.buttons;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
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
		log.info(event.getActionCommand());

		String bookName = (String) JOptionPane.showInputDialog(StoryBuilderNotebook.getFrame(),
				"Enter The Title For your new Notebook", "NoteBook Create", JOptionPane.QUESTION_MESSAGE, null, null,
				"The kingdoms anew");
		log.info("Creating a new Notebook with a name of \"{}\"", bookName);

		Path appPath = Paths.get("C:\\LegendaryGeek\\CharacterStoryNotebook");
		Path filo2 = Paths.get(appPath.toString() + "\\" + bookName.replace(" ", "-") + ".json");
		if (!appPath.toFile().exists()) {
			appPath.toFile().mkdirs();
			try {
				Files.createDirectories(appPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (filo2.toFile().exists()) {
			String bookExistsMessage = "\"" + bookName + "\" alerady exists as a Notebook. Overwrite?";
			boolean overwrite;
			int n = JOptionPane.showConfirmDialog(StoryBuilderNotebook.getFrame(), bookExistsMessage,
					"Notebook alerady exists", JOptionPane.YES_NO_OPTION);
			if (n == YES) {
				overwrite = true;
				try {
					Files.delete(filo2);
					Files.createFile(filo2);
				} catch (IOException e) {
					log.catching(e);
				}
			} else {
				overwrite = false;
			}
			log.info("should overwrite existing file: {}", overwrite);
		} else {
			try {
				Files.createFile(filo2);
			} catch (IOException e) {
				log.catching(e);
			}
		}
		Notebook book = new Notebook();
		book.setName(bookName);
		try {
			FileUtils.writeStringToFile(filo2.toFile(), gson.toJson(book));
		} catch (IOException e) {
			log.catching(e);
		}

		StoryBuilderNotebook.books.add(book);
	}

}
