package com.grumman.domain;

import java.util.HashMap;
import java.util.Map;

public class OtherUsersCoords {
	private static  Map currentUsersCoords;

	private OtherUsersCoords(){
		currentUsersCoords = new HashMap<String,String>();
	}

	public static void addOrUpdateCoords(String userId, String coords){
		currentUsersCoords.put(userId, coords);

	}

	public static void removeCoordsFromList(String userId){
		currentUsersCoords.remove(userId);
	}
	
	public static Map<String, String> getAllUsersCoords(){
		return currentUsersCoords;
	}

}
