package com.gruman.coords;

public class Coordinates {
	private int upDown;
	private int eastWest;
	public Coordinates(final int inUpDown,final int inEastWest) {
		this.upDown = inUpDown;
		this.eastWest = inEastWest;
	}
	public int getUpDown() {
		return upDown;
	}
	public void setUpDown(int upDown) {
		this.upDown = upDown;
	}
	public int getEastWest() {
		return eastWest;
	}
	public void setEastWest(int eastWest) {
		this.eastWest = eastWest;
	}
	@Override
	public String toString() {
		return (upDown + "," + eastWest);
	}
	
	public void moveSouth(){
		upDown -= 5;
	}
	public void moveNorth(){
		upDown += 5;
	}
	public void moveEast(){
		eastWest -=5;
	}
	public void moveWest(){
		eastWest +=5;
	}
	public void moveSouthEast(){
		eastWest -=5;
		upDown -= 5;
	}
	public void moveNorthEast(){
		upDown += 5;
		eastWest -=5;
	}
	public void moveSouthWest(){
		eastWest +=5;
		upDown -= 5;
	}
	public void moveNorthWest(){
		upDown += 5;
		eastWest +=5;
	}
}
