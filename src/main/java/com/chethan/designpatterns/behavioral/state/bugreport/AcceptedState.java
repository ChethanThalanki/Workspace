package com.chethan.designpatterns.behavioral.state.bugreport;

public class AcceptedState extends BugReportState {
	
	@Override
	public void assignBugToDeveloper(BugReport ctx,String assignedDeveloperName){
		ctx.setAssignedDeveloperName(assignedDeveloperName);
		ctx.setCurrentState(BugReport.ASSIGNED);
	}

}
