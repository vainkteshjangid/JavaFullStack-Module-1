package com.cg.lab2.ex1;

public abstract class MediaItem extends Item{
	int runTime;

	public MediaItem(int uid, String title, int numberOfCopies,int runTime) {
		super(uid, title, numberOfCopies);
		this.runTime=runTime;

	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Run time : "+runTime);
	}

	
	

}
