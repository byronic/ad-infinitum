/*
 * License
 * 
 * 
 * Thing
 */
package online.byronic.character;

import online.byronic.stats.Statistics;

// Think of this interface as a character sheet
public interface CharacterI {
	/*
	 * A better way to think about characters in an RPG might exist;
	 * however, this program will standardize the method of thinking
	 * about characters as character sheets.
	 * In order:
	 *  X Name / naming conventions
	 *  X Stats package should have its own class; cannot be null
	 *  X Inventory package should have its own class; can be null if no inventory/loot table
	 *  X Loot table (possible duplicate of inventory?)
	 *  O Skills/spells list; can be empty but not null
	 *  X Temporary conditions (buffs/debuffs); can be empty but not null
	 *  X Equipped items; can be empty but not null; only used for PCs
	 *  X Reputations; can be used to check for preferred / hostile reps (NPCs) or keep track of reps (PCs)
	 *  O -- Move to meta-info: Achievements; PC-specific? Possibly meta-info for game. Unsure.
	 *  X Map location, kill/alive
	 */
	
	// 1. get information regarding the character
	public String getName(); // the character's real name, be it the virtuous Longhorn or the horribad Rotide.
	public boolean isAlive();
	public int getX(); // x coordinate
	public int getY(); // y coordinate
	public String getSubjectPronoun(); // returns appropriate he/she/singular they
	public String getObjectPronoun(); // returns appropriate him/her/singular them
	public String getPossessivePronoun(); // returns appropriate his/her/their
	public String getFriendlyName(); // returns randomized friend/obnobbler/other non-gender-specific items
	public String getClassName(); // warrior/oracle/etc
	public int getLevel(); // level of character, as in level 2 wizard
	// stats package Vigor, Magic, Charm
	// TODO: This should be its own class.
	Statistics stats;
	
	// inventory
	// TODO: Refactor to a class (see equipped items)
	public int getAvailableInventorySlots();
	public int getTotalInventorySlots();
	public int setTotalInventorySlots(int newTotal);
	public int modifyTotalInventorySlots(int modification);
	public int addToInventoryAtNextAvailableSlot(int itemId);
	public int addToInventoryAtPosition(int itemId, int position);
	// returns number of total instances of item (can be 0 if not in inventory)
	public int inventoryContains(int itemId);
	// false if item id did not exist in inventory
	public boolean removeInventoryItem(int itemId); 
	
	// loot table
	// TODO: Consider alternative storage mechanism for loot table
	//       currently comma-separated values of item ids
	public String getLootTable();
	public String appendToLootTable(String toAdd);
	public boolean removeFromLootTable(String toRemove);
	public void createLootTable(String lootList);
	
	// skills/spells
	// TODO: Do this
	
	// buffs/debuffs, temporary conditions
	// TODO: Do this
	
	// equipped items
	// this is essentially a locked-instance inventory
	// with particular slots. 
	// reputations
	
	// perform meta-actions on this character
	// 'kills' the character outright, no questions asked
	public void kill();
	// spawns an instance of this character at coordinates x, y on the _current map_
	public void spawn(int x, int y);	
}
