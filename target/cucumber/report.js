$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/DevSVG.feature");
formatter.feature({
  "line": 1,
  "name": "Open gComposer and navigate SVG Masks",
  "description": "Navigate, regenerate and save SVG Masks for sport",
  "id": "open-gcomposer-and-navigate-svg-masks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3825668343,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Navigate, generate and save SVG Masks for sport",
  "description": "",
  "id": "open-gcomposer-and-navigate-svg-masks;navigate,-generate-and-save-svg-masks-for-sport",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@complete"
    },
    {
      "line": 5,
      "name": "@menbaseball"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Navigate to svg masks \"http://dev.embodee.com/gcomposer/svgmasks/747226\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify generate and save masks",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Log out",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://dev.embodee.com/gcomposer/svgmasks/747226",
      "offset": 23
    }
  ],
  "location": "DevSVG2.Navigate_to_svg_masks(String)"
});
formatter.result({
  "duration": 10234798513,
  "status": "passed"
});
formatter.match({
  "location": "DevSVG2.Verify_generate_and_save_masks()"
});
