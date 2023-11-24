package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Image;

public interface IImageRepository extends CrudRepository<Image, Integer> {

    

}
