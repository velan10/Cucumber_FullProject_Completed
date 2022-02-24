Feature: Hotel Booking In Adactin Application

@Ad1
Scenario Outline: Login

Given user Launch The Application
When  user Enter The "<Username>" In Username Field
And   user Enter The "<Password>"In Password Filed
Then  user Click The Login Button And It Navigates To The Search Hotel Page

Examples:

|Username||Password|
|A||123|
|B||234|
|velanvic||B8QDAM|

@Ad2
Scenario: User Seach And Select The Room And Details In The Search Hotel Page

When user Search And Select The Location> In Location Dialbox "New York"
And user Search And Select The Hotels In The Hotel Dialbox
And user Search And Select The Roomtype  In The Roomtype Dialbox
And user Search And Select The Number_Of_Rooms  In The Numberofrooms Dialbox
And user  Select The Check_In_Date  In The Checkindate Dialbox
And user  Select The Check_Out_Date  In The Check_Out_Date Dialbox
And user Select Adults_Per_Room  In The Dialbox
And user Select The Children_Room In The Correct Dialbox
Then user Click The Search_Button And It Navigate To HotelSelection Page

@Ad3
Scenario: Select Hotel
When user Select The Radi_Button In the Selected Hotel_List 
Then user Click The Continue Button And  It navigate To The Payment Details
@Ad4
Scenario: Payment Page
When user Enter The Firstname In The Firstname Field
And user Enter The Lastname In The Lastname Field
And user Enter The Billing-Address In The Billing_Address Field
And user Enter The Card_Number In The Card_Number Field
And user Select The Card_Type In The Card_Type Field
And user Select The Expiry_Date And Month 
And user Enter The Card_CVV In The Filed
Then user Click The Booknow Button And It Navigate To The Booking Conformation Page
@Ad4
Scenario: Conformation Hotel
When user Click The Itinerary Button It Navigate To Booked Itinerary 
Then user Finally Click The Logout Button 
