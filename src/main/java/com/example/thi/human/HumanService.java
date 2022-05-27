package com.example.thi.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {
    @Autowired
    HumanRepository humanRepository;

    public List<Human> findAll(){
        return humanRepository.findAll();
    }

    public Human save(Human obj){
        return humanRepository.save(obj);
    }
}
