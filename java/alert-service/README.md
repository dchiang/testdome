# [Alert Service](https://www.testdome.com/questions/java/alert-service/85618 "Alert Service")

Refactor the AlertService and MapAlertDAO classes:

* Create a new package-private interface, named AlertDAO, that contains the same methods as MapAlertDAO.
* MapAlertDAO should implement the AlertDAO interface.
* AlertService should have a public constructor that accepts AlertDAO.
The raiseAlert and getAlertTime methods should use the object passed through the constructor.

### Test Criteria
* MapAlertDAO implements AlertDAO interface.
* AlertService accepts AlertDAO in its constructor.
* The raiseAlert and getAlertTime methods use AlertDAO passed through constructor.
