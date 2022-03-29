import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "Ferrari", "f40", 2020, "red", 999.99, "a144");
        Car car2 = new Car(2, "Tesla", "X", 2021, "white", 1999.99, "a145");
        Car car3 = new Car(3, "Ferrari", "f50", 2021, "black", 2999.99, "a146");
        Car car4 = new Car(4, "Mustang", "shelby", 2000, "red", 1000.99);
        Car car5 = new Car(5, "BMW", "i8", 2019, "gray", 1999.99, "a148");
        Car car6 = new Car(6, "Nissan", "skyline r32", 1989, "blue", 888.99, "a149");
        Car car7 = new Car(7, "Mercedes", "gla", 2020, "gray", 2999.99);
        Car car8 = new Car(8, "BMW", "x2", 2017, "blue", 1995.99, "a150");
        Car car9 = new Car(9, "Tesla", "S", 2022, "black", 3999.99, "a151");
        Car car10 = new Car(10, "Lamborghini", "urus", 2018, "yellow", 4999.99, "a152");

        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        Car.getByBrand(cars, "ferrari");

        Car.getCarByUsageMoreThanGivenYear(cars, "nissan", 10);

        Car.getCarByYearWhichIsPriceHigher(cars, 2021, 899.99);

    }
}
