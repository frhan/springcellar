package com.farhan.springcellar.web.controller;

import com.farhan.springcellar.domain.RestResponse;
import com.farhan.springcellar.domain.Wine;
import com.farhan.springcellar.services.WineService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

       return wineService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Wine findById(@PathVariable("id") Long id){
        logger.trace("***Find By Id***"+id);
        return wineService.getOne(id);
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public RestResponse<Wine>  create(@ModelAttribute Wine wine)
    {
        Wine createdWine = wineService.create(wine);
        logger.trace("******created Wine****"+createdWine);
        RestResponse<Wine> restResponse = new RestResponse<>();
        if (createdWine == null) {
            restResponse.status = false;
            restResponse.message = "Wine creation failed";
            return  restResponse;
        }

        restResponse.status = true;
        restResponse.message = "Wine created Sucessfully";
        restResponse.object = createdWine;

        return restResponse;
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    public RestResponse<Wine> update(@ModelAttribute Wine wine,@PathVariable("id") Long id)
    {
        Wine update = wineService.update(id,wine);

        RestResponse<Wine> restResponse = new RestResponse<>();
        if (update == null) {
            restResponse.status = false;
            restResponse.message = "Wine Update failed";
            return  restResponse;
        }

        restResponse.status = true;
        restResponse.message = "Wine Updated Sucessfully";
        restResponse.object = update;
        return restResponse;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public RestResponse<Wine> delete(@PathVariable("id") Long id){
        boolean deleted = wineService.delete(id);
        RestResponse<Wine> restResponse = new RestResponse<>();
        if (!deleted) {
            restResponse.status = false;
            restResponse.message = "Wine Deletion failed";
            return restResponse;
        }

        restResponse.status = true;
        restResponse.message = "Wine Deleted Sucessfully";
        return restResponse;
    }

}
