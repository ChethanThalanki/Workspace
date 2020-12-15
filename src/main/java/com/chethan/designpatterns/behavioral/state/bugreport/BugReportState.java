package com.chethan.designpatterns.behavioral.state.bugreport;

//The state pattern solves problems where an object should change its behavior when its internal state changes.
//Also, adding new states should not affect the behavior of existing states.
public abstract class BugReportState {
	
	
	public void reportBug(BugReport ctx,String bugDescription){
		throw new IllegalStateException("this operation not valid");
	}
	public void acceptBugReport(BugReport ctx){
		throw new IllegalStateException("this operation not valid");
	}
	public void assignBugToDeveloper(BugReport ctx,String assignedDeveloperName){
		throw new IllegalStateException("this operation not valid");
	}
	public void resolveBug(BugReport ctx,String bugSolution){
		throw new IllegalStateException("this operation not valid");
	}

}
