package com.faith.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Image {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ImageId;
	
	@Column(nullable=false,length=60)
	private String imageName;
	
	private LocalDate datePosted;
	
	@OneToMany(mappedBy="image")
	@JsonBackReference
	private List<Comments> comments;
	
	
	
	
	

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(Integer imageId, String imageName, LocalDate datePosted) {
		super();
		ImageId = imageId;
		this.imageName = imageName;
		this.datePosted = datePosted;
	}

	public Integer getImageId() {
		return ImageId;
	}

	public void setImageId(Integer imageId) {
		ImageId = imageId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public LocalDate getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(LocalDate datePosted) {
		this.datePosted = datePosted;
	}

	@Override
	public String toString() {
		return "Image [ImageId=" + ImageId + ", imageName=" + imageName + ", datePosted=" + datePosted + "]";
	}
	
	
	

	
	
	
	
	
}
