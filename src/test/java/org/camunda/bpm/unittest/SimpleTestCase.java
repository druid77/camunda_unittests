/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.unittest;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.runtimeService;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

/**
 * 
 */
public class SimpleTestCase {

  @Rule
  public ProcessEngineRule rule = new ProcessEngineRule();

  
  @Test
  @Deployment(resources = {"simple_no_async.bpmn"})
  public void simpleNoAsync() {
    System.out.println("**** Running simple_no_async test...");
    ProcessInstance processInstance = runtimeService().startProcessInstanceByKey("simple_no_async");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    System.out.println("IS ENDED: " + processInstance.isEnded());
  }
  
  
  @Test
  @Deployment(resources = {"simple_with_async.bpmn"})
  public void simpleWithAsync() {
	System.out.println("**** Running simple_with_async test...");
    ProcessInstance processInstance = runtimeService().startProcessInstanceByKey("simple_with_async");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    System.out.println("IS ENDED: " + processInstance.isEnded());
    System.out.println("IS SUSP: " + processInstance.isSuspended());
  }
  
  @Test
  @Deployment(resources = {"locking.bpmn"})
  public void shouldExecuteProcess() {
	System.out.println("**** Running locking test...");
    ProcessInstance processInstance = runtimeService().startProcessInstanceByKey("locking");
    
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    
    System.out.println("IS ENDED: " + processInstance.isEnded());
    System.out.println("IS SUSP: " + processInstance.isSuspended());
  }

}
