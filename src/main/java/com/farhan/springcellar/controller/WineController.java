package com.farhan.springcellar.controller;

import com.farhan.springcellar.domain.Wine;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/wines")
public class WineController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Wine> findAll(){
        return new ArrayList<Wine>();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Wine findById(@PathVariable("id") String id){
        return new Wine();
    }


}
