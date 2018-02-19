package me.celler.repositories;

import me.celler.model.Wine;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WineRespository extends MongoRepository<Wine,String> {

  List<Wine> findByName(String name);
  List<Wine> findByGrapes(String grapes);
}
