package com.example.FirstExample.controller;

import org.springframework.web.bind.annotation.*;
import com.example.FirstExample.model.Shipwreck;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value= "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list(){
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id){
        return ShipwreckStub.get(id);
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return ShipwreckStub.create(shipwreck);
    }


    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        return ShipwreckStub.update(id,shipwreck);
    }


    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck create(@PathVariable Long id){
        return ShipwreckStub.delete(id);
    }

}
