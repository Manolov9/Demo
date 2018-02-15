$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Add and verify in AMAZON.co.uk",
  "description": "Add book in basket and verify",
  "id": "add-and-verify-in-amazon.co.uk",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2748202575,
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
  "duration": 15569447740,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_Steps()"
});
formatter.result({
  "duration": 658243483,
  "status": "passed"
});
formatter.match({
  "location": "Steps.AddBasket_Verify()"
});
formatter.result({
  "duration": 8573685056,
  "status": "passed"
});
formatter.after({
  "duration": 277347646,
  "status": "passed"
});
});