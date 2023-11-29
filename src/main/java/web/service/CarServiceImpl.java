package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> listCarWithCount(Integer count) {
        return carDao.listCarWithCount(count);
    }
}
