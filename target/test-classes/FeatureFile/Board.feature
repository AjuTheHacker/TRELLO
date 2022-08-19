Feature: To validate the end to end test of Trello

Scenario: To validate drag and drop from List A to List B in Borad
Given User should launch chrom browser and load url
When User should click on login button
And User should enter username 
And User should click on continue
And User should enter password 
And User should click on log in button
Then User should navigate to Board page 
When User should click on create board 
And User should Enter title of in editBox
And User should click on create button
Then User should navigate to board
When User should enter the first board name
And User should enter the second board name
And User should enter the add card in first board
And User Should enter the title of first board
And User should click on add card
Then User should drag and drop in first board to Second board
When User should click on logout