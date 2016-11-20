package online.byronic.stats;

public class Statistics 
{
	/* constructor initialized at all-zeroes */
	public Statistics()
	{
		baseVigor = 0;
		baseMagic = 0;
		baseCharm = 0;
		currentVigor = 0;
		currentMagic = 0;
		currentCharm = 0;
	}
	
	/* constructor initialized with custom values; useful for loading or pre-determined stats packages */
	public Statistics(int vigor, int magic,  int charm)
	{
		baseVigor = vigor;
		baseMagic = magic;
		baseCharm = charm;
		currentVigor = vigor;
		currentMagic = magic;
		currentCharm = charm;
	}
	
	/* getters */
	public int getCurrentVigor()
	{
		return currentVigor;
	}
	
	public int getCurrentMagic()
	{
		return currentMagic;
	}
	
	public int getCurrentCharm()
	{
		return currentCharm;
	}
	
	public int getBaseVigor()
	{
		return baseVigor;
	}
	
	public int getBaseMagic()
	{
		return baseMagic;
	}
	
	public int getBaseCharm()
	{
		return baseCharm;
	}
	
	/* modifiers */
	public int modifyCurrentVigor(int modification)
	{
		currentVigor += modification;
		return currentVigor;
	}
	
	public int modifyCurrentMagic(int modification)
	{
		currentMagic += modification;
		return currentMagic;
	}
	
	public int modifyCurrentCharm(int modification)
	{
		currentCharm += modification;
		return currentCharm;
	}
	
	// note that modifying base also modifies current
	public int modifyBaseVigor(int modification)
	{
		baseVigor += modification;
		modifyCurrentVigor(modification);
		return baseVigor;
	}
	
	public int modifyBaseMagic(int modification)
	{
		baseMagic += modification;
		modifyCurrentMagic(modification);
		return baseMagic;
	}
	
	public int modifyBaseCharm(int modification)
	{
		baseCharm += modification;
		modifyCurrentCharm(modification);
		return baseCharm;
	}
	
	/* instance variables */
	
	private int currentVigor;
	private int currentMagic;
	private int currentCharm;
	
	private int baseVigor;
	private int baseMagic;
	private int baseCharm;
}
