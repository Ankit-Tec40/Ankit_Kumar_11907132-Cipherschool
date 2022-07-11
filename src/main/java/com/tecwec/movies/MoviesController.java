package com.tecwec.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
	@Autowired
	private MoviesDatabaseSearchService searchService;
	@Autowired
	private MovieDatabaseCRUDService crudService;
	
	@RequestMapping("/")
	List<MoviesDataModel> show() {
		return crudService.displayAll();
	}
	
	@RequestMapping("/showAll")
	List<MoviesDataModel> showAll() {
		return crudService.displayAll();
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	String add(@RequestBody MoviesDataModel movieData) {
		return crudService.add(movieData);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	String update(@RequestBody MoviesDataModel movieData) {
		MoviesDataModel data=new MoviesDataModel();
		return crudService.update(data);
	}
	
	@RequestMapping(value = "/delete/{id}")
	String add(@PathVariable String id) {
		return crudService.delete(id);
	}
	
	@RequestMapping("/searchByName/{name}")
	List<MoviesDataModel> searchByName(@PathVariable String name) {
		System.out.println(name);
			return searchService.searchByName(name);	
			}
	
	@RequestMapping("/SearchByGenres/{genres}")
	List<MoviesDataModel> SearchByGenres(@PathVariable String genres) {
			return searchService.SearchByGenres(genres);	
			}
	
	@RequestMapping("/SearchByCountry/{country}")
	List<MoviesDataModel> SearchByCountry(@PathVariable String country) {
			return searchService.SearchByCountry(country);	
			}
	
	@RequestMapping("/SearchByRating/{rating}")
	List<MoviesDataModel> SearchByRating(@PathVariable Float rating) {
			return searchService.SearchByRating(rating);	
			}
	
	@RequestMapping("/SearchByReleaseYear/{releaseYear}")
	List<MoviesDataModel> SearchByReleaseYear(@PathVariable String releaseYear) {
			return searchService.SearchByReleaseYear(releaseYear);	
			}
	
	@RequestMapping("/SearchByLanguage/{language}")
	List<MoviesDataModel> SearchByLanguage(@PathVariable String language) {
			return searchService.SearchByLanguage(language);	
			}
	

}
