package ui;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/18/17 2:16 PM
 * @author Russell
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TargetBasedScreenTest.class,
	InventoryBasedScreenTest.class,
	HelpScreenTest.class,
	LookScreenTest.class,
	ExamineScreenTest.class,
	ReadSpellScreenTest.class,
	PlayScreenTest.class,
	DropScreenTest.class,
	FireWeaponScreenTest.class,
	ScreenTest.class,
	StartScreenTest.class,
	WinScreenTest.class,
	QuaffScreenTest.class,
	ReadScreenTest.class,
	ThrowScreenTest.class,
	CastSpellScreenTest.class,
	ThrowAtScreenTest.class,
	EquipScreenTest.class,
	LevelUpScreenTest.class,
	LoseScreenTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/17 2:16 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
