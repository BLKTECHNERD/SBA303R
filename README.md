# SBA303R

#My Own Auto Shop

This project implements a simple car sales application in Java. It includes classes for different types of cars, their pricing, and discounts based on various conditions.

## Table of Contents

- [Car Class](#car-class)
- [Truck Class](#truck-class)
- [Ford Class](#ford-class)
- [Sedan Class](#sedan-class)
- [MyOwnAutoShop Class](#myownautoshop-class)

## Car Class

The `Car` class represents a basic car with speed, regular price, and color attributes. It provides a method to calculate the sale price based on the regular price.

## Truck Class

The `Truck` class is a subclass of `Car` and introduces the concept of a truck with additional weight information. The sale price for a truck is determined based on the weight, offering discounts for heavier trucks.

## Ford Class

The `Ford` class extends the `Car` class and adds attributes such as the manufacturing year and manufacturer discount. The sale price for a Ford car is computed by subtracting the manufacturer discount from the base sale price.

## Sedan Class

The `Sedan` class is another subclass of `Car` that includes information about the length of the sedan. Sale prices for sedans are adjusted based on the length, providing discounts for longer sedans.

## MyOwnAutoShop Class

The `MyOwnAutoShop` class contains the main method where instances of various car types are created and their sale prices are displayed.

## Usage

To run the program and see the calculated sale prices for different car types, execute the `MyOwnAutoShop` class.

## Explanation of Sale Prices

The calculated sale prices for each instance in the `MyOwnAutoShop` program are as follows:

- For the `Sedan` instance, the length is 18 feet, so it receives a 10% discount, resulting in a sale price of $18,000.

- For the first `Ford` instance (`Ford1`), the manufacturer discount is $1500, which is subtracted from the original price of $25,000, resulting in a sale price of $23,500.

- For the second `Ford` instance (`Ford2`), the manufacturer discount is $2000, which is subtracted from the original price of $28,000, resulting in a sale price of $26,000.

- For the `Car` instance, no specific discounts apply, so the sale price remains the same at $18,000.

- For the `Truck` instance, the weight is 2500, so it receives a 10% discount, resulting in a sale price of $27,000.

This information provides an overview of how the sale prices are determined based on the conditions defined in the classes.

## Contributors

- H Marshall, [GitHub Profile](https://github.com/BLKTECHNERD)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


