package me.celler.controller;


import me.celler.model.Wine;
import me.celler.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/wines")
public class WineController {

  private WineService wineService;

  @Autowired
  public WineController(WineService service){
    this.wineService = service;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Wine add(@Valid @RequestBody Wine wine){
    return wineService.saveWine(wine);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Wine> getById(@PathVariable(value = "id") String id) {
    Wine wine = wineService.getWine(id);
    if(wine == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(wine);
  }

  @GetMapping
  public List<Wine> getWines(){
    return wineService.getAll();
  }

  // Update a Wine
  @PutMapping("/{id}")
  public ResponseEntity<Wine> updateNote(@PathVariable(value = "id") String id,
                                         @Valid @RequestBody Wine updateWine) {

    Wine wine = wineService.getWine(id);
    if(wine == null) {
      return ResponseEntity.notFound().build();
    }
    wine = wine.getUpdatedWine(updateWine);
    wine  = wineService.saveWine(wine);
    return ResponseEntity.ok(wine);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Wine> deleteNote(@PathVariable(value = "id") String id) {
    Wine wine = wineService.getWine(id);
    if(wine == null) {
      return ResponseEntity.notFound().build();
    }

    wineService.deleteWine(wine);
    return ResponseEntity.ok().build();
  }
}
