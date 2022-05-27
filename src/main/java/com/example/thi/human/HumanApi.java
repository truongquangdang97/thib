package com.example.thi.human;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/humans")
public class HumanApi {
    @Autowired
    HumanService humanService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Human> findAll(){
        return humanService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public Human save(@RequestBody Human obj){
        return humanService.save(obj);
    }
}
