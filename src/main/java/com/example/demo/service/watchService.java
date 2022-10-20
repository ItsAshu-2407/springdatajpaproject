package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.watches;
import com.example.demo.repository.watchRepository;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class watchService{
	@Autowired
	private  watchRepository repo;
	
	public List<watches> getAllWatches(){				
		List<watches> watchlist = new ArrayList<>();
		repo.findAll().forEach(watchlist::add);
		return watchlist;
	}
	public  String addWatch(watches w1) {				
		repo.save(w1);
		return null;
	}
	public  Optional<watches> getWatch(int sNum){			
		return repo.findById(sNum);
	}
	public  String addAllWatches(List<watches> w1) {
		repo.saveAll(w1);
		return "All items added successfully...";
	}
	public  watches getWatchByName(String watchName){
		return repo.findByWatchName(watchName);
	}
	public  List<watches> getWatchByPrice(int watchPrice){
		return repo.findByWatchPrice(watchPrice);
	}
}
