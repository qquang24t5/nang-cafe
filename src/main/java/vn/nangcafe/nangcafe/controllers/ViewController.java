package vn.nangcafe.nangcafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewController {

    @GetMapping("/")
    public String getLoginPage(ModelMap model) {
        model.put("title", "Đăng nhập - Nắng Cafe");
        return "pages/login";
    }

    @GetMapping("/personnels")
    public String getPersonnelsPage(ModelMap model) {
        model.put("title", "Nhân viên - Nắng Cafe");
        return "pages/personnels";
    }

}
