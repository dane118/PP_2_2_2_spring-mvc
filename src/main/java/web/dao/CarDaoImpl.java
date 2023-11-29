package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red", 2.5));
        cars.add(new Car("KIA", "White", 1.6));
        cars.add(new Car("Lada", "Black", 2.0));
        cars.add(new Car("Toyota", "Grey", 4.0));
        cars.add(new Car("Honda", "Blue", 3.0));
    }
    @Override
    public List<Car> listCarWithCount(Integer count) {
        return cars.stream().limit(count).toList();
    }
}
