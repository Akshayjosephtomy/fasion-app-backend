package com.nestdigital.fasionappbackend.controller;

import com.nestdigital.fasionappbackend.dao.FasionDao;
import com.nestdigital.fasionappbackend.model.FasionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
public class FasionController {
    @Autowired
    private FasionDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addfasion",consumes = "application/json",produces = "application/json")
    private String addfasion(@RequestBody FasionModel item){
        System.out.println(item.toString());
        dao.save(item);
        return "(status:success)";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewfasion")
    public List<FasionModel> viewfasion(){
        return (List<FasionModel>)
                dao.findAll();
    }
}
