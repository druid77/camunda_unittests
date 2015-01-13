Unit tests related to Camunda.

To run with async script task: 

```mvn -Dtest=SimpleTestCase#simpleWithAsync test```

```
**** Running simple_with_async test...
IS ENDED: false
IS SUSP: false
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.578 sec
```

----

To run with no async script task: 

**```mvn -Dtest=SimpleTestCase#simpleNoAsync test```**

```
**** Running simple_no_async test...
SCRIPT TASK HERE
IS ENDED: true
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.542 sec
```
