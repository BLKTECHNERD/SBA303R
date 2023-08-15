class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice * 0.8;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.9;
        }
    }
}

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(160, 20000, "Red", 18);
        Ford ford1 = new Ford(180, 25000, "Blue", 2023, 1500);
        Ford ford2 = new Ford(200, 28000, "Green", 2022, 2000);
        Car car = new Car(150, 18000, "Black");
        Truck truck = new Truck(170, 30000, "Yellow", 2500);

        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
        System.out.println("Ford1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford2 Sale Price: " + ford2.getSalePrice());
        System.out.println("Car Sale Price: " + car.getSalePrice());
        System.out.println("Truck Sale Price: " + truck.getSalePrice());
    }
}
