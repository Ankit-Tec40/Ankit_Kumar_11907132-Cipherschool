package com.tecwec.movies;

public class MoviesDataModel {
	private String movieId;
	private String movieName;
	private String movieBanner;
	private String movieSummery;
	private String movieGenres;
	private float movieRating;
	private String movieTrailer;
	private String movieReleaseYear;
	private String movieDuration;
	private String movieLanguage;
	private String movieCountry;
	@Override
	public String toString() {
		return "MoviesData [movieId=" + movieId + ", movieName=" + movieName + ", movieBanner=" + movieBanner
				+ ", movieSummery=" + movieSummery + ", movieGenres=" + movieGenres + ", movieRating=" + movieRating
				+ ", movieTrailer=" + movieTrailer + ", movieReleaseYear=" + movieReleaseYear + ", movieDuration="
				+ movieDuration + ", movieLanguage=" + movieLanguage + ", movieCountry=" + movieCountry + "]";
	}

	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieBanner() {
		return movieBanner;
	}
	public void setMovieBanner(String movieBanner) {
		this.movieBanner = movieBanner;
	}
	public String getMovieSummery() {
		return movieSummery;
	}
	public void setMovieSummery(String movieSummery) {
		this.movieSummery = movieSummery;
	}
	public String getMovieGenres() {
		return movieGenres;
	}
	public void setMovieGenres(String movieGenres) {
		this.movieGenres = movieGenres;
	}
	public float getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(float movieRating) {
		this.movieRating = movieRating;
	}
	public String getMovieTrailer() {
		return movieTrailer;
	}
	public void setMovieTrailer(String movieTrailer) {
		this.movieTrailer = movieTrailer;
	}
	public String getMovieReleaseYear() {
		return movieReleaseYear;
	}
	public void setMovieReleaseYear(String movieReleaseYear) {
		this.movieReleaseYear = movieReleaseYear;
	}
	public String getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieCountry() {
		return movieCountry;
	}
	public void setMovieCountry(String movieCountry) {
		this.movieCountry = movieCountry;
	}
	
	
	

}
