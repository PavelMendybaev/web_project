package dao;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CarDAO {

    private static ArrayList<Car> cars = new ArrayList<>();

    public void carsAdd(){
        cars.add(new Car(0 , "Porshe" , (byte)1));
        cars.add(new Car(1 , "Shevrolet" , (byte)2));
        cars.add(new Car(2 , "NIVA" , (byte)3));
        cars.add(new Car(3 , "LADA" , (byte)4));
        cars.add(new Car(4 , "RENO" , (byte)5));

    }


    public ArrayList<Car> getCars() {


        return cars;
    }

}
