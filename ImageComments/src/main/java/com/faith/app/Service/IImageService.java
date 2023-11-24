package com.faith.app.Service;

import java.util.List;

import com.faith.app.entity.Image;

public interface IImageService {

	List<Image> getImages();

	void addImage(Image img);

}
