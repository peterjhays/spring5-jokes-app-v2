package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.ChuckNorrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {

    public final ChuckNorrisService chuckNorrisService;

    @Autowired
    public ChuckNorrisController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke",chuckNorrisService.getJoke());
        return "index";
    }

}
