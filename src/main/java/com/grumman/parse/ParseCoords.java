package com.grumman.parse;

import com.grumman.coords.Coordinates;

public class ParseCoords {
	public static Coordinates parseCoordinates(String coordsAsString){
		String[] coords = coordsAsString.split(",");
		for(String cord :coords){
			cord = cord.trim();
		}
		return new Coordinates(Integer.parseInt(coords[0]),Integer.parseInt(coords[1]));
	}
}
