package vn.nangcafe.nangcafe.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.nangcafe.nangcafe.model.Personnel;
import vn.nangcafe.nangcafe.model.PersonnelRepository;

import java.util.ArrayList;

@RestController
public class PersonnelController {

    @GetMapping("/api/personnels")
    public String getPersonnelsList() throws JsonProcessingException {

        ArrayList<Personnel> personnels = (ArrayList<Personnel>) personnelRepository.findAll();

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(personnels);
        return jsonArray;
    }
    @Autowired
    private PersonnelRepository personnelRepository;

}
