# Requirements

- Lightweight application to demonstrate your software development skills.
- The application allows a street vendor to
    - sell blended fruit drinks and
    - track her inventory of ingredients.

The purpose of this test is as follows:
1. To ensure you have a solid understanding of the development platform, language, and libraries
2. To see how you develop an object oriented model for the application
3. To see how you implement some basic business logic
4. To see what decisions you make when requirements are loosely defined

## Technical specifications and instructions

1. Please develop a console application using Java
2. Important: Please make sure that the language for variables and messages into the source code and/or application are in “English”
3. It is not necessary for data to persist when the user exits the application (no database required)
4. No user interface is necessary, it can be run via the command line
5. The application should be buildable and runnable
6. Please include both source code and object code in your submission
7. Please zip up your entire solution for submission as “Skills Test <candidate_name>.zip”

## Details of the vendor’s blended fruit drink recipes
1. For every 100ml of blended fruit drink, the recipe requires
  - 50ml of blended fruit
  - 30ml of ice
  - 20ml of condensed milk, and
  - 8g of sugar

2. The vendor offers 3 flavors of fruit drink
a. Strawberry: Requires 100g of strawberries for each 100ml of blended strawberries
b. Banana: Requires 120g of bananas for each 100ml of blended bananas
c. Mango: Requires 140g of mango for each 100ml of blended mangos

3. It sells only 1 size of drink, 300ml

Please implement the following basic functions (in priority order)

1. Hard code the vendor’s starting inventory of ingredients
2. Provide a function to list the vendor’s current inventory of ingredients
3. Allow the vendor to sell a drink and reduce inventory accordingly
4. Deny a sale when there are not enough ingredients to make the drink

*** THIS SECTION IS OPTIONAL, NOT REQUIRED ***
1. Provide a warning when any ingredient gets below the level required to make 4 more drinks
2. Allow the vendor to sell a mixed fruit drink (for example, banana and strawberry) and reduce inventory accordingly
3. Allow the vendor to sell 3 sizes (small, medium, and large)
4. Provide costs for each ingredient and set prices for each drink to ensure she makes a profit
5. Allow sales over time and provide a report of daily sales