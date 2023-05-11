package com.mongo.FullStackMongo.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.FullStackMongo.model.Restaurant;

@Repository
public interface RestaurantDao extends MongoRepository<Restaurant, Integer> {
	
	public Restaurant findByRestName(String restName);

}
