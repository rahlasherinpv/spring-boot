package com.faith.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Image;
import com.faith.app.repo.IImageRepository;
@Service
public class ImageServiceImplimentation implements IImageService {

	@Autowired
	private IImageRepository imageREpository;
	
	@Override
	public List<Image> getImages() {
		// TODO Auto-generated method stub
		return (List<Image>) imageREpository.findAll();
	}

	@Override
	public void addImage(Image img) {
		imageREpository	.save(img);	
	}

}
