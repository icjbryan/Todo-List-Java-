package com.JaredBryan.JavaFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Final {
	//global variables
	
	//list of tasks
	static ArrayList<Task> TaskList;
	//read from the console
	static Scanner scan;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//initialize Task array
		TaskList = new ArrayList<Task>();
		
		//initialize scanner
		scan = new Scanner(System.in);
		//start and stop variable
		boolean isRunning = true;
		
		TaskList.add(new Task("Do Homework"));
		TaskList.add(new Task ("Read programming blog"));
		TaskList.add(new Task("Spend time with family"));
		TaskList.add(new Task("Watch the new season of a cool new show"));
		
		//loop
		do {
			//display menu to user
			displayMenu();
			//get user's choice
			int usersChoice = readChoice();
			switch(usersChoice) {
			case 1: //add a task 
				System.out.println("Name of the Task to add:");
				addMenu();
				String taskName = scan.nextLine();
				addTask(taskName);
				break;
			case 2: //remove a task
				listTasks();
				System.out.println("Task to Remove");
				int removeId = readChoice();
				removeTask(removeId);
				//display for removal
				//user input utilizing readChoice()
				//remove task method 
				break;
			case 3: //mark task complete
				listTasks();
				System.out.println("Task to Complete");
				int completeId = readChoice();
				completeTask(completeId);
				break;
				//menu display
				//user input utilizing readChoice
				//mark as completed method -> change the property of isComplete for the task -> utilize my class method-> 
				
			case 4: //List out tasks
				listTasks();
				//list out task method-> loop through TaskList -> show each element (utilize toString class method for task)
				
				break;
			case 0: //quitting
				isRunning = false;
				break;
			default:
				System.out.println("Invalid Input!");
			}
			
			
		} while(isRunning);
	

		
	}
	//add menu
	public static void addMenu() {
		System.out.println("Please enter the task name.");
		}
	
	//add task method
	public static void addTask(String name) {
		taskList(new Task(name));
	}
	
	private static void taskList(Task task) {
		// TODO Auto-generated method stub
		
	}
	//main menu display
	public static void displayMenu() {
		System.out.println("--Main Menu--");
		System.out.println("1. Add a Task");
		System.out.println("2. Remove an Task");
		System.out.println("3. Mark Task Complete");
		System.out.println("4. List Out Tasks");
		System.out.println("0. Quit");
		System.out.println("Enter your numeric choice");
	}
	
	//need a method to read user's input
	public static int readChoice() {
		int results = scan.nextInt();
		scan.nextLine();
		return results;
	}
	
	public static void listTasks() {
		System.out.println("---Task---");
		for(int i= 0; i < TaskList.size(); i++ ) {
			System.out.println(i + 1 +". " + TaskList.get(i).toString());
			}
		
	}
	public static void completeTask(int id) {
		TaskList.get(id-1).setIsComplete(true);
	}
	
	public static void removeTask(int id) {
		TaskList.remove(id-1);
	}
}


