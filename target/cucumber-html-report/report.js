$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentication/Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "ETQ utilisateur je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentification"
    }
  ]
});
formatter.before({
  "duration": 3135658000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Tester l\u0027interface de connexion",
  "description": "",
  "id": "authentification---orangehrm;tester-l\u0027interface-de-connexion",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx-cas-passant"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecte sur l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisis le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisis le password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le boutton LOGIN",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je me redirige vers la page home \"Welcome\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeMeConnecteSurLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2840858900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 23
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisisLeUsername(String)"
});
formatter.result({
  "duration": 72157500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 23
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisisLePassword(String)"
});
formatter.result({
  "duration": 54409100,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeCliqueSurLeBouttonLogin()"
});
formatter.result({
  "duration": 3358750700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 34
    }
  ],
  "location": "AuthenticationStepDefinition.jeMeRedirigeVersLaPageHome(String)"
});
formatter.result({
  "duration": 34532300,
  "status": "passed"
});
formatter.after({
  "duration": 1624988300,
  "status": "passed"
});
});