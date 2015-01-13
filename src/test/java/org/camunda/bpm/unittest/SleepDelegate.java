package org.camunda.bpm.unittest;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SleepDelegate implements JavaDelegate {
	
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println(Thread.currentThread() + " -- LockingDelegate is running");
		execution.setVariable(Thread.currentThread().toString(), Thread.currentThread().toString());
	}

}
