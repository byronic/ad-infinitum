package online.byronic.stats;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStatistics {

	static Statistics statsZeroes;
	static Statistics statsLoaded;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		statsZeroes = new Statistics();
		statsLoaded = new Statistics(5, 6, 7);
	}

	@Test
	public void testZeroesSetup() 
	{
		assertEquals("All stats of base constructor setup should be 0", statsZeroes.getCurrentVigor(), 0);
		assertEquals("All stats of base constructor setup should be 0", statsZeroes.getCurrentMagic(), 0);
		assertEquals("All stats of base constructor setup should be 0", statsZeroes.getCurrentCharm(), 0);
		assertEquals("All stats of base constructor setup should be 0", statsZeroes.getBaseVigor(), 0);
		assertEquals("All stats of base constructor setup should be 0", statsZeroes.getBaseMagic(), 0);
		assertEquals("All stats of base constructor setup should be 0", statsZeroes.getBaseCharm(), 0);
	}
	
	@Test
	public void testLoadedSetup()
	{
		assertEquals("Loaded vigor should be 5", statsLoaded.getCurrentVigor(), 5);
		assertEquals("Loaded vigor should be 5", statsLoaded.getBaseVigor(), 5);
		assertEquals("Loaded magic should be 6", statsLoaded.getCurrentMagic(), 6);
		assertEquals("Loaded magic should be 6", statsLoaded.getBaseMagic(), 6);
		assertEquals("Loaded charm should be 7", statsLoaded.getCurrentCharm(), 7);
		assertEquals("Loaded charm should be 7", statsLoaded.getBaseCharm(), 7);
	}
	
	@Test
	public void testModifyVigor()
	{
		assertEquals("Check modifying base Vigor by 2 works as expected", statsLoaded.modifyBaseVigor(2), 7);
		assertEquals("Check modifying current Vigor by 2 works as expected", statsLoaded.modifyCurrentVigor(2), 9);
		assertEquals("Returning Vigor to its original state", statsLoaded.modifyBaseVigor(-2), 5);
		assertEquals("Returning current Vigor to its original state", statsLoaded.modifyCurrentVigor(-2), 5);
	}
	
	@Test
	public void testModifyMagic()
	{
		assertEquals("Check modifying base Magic by 2 works as expected", statsLoaded.modifyBaseMagic(2), 8);
		assertEquals("Check modifying current Magic by 2 works as expected", statsLoaded.modifyCurrentMagic(2), 10);
		assertEquals("Returning Magic to its original state", statsLoaded.modifyBaseMagic(-2), 6);
		assertEquals("Returning current Magic to its original state", statsLoaded.modifyCurrentMagic(-2), 6);
	}
	
	@Test
	public void testModifyCharm()
	{
		assertEquals("Check modifying base Charm by 2 works as expected", statsLoaded.modifyBaseCharm(2), 9);
		assertEquals("Check modifying current Charm by 2 works as expected", statsLoaded.modifyCurrentCharm(2), 11);
		assertEquals("Returning Charm to its original state", statsLoaded.modifyBaseCharm(-2), 7);
		assertEquals("Returning current Charm to its original state", statsLoaded.modifyCurrentCharm(-2), 7);
	}

}
