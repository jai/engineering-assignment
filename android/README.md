## In the project has 3 screen.

* welcome screen
* quiz screen
* result screen

Users need to enter name before start quiz, once finishing quiz it going to show answer in the result screen

## Easy bug
When keyboard show up the cta button is gone
key board show up when screen navigated to another screen which is edit text doesn't exist

## Medium bug
If user select the correct answers then re-select user still got point for the same question.
The score not show up in the last screen

## Advance bug
Once user go thru the question, some of it has been selected with no interact from users
Once user go back from result screen expect to see welcome screen

## More feature and improvement
* welcome screen - validate that the name has been filled before go to another screen.
* quiz screen -
  * previous question button should be disable when user lands to the first question
  * next question button button should be disable when user lands to the last question
  * quiz and choices need to be random order.
* Add ranking screen, and save result in preference in result screen

## Bonus point
* Define a better code structure
* Beautify the UI
