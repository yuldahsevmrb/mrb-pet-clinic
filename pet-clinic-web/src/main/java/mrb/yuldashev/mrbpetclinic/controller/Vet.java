package mrb.yuldashev.mrbpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Vet {


    @RequestMapping({"/vets", "/vets/index", "/vets/index.hmtl"})
    public String listVets(){

        return "vets/index";
    }

}
