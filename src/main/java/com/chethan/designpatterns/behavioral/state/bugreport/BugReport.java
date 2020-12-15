package com.chethan.designpatterns.behavioral.state.bugreport;

public class BugReport {
	
	 static final BugReportState REPORTED = new ReportedState();
	 static final BugReportState ACCEPTED = new AcceptedState();
	 static final BugReportState ASSIGNED = new AssignedState();
	 static final BugReportState RESOLVED = new ResolvedState();
	
	private BugReportState currentState = REPORTED;

	public BugReportState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(BugReportState currentStatus) {
		this.currentState = currentStatus;
	}
	
	public void reportBug(String bugDescription){
		
		currentState.reportBug(this, bugDescription);
		/*if(currentState == null){
			currentState = REPORTED;
			this.bugDescription = bugDescription;
		}else if(currentState.equalsIgnoreCase(REPORTED)){
			this.bugDescription = bugDescription;
		}else if(currentState.equalsIgnoreCase(ACCEPTED)){
			System.out.println("You can not change description after it's accepted!");
		}else if(currentState.equalsIgnoreCase(ASSIGNED)){
			System.out.println("You can not change description after it's assigned!");
		}else if(currentState.equalsIgnoreCase(RESOLVED)){
			System.out.println("You can not change description after it's resolved!");
		}*/
		
	}
	public void acceptBugReport(){
		currentState.acceptBugReport(this);
		/*if(currentState == null){
			System.out.println("You have to report the bug before it can be accepted!");
		}else if(currentState.equalsIgnoreCase(REPORTED)){
			currentState = ACCEPTED;
		}else if(currentState.equalsIgnoreCase(ACCEPTED)){
			System.out.println("This bug is already accepted!");
		}else if(currentState.equalsIgnoreCase(ASSIGNED)){
			System.out.println("You can not accept a bug after it's assigned!");
		}else if(currentState.equalsIgnoreCase(RESOLVED)){
			System.out.println("This bug already resolved!");
		}*/
	}
	public void assignBugToDeveloper(String assignedDeveloperName){
		
		currentState.assignBugToDeveloper(this, assignedDeveloperName);
		
		/*if(currentState == null){
			System.out.println("You have to report the bug and be accepted before it's assigned!");
		}else if(currentState.equalsIgnoreCase(REPORTED)){
			System.out.println("It must be accepted before it can be assigned");
		}else if(currentState.equalsIgnoreCase(ACCEPTED)){
			currentState = ASSIGNED;
			this.assignedDeveloperName = assignedDeveloperName;
		}else if(currentState.equalsIgnoreCase(ASSIGNED)){
			System.out.println("it's already assigned!");
		}else if(currentState.equalsIgnoreCase(RESOLVED)){
			System.out.println("This bug already resolved!");
		}*/
	}
	public void resolveBug(String bugSolution){
		currentState.resolveBug(this, bugSolution);
		
		/*if(currentState == null){
			System.out.println("You have to report the bug and be accepted before it's assigned or resolved!");
		}else if(currentState.equalsIgnoreCase(REPORTED)){
			System.out.println("It must be accepted before it can be resolved!");
		}else if(currentState.equalsIgnoreCase(ACCEPTED)){
			System.out.println("The bug must be assigned to a developer first!");
		}else if(currentState.equalsIgnoreCase(ASSIGNED)){
			currentState = RESOLVED;
			this.bugSolution = bugSolution;
		}else if(currentState.equalsIgnoreCase(RESOLVED)){
			System.out.println("This bug already resolved you can't resolve again!");
		}*/
	}
	
	String bugDescription,assignedDeveloperName,bugSolution;

	public String getBugDescription() {
		return bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	public String getAssignedDeveloperName() {
		return assignedDeveloperName;
	}

	public void setAssignedDeveloperName(String assignedDeveloperName) {
		this.assignedDeveloperName = assignedDeveloperName;
	}

	public String getBugSolution() {
		return bugSolution;
	}

	public void setBugSolution(String bugSolution) {
		this.bugSolution = bugSolution;
	}
	
}
