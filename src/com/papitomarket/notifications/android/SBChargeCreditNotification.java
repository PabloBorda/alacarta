package com.papitomarket.notifications.android;


/*
 * Notification types: each type of notification renders to the attached Activity
 * When a message arrives, the json is parsed, so an instance of the matching notification
 * is created.
 * 
 * Author: Pablo Tomas Borda Di Berardino
 * 
 * */
public class SBChargeCreditNotification extends SBNotification{
	
	
	
	public SBChargeCreditNotification(String body){
		super(body);
	}
	

}
