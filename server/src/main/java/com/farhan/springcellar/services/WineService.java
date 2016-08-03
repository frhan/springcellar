package com.farhan.springcellar.services;

import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by farhan on 7/24/16.
 */
@Service
public class WineService {

    @Autowired
    private WineRepository wineRepository;

    public Wine getOne(Long id)
    {
        return wineRepository.findOne(id);
    }

    public List<Wine> findAll(){
        return wineRepository.findAll();
    }

    public Wine create(Wine wine){
       return wineRepository.save(wine);
    }

}
