Feature: Uber booking feature

Scenario: Booking car
Given User wants to select the car "sedan" from uber application
When user select car "sedan" and pick up point "hyd" and drop location "warangal"
Then driver starts the journey
And driver ends the journey
Then user pays 100 dollars

