import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(int id, String brand, String model, int year, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public static void getByBrand(List<Car> cars, String brand) {
        System.out.println("\ngets all cars by brand " + brand);
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand))
                result.add(car);
        }
        for (Car car : result) {
            System.out.println(car);
        }
    }

    public static void getCarByUsageMoreThanGivenYear(List<Car> cars, String brand, int n) {
        System.out.println("\nget Car By Usage More Than " + n + " Year");
        List<Car> result = new ArrayList<>();
        Date date = new Date();
        int currentYear = date.getYear() + 1900;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand) && (currentYear - car.getYear()) > n)
                result.add(car);
        }
        for (Car car : result) {
            System.out.println(car);
        }
    }

    public static void getCarByYearWhichIsPriceHigher(List<Car> cars, int year, double price) {
        System.out.println("\nget Car By Year Which Is Price Higher than " + price);
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price)
                result.add(car);
        }
        for (Car car : result) {
            System.out.println(car);
        }
    }
}
