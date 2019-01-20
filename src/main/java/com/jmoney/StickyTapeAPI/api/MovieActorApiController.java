package com.jmoney.StickyTapeAPI.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmoney.StickyTapeAPI.models.Actor;
import com.jmoney.StickyTapeAPI.models.Movie;
import com.jmoney.StickyTapeAPI.repositories.ActorRepository;
import com.jmoney.StickyTapeAPI.repositories.MovieRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/movies/{movieId}/actors")
public class MovieActorApiController {

	private ActorRepository ar;
	private MovieRepository mr;

	public MovieActorApiController(ActorRepository ar, MovieRepository mr) {
		this.ar = ar;
		this.mr = mr;
	}

	@PostMapping("")
	public Movie create(@PathVariable Long movieId, @RequestBody Long actorId) {
		Movie movie = mr.findOne(movieId);
		Actor actor = ar.findOne(actorId);
		movie.getActors().add(actor);
		mr.save(movie);
		return movie;
	}

}