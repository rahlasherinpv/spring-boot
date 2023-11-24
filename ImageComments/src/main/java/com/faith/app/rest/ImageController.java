package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.Service.IImageService;
import com.faith.app.entity.Image;

@CrossOrigin    //to avoid the conflict btwn the tomcat and angular port numbers
@RestController    //it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class ImageController {
	@Autowired
	private IImageService ImageService;
	
	
	//list of customers
	@GetMapping("/images")
	public List<Image> getAllImages(){
		return ImageService.getImages();
	}
	//add customers
	@PostMapping("/image")
	public void addImages(@RequestBody Image img) {
		ImageService.addImage(img);
	}
	
	
	//update customer
	@PutMapping("/image")
	public void updateImage(@RequestBody Image img) {
		ImageService.addImage(img);
	}
	
	
	
	
	
	
	
	
//	//get customer by id
//		@GetMapping("/image/{id}")
//		public Customer getCustomer(@PathVariable int id) {
//			return ImageService.getCustomer(id);
//		}
//		
//	
//	//delete Customers
//	@DeleteMapping("/image/{id}")
//	public void deleteCustomer(@PathVariable int id) {
//		ImageService.deleteCustomer(id);
//		
//	}
//	
//	//search employee by name
//	@GetMapping("/image/search/{name}")
//	public List<Customer> getAllEmployeeByName(@PathVariable String name){
//		return ImageService.getAllEmployeeByName(name);
//	}
}
