package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.watches;
import com.example.demo.service.watchService;


@RestController
public class watchController {
	@Autowired
	private watchService Service;
	
	@RequestMapping(method=RequestMethod.GET,value="/watches")
	public List<watches> getAllWatches(){					//getting all watches from the database.
		return Service.getAllWatches();
	}
	@RequestMapping(method=RequestMethod.POST, value="/watches")
	public String addWatches(@RequestBody watches w1){			//adding one watch into the database
		return Service.addWatch(w1);
	}
	@RequestMapping(method=RequestMethod.GET,value="/watchname/{name}")
	public watches getWatchByName(@PathVariable String name) 		//get watch by it's name.
	{
		return Service.getWatchByName(name);
	}
	@RequestMapping(method=RequestMethod.POST, value="/addall")
	public String addAll(@RequestBody List<watches> productList)			//Add a list of watches into the database.
	{
		return Service.addAllWatches(productList);
	}

	@RequestMapping(method=RequestMethod.GET, value="/watchprice/{amount}")			//getting watches by their price
	public List<watches> getWatchByPrice(@PathVariable int amount){
		return Service.getWatchByPrice(amount);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/watch/{snum}")			//getting specific watch from Database.
	public Optional<watches> getProduct(@PathVariable int sNum) {
		return Service.getWatch(sNum);
	}
	
}
