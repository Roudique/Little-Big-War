package com.roudique.lbw.utils;

public class Utilities {
	public static String[] getUnitList() {
		String[] unitList = {"Berserk", "Demon", "Healer", "Necromancer", "Priest",
								"Rogue", "Vampire", "Warlock", "Werewolf", "Wizard"};
		return unitList;
	}
	
	public static int getIndexByUnitName(String name) {
		name = name.toLowerCase();
		int index;
		switch(name) {
			case "berserk" : index = 0;
				break;
			case "demon" : index = 1;
				break;
			case "healer" : index = 2;
				break;
			case "necromancer" : index = 3;
				break;
			case "priest" : index = 4;
				break;
			case "rogue" : index = 5;
				break;
			case "vampire" : index = 6;
				break;
			case "warlock" : index = 7;
				break;
			case "werewolf" : index = 8;
				break;
			case "wizard" : index = 9;
				break;
			default : index = -1;
				break;
		}
		return index;
			
	}
	
	public static String getUnitNameByIndex(int index) {
		String unitName;
		switch(index) {
			case 0 : unitName = "Berserk";
				break;
			case 1 : unitName = "Demon";
				break;
			case 2 : unitName = "Healer";
				break;
			case 3 : unitName = "Necromancer";
				break;
			case 4 : unitName = "Priest";
				break;
			case 5 : unitName = "Rogue";
				break;
			case 6 : unitName = "Vampire";
				break;
			case 7 : unitName = "Warlock";
				break;
			case 8 : unitName = "Werewolf";
				break;
			case 9 : unitName = "Wizard";
				break;
			default : unitName = null;
				break;
		}
		return unitName;
	}
}

