package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("IZH 21251", "USSR", 1991));
        cars.add(new Car("VAZ 2112", "Russia", 2004));
        cars.add(new Car("Mercedes A140", "Germany", 1998));
        cars.add(new Car("Ford Focus", "USA", 2001));
        cars.add(new Car("Toyota Corolla AE86", "Japan", 1985));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCountCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
