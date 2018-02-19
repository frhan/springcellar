package me.celler.services;

import me.celler.model.Wine;
import me.celler.repositories.WineRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineService {

  private WineRespository wineRespository;

  @Autowired
  public WineService(WineRespository wineRespository){
    this.wineRespository = wineRespository;
  }

  public final Wine saveWine(final Wine wine){
    return wineRespository.save(wine);
  }

  public List<Wine> getAll(){
    return wineRespository.findAll();
  }

  public Wine getWine(final String id){
    return wineRespository.findOne(id);
  }

  public void deleteWine(Wine wine){
    wineRespository.delete(wine);
  }

}
