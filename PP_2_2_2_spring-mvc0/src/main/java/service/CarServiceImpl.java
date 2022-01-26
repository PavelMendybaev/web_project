package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public ArrayList<Car> numbersCar(int num, ArrayList<Car> cars) {
        return (ArrayList<Car>) cars.subList(0, num);
    }
}
