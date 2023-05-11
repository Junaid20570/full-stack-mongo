package com.mongo.FullStackMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.FullStackMongo.Dao.RestaurantDao;
import com.mongo.FullStackMongo.model.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantDao dao;
	
	@Override
	public Restaurant saveRest(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return dao.save(restaurant);
	}

	@Override
	public List<Restaurant> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Restaurant getByName(String restName) {
		// TODO Auto-generated method stub
		return dao.findByRestName(restName);
	}

	@Override
	public String updateRest(Restaurant restaurant) {
		// TODO Auto-generated method stub
		dao.deleteById(restaurant.getRestId());
		dao.save(restaurant);
		
		//dao.insert(restaurant);
		//dao.save
		return "restaurant updated";
	}

	@Override
	public String deleteRest(int restId) {
		// TODO Auto-generated method stub
		dao.deleteById(restId);
		return "restaurant deleted";
	}

}
