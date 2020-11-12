package vn.nangcafe.nangcafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getLoginPage() {
        return "pages/login";
    }

    @GetMapping("/personnels")
    public String getPersonnelsPage() {
        return "pages/personnels";
    }

}
