package task3Collections.cars;

import java.util.ArrayList;
import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Лада", "сидан"));
        cars.add(new Car("Лада", "хэтчбек"));
        cars.add(new Car("Мерседес", "сидан"));
        cars.add(new Car("БМВ", "кроссовер"));
        cars.add(new Car("Форд", "хэтчбек"));
        cars.add(new Car("Пежо", "кроссовер"));
        cars.add(new Car("Тойота", "сидан"));
        System.out.println(sortCars(cars));
    }


    public static HashMap<String, ArrayList<String>> sortCars(ArrayList<Car> cars) {
        HashMap<String, ArrayList<String>> sortCars = new HashMap<>();
        for (Car car : cars) {
            if (sortCars.containsKey(car.getType())) {
                sortCars.get(car.getType()).add(car.getModel());
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(car.getModel());
                sortCars.put(car.getType(), list);
            }
        }
        return sortCars;
    }
}
