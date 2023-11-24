package com.faith.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Comments;
import com.faith.app.repo.ICommentsRepository;
@Service
public class CommentsServiceImplimentation implements ICommentsService{

	@Autowired
	private ICommentsRepository commentrepo;
	
	@Override
	public List<Comments> getComments() {
		// TODO Auto-generated method stub
		return (List<Comments>) commentrepo.findAll();
	}

	@Override
	public void addComments(Comments cmnt) {
		commentrepo.save(cmnt)		;
	}

}
