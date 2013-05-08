package com.example.PrayerTimes;

public class Prayer {
	double desiredAngle;
	int prayerTime;
	String type; // "exact", "max"
	String name;
	Prayer(double desAng, String type, String name){
		this.desiredAngle = desAng;
		this.prayerTime = 0;
		this.type = type;
		this.name = name;
	}
	
	public void setTime(int second){
		this.prayerTime = second;
	}
}