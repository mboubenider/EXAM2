package com.example.exam2.demo.Controller;
import com.example.exam2.demo.Models.Virus;
import com.example.exam2.demo.Models.VirusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;
import java.util.UUID;

@Controller
public class MainController {

    @Autowired
    VirusRepo VirusRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("viruslist", VirusRepo.findAll());
        return mv;
    }

}