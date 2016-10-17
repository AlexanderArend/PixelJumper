package com.gruman.coords;

public class MoveCoords {

public static Coordinates changeCoords(Coordinates coords, String direction){
	String theDirection = direction.toLowerCase();
	Directions directions = Directions.valueOf(theDirection) ;
	switch (directions){
	case south:
		coords.moveSouth();
		break;
	case north:
		coords.moveNorth();
		break;
	case east:
		coords.moveEast();
		break;
	case west:
		coords.moveWest();
		break;
	case northwest:
		coords.moveNorthWest();
		break;
	case northeast:
		coords.moveNorthEast();
		break;
	case southeast:
		coords.moveSouthEast();
		break;
	case southwest:
		coords.moveSouthWest();
		break;
		
	}
	return coords;
}
}
