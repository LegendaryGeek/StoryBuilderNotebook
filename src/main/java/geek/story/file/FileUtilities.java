package geek.story.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.DateFormat;
import java.time.Instant;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import geek.story.Notebook;
import geek.story.StoryBuilderNotebook;

public class FileUtilities {

	private static Logger log = LogManager.getLogger(FileUtilities.class);
	private static Path saveFile = Paths.get(StoryBuilderNotebook.getAppPath() + "\\SaveFile");
	private static Gson gson = new GsonBuilder().create();

	/**
	 * Exports every notebook in {@link StoryBuilderNotebook}'s books array into a
	 * .gz file
	 */
	public static void writeGzipExport() {
		log.info(StoryBuilderNotebook.SEPERATOR);
		log.info("Begining export of all books into a gzip archive");
		log.info(StoryBuilderNotebook.SEPERATOR);
		long startTimeOrigin = System.currentTimeMillis();
		Path gzipfile = Paths.get(StoryBuilderNotebook.getAppPath().toString() + "\\exports\\books.json.gz");
		log.info("Time for the two paths to be made: {}", System.currentTimeMillis() - startTimeOrigin);
		try {
			String bookData = gson.toJson(StoryBuilderNotebook.books);

			long startTime1 = System.currentTimeMillis();
			GZIPOutputStream gzout = new GZIPOutputStream(Files.newOutputStream(gzipfile));
			log.info("Time for the output stream to be made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime2 = System.currentTimeMillis();
			gzout.write(bookData.getBytes());
			log.info("Time for the data to get written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime3 = System.currentTimeMillis();
			gzout.finish();
			gzout.close();
			log.info("Time to finish and close stream: {}", System.currentTimeMillis() - startTime3);
			log.info("Time since the data got written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since the output stream was made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);
		} catch (IOException e1) {
			log.catching(e1);
		}
		log.info(StoryBuilderNotebook.SEPERATOR);
	}

	/**
	 * Exports every notebook in {@link StoryBuilderNotebook}'s books array into a
	 * .json file inside a zip
	 */
	public static void writezipExport() {
		log.info(StoryBuilderNotebook.SEPERATOR);
		log.info("Begining export of all books into a zip archive");
		log.info(StoryBuilderNotebook.SEPERATOR);
		long startTimeOrigin = System.currentTimeMillis();
		Path zipfile = Paths.get(StoryBuilderNotebook.getAppPath().toString() + "\\exports\\books.zip");
		log.info("Time for the two paths to be made: {}", System.currentTimeMillis() - startTimeOrigin);
		try {
			String bookData = gson.toJson(StoryBuilderNotebook.books);

			long startTime1 = System.currentTimeMillis();
			ZipOutputStream zout = new ZipOutputStream(Files.newOutputStream(zipfile));
			log.info("Time for the two output streams to be made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime2 = System.currentTimeMillis();
			ZipEntry entry = new ZipEntry("Notebook Export.json");
			zout.putNextEntry(entry);
			zout.write(bookData.getBytes());

			log.info("Time for the data to get written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime3 = System.currentTimeMillis();
			zout.finish();
			zout.close();
			log.info("Time to finish and close stream: {}", System.currentTimeMillis() - startTime3);
			log.info("Time since the data got written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since the output stream was made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);
		} catch (IOException e1) {
			log.catching(e1);
		}
		log.info(StoryBuilderNotebook.SEPERATOR);
	}

	/**
	 * @param book the book(s) to export
	 */
	public static void writeGzipExport(Notebook... book) {

		log.info(StoryBuilderNotebook.SEPERATOR);
		log.info("Begining export of one or more books into a gzip archive");
		log.info(StoryBuilderNotebook.SEPERATOR);
		long startTimeOrigin = System.currentTimeMillis();
		String zipName = "books-" + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
				.format(Date.from(Instant.now())).replaceAll("/", "-").replaceAll(" ", "-").replaceAll(":", "-");
		Path gzipfile = Paths.get(StoryBuilderNotebook.getAppPath().toString() + "\\exports\\" + zipName + ".json.gz");
		log.info("Time for the two paths to be made: {}", System.currentTimeMillis() - startTimeOrigin);
		try {
			String bookData = gson.toJson(book);

			long startTime1 = System.currentTimeMillis();
			GZIPOutputStream gzout = new GZIPOutputStream(Files.newOutputStream(gzipfile));
			log.info("Time for the output stream to be made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime2 = System.currentTimeMillis();
			gzout.write(bookData.getBytes());
			log.info("Time for the data to get written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime3 = System.currentTimeMillis();
			gzout.finish();
			gzout.close();
			log.info("Time to finish and close stream: {}", System.currentTimeMillis() - startTime3);
			log.info("Time since the data got written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since the output stream was made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);
		} catch (IOException e1) {
			log.catching(e1);
		}
		log.info(StoryBuilderNotebook.SEPERATOR);
	}

	/**
	 * @param book the book(s) to export
	 */
	public static void writezipExport(Notebook... book) {
		log.info(StoryBuilderNotebook.SEPERATOR);
		log.info("Begining export of one or more books into a zip archive");
		log.info(StoryBuilderNotebook.SEPERATOR);
		long startTimeOrigin = System.currentTimeMillis();
		String zipName = "books-" + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
				.format(Date.from(Instant.now())).replaceAll("/", "-").replaceAll(" ", "-").replaceAll(":", "-");
		Path zipfile = Paths.get(StoryBuilderNotebook.getAppPath().toString() + "\\exports\\" + zipName + ".zip");
		log.info("Time for the two paths to be made: {}", System.currentTimeMillis() - startTimeOrigin);
		try {
			String bookData = gson.toJson(book);

			long startTime1 = System.currentTimeMillis();
			ZipOutputStream zout = new ZipOutputStream(Files.newOutputStream(zipfile));
			log.info("Time for the two output streams to be made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime2 = System.currentTimeMillis();
			ZipEntry entry = new ZipEntry("Notebook Export.json");
			zout.putNextEntry(entry);
			zout.write(bookData.getBytes());

			log.info("Time for the data to get written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);

			long startTime3 = System.currentTimeMillis();
			zout.finish();
			zout.close();
			log.info("Time to finish and close stream: {}", System.currentTimeMillis() - startTime3);
			log.info("Time since the data got written: {}", System.currentTimeMillis() - startTime2);
			log.info("Time since the output stream was made: {}", System.currentTimeMillis() - startTime1);
			log.info("Time since path creation: {}", System.currentTimeMillis() - startTimeOrigin);
		} catch (IOException e1) {
			log.catching(e1);
		}
		log.info(StoryBuilderNotebook.SEPERATOR);
	}

	public static void writeToSaveFile() {
		if (!saveFile.toFile().exists()) {
			try {
				saveFile.toFile().createNewFile();
			} catch (IOException e) {
				log.catching(e);
			}
		}
		String Data = gson.toJson(StoryBuilderNotebook.books);
		try {
			FileUtils.writeStringToFile(saveFile.toFile(), Data);
		} catch (IOException e) {
			log.catching(e);
		}
	}

	/**
	 * @return the saveFile
	 */
	public static Path getSaveFile() {
		return saveFile;
	}

	/**
	 * @param saveFile the saveFile to set
	 */
	public static void setSaveFile(Path saveFile) {
		FileUtilities.saveFile = saveFile;
	}

}
