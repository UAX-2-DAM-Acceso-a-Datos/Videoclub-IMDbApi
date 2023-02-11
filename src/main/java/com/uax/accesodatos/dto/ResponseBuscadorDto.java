package com.uax.accesodatos.dto;

public class ResponseBuscadorDto {
	public String id;
	public String resultType;
	public String image;
	public String title;
	public String description;

	public ResponseBuscadorDto() {
	}

	public ResponseBuscadorDto(String id, String resultType, String image, String title, String description) {
		super();
		this.id = id;
		this.resultType = resultType;
		this.image = image;
		this.title = title;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
