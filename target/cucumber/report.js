$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BuscarEnGoogle.feature");
formatter.feature({
  "name": "Google search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "successfull search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Arthur\u0027s on google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.arthur_s_on_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He validates that the result is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.he_validates_that_the_result_is_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});