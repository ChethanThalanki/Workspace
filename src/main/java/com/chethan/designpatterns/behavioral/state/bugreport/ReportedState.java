package com.chethan.designpatterns.behavioral.state.bugreport;

public class ReportedState extends BugReportState {
	
	@Override
	public void reportBug(BugReport ctx,String bugDescription){
		ctx.setBugDescription(bugDescription);
	}
	
	@Override
	public void acceptBugReport(BugReport ctx){
		ctx.setCurrentState(BugReport.ACCEPTED);
	}

}
