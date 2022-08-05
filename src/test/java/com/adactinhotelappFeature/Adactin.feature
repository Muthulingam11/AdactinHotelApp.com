Feature: Booking Room in browser with automation 

Scenario: login

Given User launch the site

When User enter the username in username box

When User enter the Password in Password box

Then User click on the login button

Scenario: searching the hotels by roomtype with date

When User search the room by location

When User search the hotel

When User choosing with roomtype

When User choosing with no_of_room

When User entering the checkin_date

When User entering the checkout_date

When User choosing room with no_of adults

When User choosing room with no_of_child

Then User submitting with search and page navigate to conforming

Scenario: User conforming with their search

When  User agree with the rooms

Then User continues with submit

Scenario: User entering the credentials

When User entering the firstname

When User entering the lastname

When User entering the address

When User entering the cc_number

When User choosing the cc_type

When User choosing the cc_exp_month

When User choosing the cc_exp_year

When User entering the cc_cvv

Then User conforming the room 

Scenario: User room booked details dashboard

When User seeing the booked room details 

Then User logout