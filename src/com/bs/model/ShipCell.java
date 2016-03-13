package com.bs.model;

public class ShipCell {
	private int x;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}

	private int y;
	private boolean isHit;
	
	public ShipCell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.isHit = false;
	}
}
