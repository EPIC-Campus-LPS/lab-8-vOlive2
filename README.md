# Lab 8

## Part 1: Monster Battler

Create the following classes. 

- **Monster Class**
    - Attributes:
        - `name` (String)
        - `type` (String, Must be "Fire", "Water", "Earth")
        - `level` (int)
    - Constructors
        - One that accepts all three fields.
        - One that accepts just `name` and `type` (default level = 1).
    - Gettter and Setters
	    - Create a getter and a setter for every attribute
    - Battle Methods
	    - `basicBattle()` is a static method that takes two Monsters as parameters. It returns the Monster with the greatest level. In case of a tie, return Monster 1. 
	    - `typeBattle()` is a static method that takes two Monsters as parameters. It returns the Monster who wins the type battle. Fire monsters beat Water monsters. Water monsters beat Earth monsters, and Earth monsters beat Fire monsters. In case of a tie, return Monster 1. 
    - Override **`.toString()`** to return something like:  
        `Monster(Name=Fang, Type=Fire, Level=7)`
    - Override **`.equals()`** so that two monsters are equal if their `name` and `type` match.

- **MonsterRunner Class**
	- Write a main method that
		- Creates monsters using different constructors.
		- Prints them using `.toString()`.
		- Compares two monsters using `.equals()`.
		- Demonstrates the functionality of `basicBattle()` and `typeBattle`.
		- Demonstrates checking if one monster is null.
		- Reads in the Monsters in `monsters.txt` and prints the strongest monster(if you were to `basicBattle` with all the possible monsters).

`monsters.txt
```
Fang, Fire, 7
Misty, Water, 4
Rocko, Earth, 3
Shade, Water, 8
Spark, Fire, 5
Blossom, Earth, 2
Frostbite, Water, 6
Inferno, Fire, 10
Zephyr, Fire, 4
Golem, Earth, 9
```


## Part 2: Country Simulator

Create the following classes.

- **CapitalCity**
	- Attributes
		- `name`
		- `population`
	- Methods
		- Getters and Setters for `name` and `population`
		- `isMegaCity()` - Returns true if the city is > 10 million people
	- Overrided Methods
		- `toString()` to return something like:  
        `CapitalCity(Name=Cairo, Population=9900000)`
- **Country** 
	- Attributes
		- `name`
		- `capitalCity`
	- Methods
		- Getters and Setters for `name` and `capitalCity`
		- `hasMegaCapitalCity()` - Returns true if the capital city has > 10 million people. 
	- Overrided Methods:
		- `toString()` to return something like `Country(name=Egypt, CapitalCity(Name=Cairo, Population=9900000))`
- **CountryRunner**
	- Contains a main method to:
		- Create three countries: France, Japan, and Egypt.
	- Print out the countries using `toString()`
