package com.tecwec.movies;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class MovieDatabaseCRUDService {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	
	public List<MoviesDataModel> displayAll() {
		String sqlSelect = "SELECT * FROM movies";
        List<MoviesDataModel> moviesList = jdbcTemplate.query(sqlSelect, new RowMapper<MoviesDataModel>() {
 
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
	
	
	
	public String add(MoviesDataModel data) {
		String addQuery="insert into movies values(?,?,?,?,?,?,?,?,?,?,?)";
		int result=jdbcTemplate.update(addQuery,
				data.getMovieId(),
				data.getMovieName(),
				data.getMovieBanner(),
				data.getMovieSummery(),
				data.getMovieGenres(),
				data.getMovieRating(),
				data.getMovieTrailer(),
				data.getMovieReleaseYear(),
				data.getMovieDuration(),
				data.getMovieLanguage(),
				data.getMovieCountry()
				);
        
		if (result>0) {
			return ("Data Addes Successfully");
		}else {
			return("Data Not Added");
		}
	}
	
	
	
	public String update(MoviesDataModel data) {
		String updateQuery="update movies set movieName=?,movieBanner=?,movieSummery=?,movieGenre=?,"
				+ "smovieRating=?,movieTrailer=?,movieReleaseYear=?,movieDuration=?,movieCountry=? where movieId=?";
		int result=jdbcTemplate.update(updateQuery,
				data.getMovieName(),
				data.getMovieBanner(),
				data.getMovieSummery(),
				data.getMovieGenres(),
				data.getMovieRating(),
				data.getMovieTrailer(),
				data.getMovieReleaseYear(),
				data.getMovieDuration(),
				data.getMovieLanguage(),
				data.getMovieCountry(),				
				data.getMovieId()
				);
        
		if (result>0) {
			return ("Data Updated Successfully");
		}else {
			return("Data Not Updated");
		}	
	}
	
	
	public String delete(String id) {
		String updateQuery="delete from movies where movieId=?";
		int result=jdbcTemplate.update(updateQuery,id);
        
		if (result>0) {
			return ("Data Deleted Successfully");
		}else {
			return("Data Not Deleted");
		}	
	}
	

}
