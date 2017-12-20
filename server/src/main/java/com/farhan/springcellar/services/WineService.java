package com.farhan.springcellar.services;

import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.repository.WineRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineService {

  @Autowired
  private WineRespository wineRespository;

  public final void addWine(final Wine wine){
    wineRespository.save(wine);
  }

  public List<Wine> getAll(){
    return wineRespository.findAll();
  }
}
