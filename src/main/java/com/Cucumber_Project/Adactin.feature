Feature: Hotel Booking In Adactin Application

Scenario: Login
Given user Launch The Application
When  user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Buttn And It Navigate To The Searh Hotel Page

 Scenario: Search Hotel
 When user Select The Location
 And user Select The Hotel
 And user Select The Room Type
 And user Select The Number Of Rooms
 And user Select The Check In Date
 And user Select The Check Out Date
 And user Select The Adult Per Room
 And user Select The Children Per Room
 Then user Click On The Search Button And It Navigate To Hotel List Page
 
 Scenario: Select Hotel
When user Click On The Hotel In Selected Location
Then user Click On The Continue Button And It Navigate To The User Details Page

Scenario: User Details
When user Enter The FirstName In FirstName Field
When user Enter The LastName In LastName Field
When user Enter The Billing Address In The Address Field
When user Enter The Card Number In The Card Number Field
When user Select The Card Type 
When user Select The Month And Year
When user Enter The Card Cvv In The Cvv Field
Then user Click On The Book Now Button And It Navigate To The 


Scenario: Checking Details
Then user Click On The Myltineary Button And It Navigate To The Booking COnform Page
 
Scenario: Booking Conform
Then user Click On The Logout 
 