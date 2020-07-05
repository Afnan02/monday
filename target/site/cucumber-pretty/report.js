$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Account.feature");
formatter.feature({
  "line": 1,
  "name": "Account Page Functionality",
  "description": "This Feature deal with the Signin functionality",
  "id": "account-page-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify User should be in Account Page",
  "description": "",
  "id": "account-page-functionality;verify-user-should-be-in-account-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on Account",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on The Signin button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003curl\u003e",
      "offset": 8
    }
  ],
  "location": "AccountSteps.launch(String)"
});
formatter.result({
  "duration": 3290135801,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.user_click_on_Account()"
});
formatter.result({
  "duration": 361022700,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.click_on_Signin_button()"
});
formatter.result({
  "duration": 1721112300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 12
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 29
    }
  ],
  "location": "AccountSteps.user_enter_and_password(String,String)"
});
formatter.result({
  "duration": 309271799,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.click_on_The_Signin_button()"
});
formatter.result({
  "duration": 137277599,
  "status": "passed"
});
});