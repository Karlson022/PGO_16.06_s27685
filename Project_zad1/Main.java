package Project_zad1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(2024, "Ford"));
        cars.add(new Car(2002, "Ferrari"));
        cars.add(new Car(2022, "Jeep"));
        cars.add(new Car(2012, "Mercedes"));
        cars.add(new Car(2005, "BMW"));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.getCarName() + " " + car.getProductionYear());
        }
    }
}
