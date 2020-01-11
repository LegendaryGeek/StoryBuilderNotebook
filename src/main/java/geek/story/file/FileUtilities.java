package geek.story.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class FileUtilities {

	static Logger log = LogManager.getLogger(FileUtilities.class);
	public static final File PATH = new File("C:\\Geek\\CharacterStoryNotebook");
	Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public void writeToFile(String file, JsonObject content) {
		File filo = new File(PATH.getPath() + file);
		if (!filo.exists()) {
			filo.mkdirs();
		}
		try {
			IOUtils.write(content.getAsString(), new FileWriter(filo));
		} catch (IOException e) {
			log.catching(e);
		}
	}
}
