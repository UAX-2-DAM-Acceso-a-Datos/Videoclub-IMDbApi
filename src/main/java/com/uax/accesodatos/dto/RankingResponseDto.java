package com.uax.accesodatos.dto;

public class RankingResponseDto {
	    public String id;
	    public String rank;
	    public String title;
	    public String fullTitle;
	    public String year;
	    public String image;
	    public String crew;
	    public String imDbRating;
	    public String imDbRatingCount;
	    
		public RankingResponseDto() {
		}

		public RankingResponseDto(String id, String rank, String title, String fullTitle, String year, String image,
				String crew, String imDbRating, String imDbRatingCount) {
			this.id = id;
			this.rank = rank;
			this.title = title;
			this.fullTitle = fullTitle;
			this.year = year;
			this.image = image;
			this.crew = crew;
			this.imDbRating = imDbRating;
			this.imDbRatingCount = imDbRatingCount;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRank() {
			return rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFullTitle() {
			return fullTitle;
		}

		public void setFullTitle(String fullTitle) {
			this.fullTitle = fullTitle;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getCrew() {
			return crew;
		}

		public void setCrew(String crew) {
			this.crew = crew;
		}

		public String getImDbRating() {
			return imDbRating;
		}

		public void setImDbRating(String imDbRating) {
			this.imDbRating = imDbRating;
		}

		public String getImDbRatingCount() {
			return imDbRatingCount;
		}

		public void setImDbRatingCount(String imDbRatingCount) {
			this.imDbRatingCount = imDbRatingCount;
		}

		@Override
		public String toString() {
			return "RankingResponseDto [id=" + id + ", rank=" + rank + ", title=" + title + ", fullTitle=" + fullTitle
					+ ", year=" + year + ", image=" + image + ", crew=" + crew + ", imDbRating=" + imDbRating
					+ ", imDbRatingCount=" + imDbRatingCount + "]";
		}
		
		
	    
	

}
