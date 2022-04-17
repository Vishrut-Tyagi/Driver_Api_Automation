$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ApiTest.feature");
formatter.feature({
  "line": 2,
  "name": "Api Testing",
  "description": "",
  "id": "api-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validating login api",
  "description": "",
  "id": "api-testing;validating-login-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Database is connected",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User calls login api",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the API call is success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "status in response body is ok",
  "keyword": "And "
});
formatter.match({
  "location": "Api_test.database_is_connected()"
});
formatter.result({
  "duration": 1893987062,
  "status": "passed"
});
formatter.match({
  "location": "Api_test.user_calls_login_api()"
});
formatter.result({
  "duration": 1717449571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 41
    }
  ],
  "location": "Api_test.the_API_call_is_success_with_status_code(int)"
});
formatter.result({
  "duration": 327403406,
  "status": "passed"
});
formatter.match({
  "location": "Api_test.status_in_response_body_is_ok()"
});
formatter.result({
  "duration": 43070,
  "status": "passed"
});
});