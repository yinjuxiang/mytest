package com.steam.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestQuartz extends QuartzJobBean{
    
	private MyJobClass myJobClass;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		
		    myJobClass.testJob();
	}

}
