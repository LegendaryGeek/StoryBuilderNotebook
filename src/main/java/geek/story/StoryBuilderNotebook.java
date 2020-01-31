package geek.story;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.DateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import geek.story.elements.GSCharacter;
import geek.story.elements.Item;
import geek.story.elements.Technology;
import geek.story.elements.items.TechItem;
import geek.story.elements.items.Weapon;
import geek.story.file.FileUtilities;
import geek.story.window.NotebookFrame;

/**
 * @author LegendaryGeek
 *
 */
public class StoryBuilderNotebook {

	static Logger log = LogManager.getLogger(StoryBuilderNotebook.class);
	private static boolean running = true;
	public static String appName = "Character Story Notebook";
	public static final String SEPERATOR = "-------------------------";
	private static NotebookFrame frame;
	public static ArrayList<Notebook> books = new ArrayList<>();
	static Gson gson = new GsonBuilder().setPrettyPrinting().create();
	private static boolean debugMode = false;
	private static Path appPath = Paths.get("C:\\LegendaryGeek\\CharacterStoryNotebook");

	public static void main(String[] args) {

		log.info("Month: {}", Calendar.getInstance().get(Calendar.MONTH));
		log.info("Day of Month: {}", Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		log.info("Day of Week: {}", Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		log.info("Day of Week in Month: {}", Calendar.getInstance().get(Calendar.DAY_OF_WEEK_IN_MONTH));
		log.info("Day of Year: {}", Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
		log.info("Year: {}", Calendar.getInstance().get(Calendar.YEAR));
		log.info("Week of Month: {}", Calendar.getInstance().get(Calendar.WEEK_OF_MONTH));
		log.info("Week of Year: {}", Calendar.getInstance().get(Calendar.WEEK_OF_YEAR));
		log.info("Hour: {}", Calendar.getInstance().get(Calendar.HOUR));
		log.info("Hour of Day: {}", Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		log.info("Minute: {}", Calendar.getInstance().get(Calendar.MINUTE));

		log.info(SEPERATOR);
		log.info("Date Format: {}",
				DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(Date.from(Instant.now())));

		Notebook book = new Notebook();
		ElementBase base = new ElementBase();
		base.setBook(book);

		GSCharacter kenz = new GSCharacter();

		Weapon sword = new Weapon();
		Item statTest = new Item();
		Technology tech = new Technology();
		TechItem itemNotInInventory = new TechItem();
		TechItem item = new TechItem();

		itemNotInInventory.setName("LGK7 Phone");
		itemNotInInventory.setBook(book);
		itemNotInInventory.setTech(new Technology());

		book.setName("Sample Book");
		Notebook book2 = new Notebook();
		book2.setName("Blank Book");

		statTest.setName("Debug Item");
		statTest.addGlobalStat(statTest, "wtf", "A GLOBAL STAT?!");

		sword.setName("Excalibur");
		sword.addStat(sword, "Magic Castability", "none");
		sword.addGlobalStat(sword, "Weight", "almost none");
		sword.setDamage(500);
		sword.setDurability(0);

		item.setName("Radio");
		item.addStat(item, "Range of music", "small - 2ft.");
		item.setTech(tech);
		item.setPowerUnits(item.getTech(), 500);
		item.setType("Listening Device");

		log.info(SEPERATOR);

		book.getItems().forEach(ListItem -> {
			log.info("Item in List: {}", ListItem.getName());
		});

		log.info(SEPERATOR);

		kenz.setName("Kenzie the fairy fox");
		kenz.setNickname("kenz");
		kenz.getInventory().add(sword);
		kenz.getInventory().add(item);

		log.info("Sword name: {}", sword.getName());
		log.info("Sword Damage: {}", sword.getDamage());
		log.info("Sword Durability: {}", sword.getDurability());

		log.info(SEPERATOR);

		log.info("Item Name: {}", item.getName());
		log.info("Item Power: {}", item.getPowerUnits(item.getTech()));
		log.info("Item Type: {}", item.getType());

		log.info(SEPERATOR);

		log.info("kenz name: {}", kenz.getName());
		log.info("kenz nickname: {}", kenz.getNickname());
		if (!kenz.getGlobalCustomStatsMap().isEmpty()) {
			kenz.getGlobalCustomStatsMap().entrySet().forEach(stat -> {
				log.info("Global Stat: ");
				log.info(stat.getKey() + ", ");
				log.info(stat.getValue());
			});
		}

		if (!statTest.getGlobalCustomStatsMap().isEmpty()) {
			statTest.getGlobalCustomStatsMap().entrySet().forEach(stat -> {
				log.info("Item-Only Global Stat: ");
				log.info(stat.getKey() + ", ");
				log.info(stat.getValue());
			});
		}
		kenz.getInventory().forEach(inv -> {
			log.info("kenz inventory item name: {}", inv.getName());
			log.info("This item is a {}", inv.getClass().getSimpleName());

			if (!inv.getCustomStatsMap().isEmpty()) {
				inv.getCustomStatsMap().entrySet().forEach(stat -> {
					log.info("Custom stat found!");
					log.info("Stat Key: {}", stat.getKey());
					log.info("Stat value: {}", stat.getValue());
				});
			}
			log.info(System.lineSeparator());

		});

		FileUtilities.writeGzipExport();
		FileUtilities.writeGzipExport(book);
		FileUtilities.writeGzipExport(books.toArray(new Notebook[0]));
		FileUtilities.writezipExport();
		FileUtilities.writezipExport(book);
		FileUtilities.writezipExport(books.toArray(new Notebook[0]));

//		log.info("Notebook");
//		log.info(gson.toJson(book));

		frame = new NotebookFrame();

		while (isRunning()) {
			try {
				TimeUnit.NANOSECONDS.sleep(500);
			} catch (InterruptedException e) {
				log.catching(e);
			}
		}

	}

	/**
	 * @return if the program is or should be running
	 */
	public static boolean isRunning() {
		return running;
	}

	/**
	 * @param running sets weather or not the program should be running
	 */
	public static void setRunning(boolean running) {
		StoryBuilderNotebook.running = running;
		log.info("Running set to: {}", running);
	}

	/**
	 * @return
	 */
	public static NotebookFrame getFrame() {
		return frame;
	}

	/**
	 * @return
	 */
	public static boolean isDebugMode() {
		return debugMode;
	}

	/**
	 * @param debugMode
	 */
	public static void setDebugMode(boolean debugMode) {
		StoryBuilderNotebook.debugMode = debugMode;
	}

	/**
	 * @return the appPath
	 */
	public static Path getAppPath() {
		return appPath;
	}

	/**
	 * @param appPath the appPath to set
	 */
	public static void setAppPath(Path appPath) {
		StoryBuilderNotebook.appPath = appPath;
	}

}
