package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Hi! What is your name?");// asks for the name.
		String inputPrime = console.nextLine();
		String[] input = inputPrime.split(" ");
		int namePlace = input.length;
		if(namePlace == 1){
			namePlace=1;
		}
		else if(namePlace == 4){
			namePlace = 4;
		}
		else if(namePlace == 2){
			if(input[0].equals("I'm")||input[0].equals("i'm")||input[0].equals("im")||input[0].equals("Im")){
				namePlace=2;
			}
		}
		else if(namePlace == 3){
			namePlace =3;
		}
		else{
			namePlace=namePlace;
		}
		String name = nameFunc(namePlace, input );

	}

	static String nameFunc(int namePlace, String[] input){
		String[] inputArray = input;
		String name = inputArray[namePlace-1];//name
		Scanner console = new Scanner(System.in);
		System.out.println("Your name is "+name+"?");
		String yorn;
		while(true) {
			yorn = console.nextLine();
			if (yorn.equals("Yes") || yorn.equals("yes")) {
				System.out.println("Hello " + name);
				break;
			} else if (yorn.equals("No") || yorn.equals("no")) {
				System.out.println("I'm sorry, what's your name?");
				name = console.nextLine();
				System.out.println("Your name is " + name + "?");
			} else {
				System.out.println("I'm sorry, you have to enter a \"yes\" or \"no\"");
			}
		}

			return name;//returns the name for later use.

	}

}