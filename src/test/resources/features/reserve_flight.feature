Feature: Reserve a flight with serenity bdd
	I am a client that want to search a flight MDE to BOG,
	for verify by filling in my personal
 
  Scenario Outline: Reserve a flight with serenity bdd
	Given the client that open despegar page
	When the client want to search a flight <CITY_OF_ORIGIN> to <CITY_OF_DESTINATION>
#	And the client want to reserve the flight with her data <NAME>,<LAST_NAME>,<ID_NUMBER>,<ADDRESS>,<AREA_CODE>,<PHONE_NUMBER>,<EMAIL>, in the traveler form
	And the client want to reserve the flight with her data <NAME>,<LAST_NAME>,<ID_NUMBER>,<AREA_CODE>,<PHONE_NUMBER>,<EMAIL>, in the traveler form
	Then the client should confirm her data without buying the flight yet
	
Examples:
|CITY_OF_ORIGIN|CITY_OF_DESTINATION|NAME|LAST_NAME|ID_NUMBER|AREA_CODE|PHONE_NUMBER|EMAIL|
|Medellin colombia|Bogota|Waira Sofia|Ocampo Orozco|12121212|0574|300121212|waira@gmail.com|
