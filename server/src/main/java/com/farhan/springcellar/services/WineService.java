package com.farhan.springcellar.services;

import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.repository.WineRepository;
import com.farhan.springcellar.web.controller.WineController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by farhan on 7/24/16.
 */
@Service
public class WineService {

    private static final Logger logger = LoggerFactory.getLogger(WineService.class);

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

    public Wine update(Long id,Wine wine){
        Wine updateWine = getOne(id);
        if (updateWine == null)
            return null;
        logger.trace("******before updated Wine****"+updateWine);

        updateWine.setCountry(wine.getCountry());
        updateWine.setName(wine.getName());
        updateWine.setDescription(wine.getDescription());
        updateWine.setGrapes(wine.getGrapes());
        updateWine.setPicture(wine.getPicture());
        updateWine.setRegion(wine.getRegion());
        updateWine.setYear(wine.getYear());
        logger.trace("******After Update Wine****"+updateWine);
        return wineRepository.save(updateWine);
    }

    public boolean delete(final Long id){
        Wine updateWine = getOne(id);
        if (updateWine == null)
            return false;

        wineRepository.delete(id);
        return true;
    }

}
