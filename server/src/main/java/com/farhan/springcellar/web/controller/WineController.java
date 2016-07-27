package com.farhan.springcellar.web.controller;

import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.services.WineService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/wines")
public class WineController {

    private static final Logger logger = LoggerFactory.getLogger(WineController.class);

    @Autowired
    private WineService wineService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Wine> findAll(){
        return new ArrayList<Wine>();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Wine findById(@PathVariable("id") String id){
        return new Wine();
    }


}