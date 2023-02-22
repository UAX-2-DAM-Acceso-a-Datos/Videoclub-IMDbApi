package com.uax.accesodatos.dto.peliculasresponsedto;

import java.util.ArrayList;

public class PeliculasResponseDto {

	public String id;
    public String title;
    public String originalTitle;
    public String fullTitle;
    public String type;
    public String year;
    public String image;
    public String releaseDate;
    public String runtimeMins;
    public String runtimeStr;
    public String plot;
    public String plotLocal;
    public boolean plotLocalIsRtl;
    public String awards;
    public String directors;
	public ArrayList<DirectorList> directorList;
    public String writers;
    public ArrayList<WriterList> writerList;
    public String stars;
    public ArrayList<StarList> starList;
    public ArrayList<ActorList> actorList;
    public Object fullCast;
    public String genres;
    public ArrayList<GenreList> genreList;
    public String companies;
    public ArrayList<CompanyList> companyList;
    public String countries;
    public ArrayList<CountryList> countryList;
    public String languages;
    public ArrayList<LanguageList> languageList;
    public String contentRating;
    public String imDbRating;
    public String imDbRatingVotes;
    public String metacriticRating;
    public Object ratings;
    public Object wikipedia;
    public Object posters;
    public Object images;
    public Object trailer;
    public BoxOffice boxOffice;
    public Object tagline;
    public String keywords;
    public ArrayList<String> keywordList;
    public ArrayList<Similar> similars;
    public Object tvSeriesInfo;
    public Object tvEpisodeInfo;
    public String errorMessage;
    
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
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getFullTitle() {
		return fullTitle;
	}
	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRuntimeMins() {
		return runtimeMins;
	}
	public void setRuntimeMins(String runtimeMins) {
		this.runtimeMins = runtimeMins;
	}
	public String getRuntimeStr() {
		return runtimeStr;
	}
	public void setRuntimeStr(String runtimeStr) {
		this.runtimeStr = runtimeStr;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getPlotLocal() {
		return plotLocal;
	}
	public void setPlotLocal(String plotLocal) {
		this.plotLocal = plotLocal;
	}
	public boolean isPlotLocalIsRtl() {
		return plotLocalIsRtl;
	}
	public void setPlotLocalIsRtl(boolean plotLocalIsRtl) {
		this.plotLocalIsRtl = plotLocalIsRtl;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public ArrayList<DirectorList> getDirectorList() {
		return directorList;
	}
	public void setDirectorList(ArrayList<DirectorList> directorList) {
		this.directorList = directorList;
	}
	public String getWriters() {
		return writers;
	}
	public void setWriters(String writers) {
		this.writers = writers;
	}
	public ArrayList<WriterList> getWriterList() {
		return writerList;
	}
	public void setWriterList(ArrayList<WriterList> writerList) {
		this.writerList = writerList;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
	public ArrayList<StarList> getStarList() {
		return starList;
	}
	public void setStarList(ArrayList<StarList> starList) {
		this.starList = starList;
	}
	public ArrayList<ActorList> getActorList() {
		return actorList;
	}
	public void setActorList(ArrayList<ActorList> actorList) {
		this.actorList = actorList;
	}
	public Object getFullCast() {
		return fullCast;
	}
	public void setFullCast(Object fullCast) {
		this.fullCast = fullCast;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public ArrayList<GenreList> getGenreList() {
		return genreList;
	}
	public void setGenreList(ArrayList<GenreList> genreList) {
		this.genreList = genreList;
	}
	public String getCompanies() {
		return companies;
	}
	public void setCompanies(String companies) {
		this.companies = companies;
	}
	public ArrayList<CompanyList> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(ArrayList<CompanyList> companyList) {
		this.companyList = companyList;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public ArrayList<CountryList> getCountryList() {
		return countryList;
	}
	public void setCountryList(ArrayList<CountryList> countryList) {
		this.countryList = countryList;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public ArrayList<LanguageList> getLanguageList() {
		return languageList;
	}
	public void setLanguageList(ArrayList<LanguageList> languageList) {
		this.languageList = languageList;
	}
	public String getContentRating() {
		return contentRating;
	}
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}
	public String getImDbRating() {
		return imDbRating;
	}
	public void setImDbRating(String imDbRating) {
		this.imDbRating = imDbRating;
	}
	public String getImDbRatingVotes() {
		return imDbRatingVotes;
	}
	public void setImDbRatingVotes(String imDbRatingVotes) {
		this.imDbRatingVotes = imDbRatingVotes;
	}
	public String getMetacriticRating() {
		return metacriticRating;
	}
	public void setMetacriticRating(String metacriticRating) {
		this.metacriticRating = metacriticRating;
	}
	public Object getRatings() {
		return ratings;
	}
	public void setRatings(Object ratings) {
		this.ratings = ratings;
	}
	public Object getWikipedia() {
		return wikipedia;
	}
	public void setWikipedia(Object wikipedia) {
		this.wikipedia = wikipedia;
	}
	public Object getPosters() {
		return posters;
	}
	public void setPosters(Object posters) {
		this.posters = posters;
	}
	public Object getImages() {
		return images;
	}
	public void setImages(Object images) {
		this.images = images;
	}
	public Object getTrailer() {
		return trailer;
	}
	public void setTrailer(Object trailer) {
		this.trailer = trailer;
	}
	public BoxOffice getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(BoxOffice boxOffice) {
		this.boxOffice = boxOffice;
	}
	public Object getTagline() {
		return tagline;
	}
	public void setTagline(Object tagline) {
		this.tagline = tagline;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public ArrayList<String> getKeywordList() {
		return keywordList;
	}
	public void setKeywordList(ArrayList<String> keywordList) {
		this.keywordList = keywordList;
	}
	public ArrayList<Similar> getSimilars() {
		return similars;
	}
	public void setSimilars(ArrayList<Similar> similars) {
		this.similars = similars;
	}
	public Object getTvSeriesInfo() {
		return tvSeriesInfo;
	}
	public void setTvSeriesInfo(Object tvSeriesInfo) {
		this.tvSeriesInfo = tvSeriesInfo;
	}
	public Object getTvEpisodeInfo() {
		return tvEpisodeInfo;
	}
	public void setTvEpisodeInfo(Object tvEpisodeInfo) {
		this.tvEpisodeInfo = tvEpisodeInfo;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	
}
