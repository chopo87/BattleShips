package com.bs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ship {
	
	private int[] startCell;
	private int size;
	private char direction;
	private ArrayList<ShipCell> cellInfo;
	private ArrayList<Boolean> hitPoints;
	
	public static final char HORIZONTAL = 'H';
	public static final char VERTICAL = 'V';
	
	public Ship(int x, int y, char dir, int size) {
		
		this.startCell = new int[] {x,y};
		this.size = size;
		this.hitPoints = new ArrayList <Boolean>();
		for(int i=0; i<size; i++)
			this.hitPoints.add(Boolean.FALSE);
		
		this.cellInfo = new ArrayList<ShipCell>();

		for(int i=0; i<size; i++) {
			if(direction == HORIZONTAL)
				this.cellInfo.add(new ShipCell(x,y+i));
			else
				this.cellInfo.add(new ShipCell(x+i,y));
		}
		
		this.direction = dir;
		
	}

	public int[] getStartCell() {
		return startCell;
	}

	public void setStartCell(int[] startCell) {
		this.startCell = startCell;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}

	public ArrayList <Boolean> getHitPoints() {
		return hitPoints;
	}

	private void setHitPoints(ArrayList <Boolean> hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public boolean isAlive() {
		return this.cellInfo.contains(Boolean.FALSE) ? true : false; 
	}
	
	public boolean assesHit(int x, int y) {
		ArrayList<int[]> sArray = new ArrayList<int[]>();
		
		if(direction == HORIZONTAL) {
			
		}
		else {
			
			
		}
		
		return false;
		
	}

}


