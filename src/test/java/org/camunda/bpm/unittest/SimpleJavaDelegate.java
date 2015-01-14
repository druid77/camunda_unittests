package org.camunda.bpm.unittest;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SimpleJavaDelegate implements JavaDelegate {
	
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println(Thread.currentThread() + " -- SimpleJavaDelegate started");
		long timeToSleep = (long)(Math.random()*10000.0);
		System.out.println(Thread.currentThread() + " -- SimpleJavaDelegate sleeping for " + timeToSleep + " ms...");
		Thread.sleep(timeToSleep);
		execution.setVariable(Thread.currentThread().toString(), Thread.currentThread().toString());
	}

}
