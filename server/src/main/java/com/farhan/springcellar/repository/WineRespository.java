package com.farhan.springcellar.repository;

import com.farhan.springcellar.domain.Wine;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WineRespository extends MongoRepository<Wine,String> {

  public List<Wine> findByName(String name);
  public List<Wine> findByGrapes(String grapes);
}
