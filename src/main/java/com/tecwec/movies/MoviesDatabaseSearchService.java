package com.tecwec.movies;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class MoviesDatabaseSearchService {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	private  List<MoviesDataModel> searching(String query){
        List<MoviesDataModel> moviesList = jdbcTemplate.query(query, new RowMapper<MoviesDataModel>() {
            public MoviesDataModel mapRow(ResultSet result, int rowNum) throws SQLException {
            	MoviesDataModel data = new MoviesDataModel();
                data.setMovieId(result.getString("movieId"));
                data.setMovieName(result.getString("movieName"));
                data.setMovieBanner(result.getString("movieBanner"));
                data.setMovieSummery(result.getString("movieSummery"));
                data.setMovieGenres(result.getString("movieGenres"));
                data.setMovieRating(result.getFloat("movieRating"));
                data.setMovieTrailer(result.getString("movieTrailer"));
                data.setMovieReleaseYear(result.getString("movieReleaseYear"));
                data.setMovieDuration(result.getString("movieDuration"));
                data.setMovieLanguage(result.getString("movieLanguage"));
                data.setMovieCountry(result.getString("movieCountry"));
                return data;
            }
        });
        return(moviesList);
	}
	
	public List<MoviesDataModel> searchByName(String name) {
//		String sqlSelect = "SELECT * FROM movies where movieName="+name;
//        List<MoviesDataModel> moviesList = jdbcTemplate.query(sqlSelect, new RowMapper<MoviesDataModel>() {
// 
//            public MoviesDataModel mapRow(ResultSet result, int rowNum) throws SQLException {
//            	MoviesDataModel data = new MoviesDataModel();
//                data.setMovieId(result.getString("movieId"));
//                data.setMovieName(result.getString("movieName"));
//                data.setMovieBanner(result.getString("movieBanner"));
//                data.setMovieSummery(result.getString("movieSummery"));
//                data.setMovieGenres(result.getString("movieGenres"));
//                data.setMovieRating(result.getFloat("movieRating"));
//                data.setMovieTrailer(result.getString("movieTrailer"));
//                data.setMovieReleaseYear(result.getString("movieReleaseYear"));
//                data.setMovieDuration(result.getString("movieDuration"));
//                data.setMovieLanguage(result.getString("movieLanguage"));
//                data.setMovieCountry(result.getString("movieCountry"));
//                return data;
//            }
//        });
//        return(moviesList);
		MoviesDatabaseSearchService search=new MoviesDatabaseSearchService();
		String query="SELECT * FROM movies where movieGenres="+name;
		return(search.searching(query));
	}
	
	
	public List<MoviesDataModel> SearchByGenres(String genres) {
		MoviesDatabaseSearchService search=new MoviesDatabaseSearchService();
		String query="SELECT * FROM movies where movieGenres="+genres;
		return(search.searching(query));
	}
	
	
	public List<MoviesDataModel> SearchByCountry(String country) {
		MoviesDatabaseSearchService search=new MoviesDatabaseSearchService();
		String query="SELECT * FROM movies where movieCountry="+country;
		return(search.searching(query));	
		}
	
	public List<MoviesDataModel> SearchByRating(float rating) {
		MoviesDatabaseSearchService search=new MoviesDatabaseSearchService();
		String query="SELECT * FROM movies where movieRating="+rating;
		return(search.searching(query));
		}
	
	public List<MoviesDataModel> SearchByReleaseYear(String year) {
		MoviesDatabaseSearchService search=new MoviesDatabaseSearchService();
		String query="SELECT * FROM movies where movieYear="+year;
		return(search.searching(query));
		}
	
	public List<MoviesDataModel> SearchByLanguage(String language) {
		MoviesDatabaseSearchService search=new MoviesDatabaseSearchService();
		String query="SELECT * FROM movies where movieLanguage="+language;
		return(search.searching(query));
		}
	
	

}
