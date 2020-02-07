package com.hometask;
import java.util.*;
public class Giftbox {

	public static void main(String[] args) {
		int choice,total_weight=0,Dairymilk_weight=180,kitkat_weight=60,Ladoo_weight=100,Halwa_weight=20,jilebi_weight=25,quantity;
		char addmore;
		boolean flag=true;
		Newyeargiftbox object;
		HashMap<String, Integer> mygiftbox = new HashMap<>();
		Scanner scanner_object = new Scanner(System.in);
		System.out.println("Select items in your giftbox : ");
		while(flag) {
		System.out.println("1.Dairymilk\n 2.Kitkat\n 3.Ladoo\n 4.Halwa\n 5.Jilebi\n Enter your choice");
		choice=scanner_object.nextInt();
		System.out.println(choice);
		switch(choice) {
		case 1:
		System.out.println("Enter Dairymilk units : ");
		quantity=scanner_object.nextInt();
		object=new Dairymilk();
		total_weight += object.calculate_weight(Dairymilk_weight,quantity);
		mygiftbox.put("dairymilk", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 2:
		System.out.println("Enter Kitkat units : ");
		quantity=scanner_object.nextInt();
		object=new Kitkat();
		total_weight += object.calculate_weight(kitkat_weight,quantity);
		mygiftbox.put("Kitkat", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 3:
		System.out.println("Enter Ladoo units : ");
		quantity=scanner_object.nextInt();
		object=new Ladoo();
		total_weight += object.calculate_weight(Ladoo_weight,quantity);
		mygiftbox.put("Ladoo", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 4:
		System.out.println("Enter Halwa units : ");
		quantity=scanner_object.nextInt();
		object=new Halwa();
		total_weight += object.calculate_weight(Halwa_weight,quantity);
		mygiftbox.put("Halwa", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 5:
		System.out.println("Enter jilebi units : ");
		quantity=scanner_object.nextInt();
		object=new jilebi();
		total_weight += object.calculate_weight(jilebi_weight,quantity);
		mygiftbox.put("jilebi", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		default : System.out.println("Enter correct choice ");
		}
		}
		}

		}