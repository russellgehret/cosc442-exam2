package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/18/17 2:19 PM
 * @author Russell
 * @version $Revision: 1.0 $
 */
public class WorldTest {
	/**
	 * Run the World(Tile[][][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testWorld_1()
		throws Exception {
		Tile[][][] tiles = new Tile[][][] {};

		World result = new World(tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void add(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature pet = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.add(pet);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@380a2852
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptyLocation_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4c231afe
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptyLocation_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1414bf21
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptyLocation_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22bf1c02
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptyLocation_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7accf8a8
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptyLocation_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5a628c05
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptyLocation_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@29a5f7c8
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptySpace_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = null;
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5aeb2bee
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptySpace_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4f7e1d0f
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptySpace_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@38a309c6
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptySpace_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4adced55
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptySpace_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@f5ba7c6
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testAddAtEmptySpace_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@625ab600
		assertTrue(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@674092c3
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testColor_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@28fdbcd6
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testColor_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@586d1134
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testCreature_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testCreature_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the int depth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testDepth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		int result = fixture.depth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testDig_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@177ce4bc
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testDig_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@34465878
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@57167339
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testGlyph_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@61200a6e
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testGlyph_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@152de731
		assertEquals(' ', result);
	}

	/**
	 * Run the int height() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testHeight_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		int result = fixture.height();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Item result = fixture.item(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2765f0a
		assertNotNull(result);
	}

	/**
	 * Run the void remove(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.remove(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@21f75bbe
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2398a20d
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1e2a216
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7c2a9dcf
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6762499c
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@c28dd31
	}

	/**
	 * Run the void remove(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.remove(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1365bc01
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = -1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = -1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = -1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testTile_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3c111a8b
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@151493bc
	}

	/**
	 * Run the int width() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	@Test
	public void testWidth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		int result = fixture.width();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 2:19 PM
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
	 * @generatedBy CodePro at 5/18/17 2:19 PM
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
	 * @generatedBy CodePro at 5/18/17 2:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}