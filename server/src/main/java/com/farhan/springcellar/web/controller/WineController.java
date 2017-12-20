package com.farhan.springcellar.web.controller;

import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wines")
public class WineController {

  private WineService service;

  @Autowired
  public WineController(WineService service){
    this.service = service;
  }

  @PostMapping("/add")
  @ResponseStatus(HttpStatus.CREATED)
  public void add(@RequestBody Wine wine){
    service.addWine(wine);
  }

  @GetMapping
  public List<Wine> getWines(){
    return service.getAll();
  }
}
