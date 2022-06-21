package controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor

public class PassengerController {

    @RequestMapping("/") public String requestMapping() { return "Hello !"; }





}

