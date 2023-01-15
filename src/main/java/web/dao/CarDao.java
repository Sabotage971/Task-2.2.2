package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    public final List<Car> cars;

    public CarDao() {
        cars = new ArrayList<>();
        cars.add(new Car("IZH 21251", "USSR", 1991));
        cars.add(new Car("VAZ 2112", "Russia", 2004));
        cars.add(new Car("Mercedes A140", "Germany", 1998));
        cars.add(new Car("Ford Focus", "USA", 2001));
        cars.add(new Car("Toyota Corolla AE86", "Japan", 1985));
    }

    }
