$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Add and verify in AMAZON.co.uk",
  "description": "Add book in basket and verify",
  "id": "add-and-verify-in-amazon.co.uk",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5481372283,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add book in basket and verify",
  "description": "",
  "id": "add-and-verify-in-amazon.co.uk;add-book-in-basket-and-verify",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": ": Add book test in amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": ": Verify book steps in amazon",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": ": Complete test verify add book basket",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Amazon_Book()"
});
formatter.result({
  "duration": 14252267385,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_Steps()"
});
formatter.result({
  "duration": 123163914,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"hlb-view-cart-announce\"}\nCommand duration or timeout: 38 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027LuchoPC\u0027, ip: \u0027192.168.0.110\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d43.0.1, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: bf2344ad-b9ce-4db5-bde7-8b00c38ff187\n*** Element info: {Using\u003did, value\u003dhlb-view-cart-announce}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat steps.Steps.Verify_Steps(Steps.java:54)\r\n\tat ✽.When : Verify book steps in amazon(features/Amazon.feature:7)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"hlb-view-cart-announce\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027LuchoPC\u0027, ip: \u0027192.168.0.110\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Lucho/AppData/Local/Temp/anonymous2821308786718850780webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/Lucho/AppData/Local/Temp/anonymous2821308786718850780webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Lucho/AppData/Local/Temp/anonymous2821308786718850780webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/Lucho/AppData/Local/Temp/anonymous2821308786718850780webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/Lucho/AppData/Local/Temp/anonymous2821308786718850780webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.AddBasket_Verify()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 558157229,
  "status": "passed"
});
});