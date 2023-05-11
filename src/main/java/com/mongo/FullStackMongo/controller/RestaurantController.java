package com.mongo.FullStackMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.FullStackMongo.model.Restaurant;
import com.mongo.FullStackMongo.service.RestaurantService;

@RestController
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping("save")
	public ResponseEntity<Restaurant> saveRest(@RequestBody Restaurant restaurant){
		Restaurant restaurant2= restaurantService.saveRest(restaurant);
		return new ResponseEntity<Restaurant>(restaurant2,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("{restName}")
	public ResponseEntity<Restaurant> getByName(@PathVariable String restName) {
		Restaurant restaurant = restaurantService.getByName(restName);
		return new ResponseEntity<Restaurant>(restaurant,HttpStatus.ACCEPTED);
	}
	
	@GetMapping()
	public ResponseEntity<List<Restaurant>> getAll() {
		List<Restaurant> restaurant = restaurantService.getAll();
		return new ResponseEntity<List<Restaurant>>(restaurant,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("update")
	public ResponseEntity<String> updateRest(@RequestBody Restaurant restaurant){
		String restaurant1= restaurantService.updateRest(restaurant);
		return new ResponseEntity<String>(restaurant1,HttpStatus.ACCEPTED);
	}

	@DeleteMapping("{restId}")
	public ResponseEntity<String> deleteRest(@PathVariable int restId){
		String msg=restaurantService.deleteRest(restId);
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
}
