package com.tnsif.inheritance;

class Pushnotification extends Notification{

	String mess="push notification";
	
void display() {
	System.out.println("child:"+mess);
	System.out.println("parent:"+super.mess);
}
public static void main(String[] args) {
	Pushnotification p=new Pushnotification();
	p.display();
}
}
