package geek.story.window.buttons;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import geek.story.Notebook;

public class NotebookComboBoxRenderer extends JLabel implements ListCellRenderer<Notebook> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3170440867032274836L;

	public NotebookComboBoxRenderer() {
		// TODO Auto-generated constructor stub
	}

	public NotebookComboBoxRenderer(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public NotebookComboBoxRenderer(Icon arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public NotebookComboBoxRenderer(String arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public NotebookComboBoxRenderer(Icon arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public NotebookComboBoxRenderer(String arg0, Icon arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Notebook> list, Notebook book, int index,
			boolean isSelected, boolean hasFocus) {
		setText(book.getName());
		return this;
	}

}
