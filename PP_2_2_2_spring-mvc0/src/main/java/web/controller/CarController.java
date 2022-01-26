package web.controller;

import dao.CarDAO;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars ;


    @GetMapping(value = "/cars")
    public String printWelcome(HttpServletRequest request , Model model) {
        CarDAO carDAO = new CarDAO();
        carDAO.carsAdd();
        cars = carDAO.getCars();


        String count = request.getParameter("count") ;
        List<String> messages = new ArrayList<>();

        double size = cars.size();

        if(count != null ){
            size = Double.parseDouble(count);
        }

        if(size > 5){
            size = cars.size();
        }

        for (int i = 0 ; i < size ; i++){
            messages.add(cars.get(i).toString());
        }

        model.addAttribute("messages", messages);
        return "cars";
    }
}
