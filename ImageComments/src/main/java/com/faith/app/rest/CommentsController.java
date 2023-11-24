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

import com.faith.app.Service.ICommentsService;
import com.faith.app.entity.Comments;

@CrossOrigin    //to avoid the conflict btwn the tomcat and angular port numbers
@RestController    //it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class CommentsController {
	
	@Autowired
	private ICommentsService commentsService;
	
	//list of customers
		@GetMapping("/comments")
		public List<Comments> getAllComments(){
			return commentsService.getComments();
		}
		//add customers
		@PostMapping("/comment")
		public void addComment(@RequestBody Comments cmnt) {
			commentsService.addComments(cmnt);
		}
		
		
		//update customer
		@PutMapping("/comment")
		public void updateComments(@RequestBody Comments cmnt) {
			commentsService.addComments(cmnt);
		}
		
		
		
		
		
		
		
		
		
		
		
//		//get customer by id
//				@GetMapping("/order/{id}")
//				public Comments getComments(@PathVariable int id) {
//					return orderService.getComments(id);
//				}
//		
//		//delete Customers
//		@DeleteMapping("/order/{id}")
//		public void deleteOrder(@PathVariable int id) {
//			orderService.deleteOrder(id);
//			
//		}
//	
//		//inner join
//		@GetMapping("/order/dto")
//		public List<CustDto> getAllCustDto(){
//			return orderService.getAllCustDto();
//}
}
