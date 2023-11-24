package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comments {
//instance variable
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commentId;
	
	@Column(nullable=false,length=60)
	private String title;
	
	@Column(length=100)
	private String discription;
	
	private LocalDate createdDate=LocalDate.now();
	
	private boolean isActive;
	
	private Integer imageId;
	@ManyToOne
	@JoinColumn(name="imageId",insertable=false,updatable=false)
	private Image image;
	
	
	
	
	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", title=" + title + ", discription=" + discription
				+ ", createdDate=" + createdDate + ", isActive=" + isActive + ", imageId=" + imageId + ", image="
				+ image + "]";
	}
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
}
