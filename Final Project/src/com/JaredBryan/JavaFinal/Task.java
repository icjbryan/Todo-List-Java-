package com.JaredBryan.JavaFinal;

public class Task {
	private String name;
	private boolean isComplete;
	
	public Task(String name) {
		this.name = name;
		this.isComplete = false;
		
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isComplete() {
		return isComplete;
	}
	
	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	@Override
	public String toString() {
		String message = "";
		if(this.isComplete == true) {
			message = "(Complete)";
		}
		return this.name + message;
		//shorthand return this.name + (this.isComplete ? "(Complete)" : "");
	}

	
}
