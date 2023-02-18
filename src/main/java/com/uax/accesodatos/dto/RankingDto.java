package com.uax.accesodatos.dto;

public class RankingDto {
	
private String id;
private String title;
private int rank;
private String year;
private String Image;
private double imDbRating;



public RankingDto(String id,String title,int rank,String year,String Image,double imDbRating )
{this.id=id;
this.title=title;
this.rank=rank;
this.year=year;
this.Image=Image;
this.imDbRating=imDbRating;
	
	}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getTitle() {
	return title;
}



public void setTitle(String title) {
	this.title = title;
}



public int getRank() {
	return rank;
}



public void setRank(int rank) {
	this.rank = rank;
}



public String getYear() {
	return year;
}



public void setYear(String year) {
	this.year = year;
}



public String getImage() {
	return Image;
}



public void setImage(String image) {
	Image = image;
}



public double getImDbRating() {
	return imDbRating;
}



public void setImDbRating(double imDbRating) {
	this.imDbRating = imDbRating;
}


	
	
}
