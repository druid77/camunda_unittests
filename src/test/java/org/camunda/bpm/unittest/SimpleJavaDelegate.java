package org.camunda.bpm.unittest;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SimpleJavaDelegate implements JavaDelegate {
	
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println(Thread.currentThread() + " -- SimpleJavaDelegate is running");
		execution.setVariable(Thread.currentThread().toString(), Thread.currentThread().toString());
	}

}
