package com.faith.app.Service;

import java.util.List;

import com.faith.app.entity.Comments;

public interface ICommentsService {

	List<Comments> getComments();

	void addComments(Comments cmnt);

}
