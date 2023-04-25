package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private static int CARS_COUNT;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car(++CARS_COUNT, "Toyota", "MarkII"));
        carsList.add(new Car(++CARS_COUNT, "Brabus", "800"));
        carsList.add(new Car(++CARS_COUNT, "Rolls-Royce", "Phantom"));
        carsList.add(new Car(++CARS_COUNT, "Rolls-Royce", "Cullinan"));
        carsList.add(new Car(++CARS_COUNT, "BMW", "M5"));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carsList.stream().limit(count).toList();
    }
}
