package com.mongo.FullStackMongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongo.FullStackMongo.model.Restaurant;

@Service
public interface RestaurantService{
	
	public Restaurant saveRest(Restaurant restaurant);
	public List<Restaurant> getAll();
	public Restaurant getByName(String restName);
	public String updateRest(Restaurant restaurant);
	public String deleteRest(int restId);

}
