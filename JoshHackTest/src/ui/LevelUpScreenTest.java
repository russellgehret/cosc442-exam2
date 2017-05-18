package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import game.Tile;
import game.Creature;
import asciiPanel.AsciiPanel;
import game.AppletMain;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LevelUpScreenTest</code> contains tests for the class <code>{@link LevelUpScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/17 2:16 PM
 * @author Russell
 * @version $Revision: 1.0 $
 */
public class LevelUpScreenTest {
	/**
	 * Run the LevelUpScreen(Creature,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Test
	public void testLevelUpScreen_1()
		throws Exception {
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int picks = 1;

		LevelUpScreen result = new LevelUpScreen(player, picks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		LevelUpScreen fixture = new LevelUpScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		LevelUpScreen fixture = new LevelUpScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		LevelUpScreen fixture = new LevelUpScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		LevelUpScreen fixture = new LevelUpScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		LevelUpScreen fixture = new LevelUpScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LevelUpScreenTest.class);
	}
}