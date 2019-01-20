package com.jmoney.StickyTapeAPI.models;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ActorView {

  private Actor actor;

  public ActorView(Actor actor) {
    this.actor = actor;
  }

  public Long getId() {
    return actor.getId();
  }

  public String getFirstName() {
    return actor.getFirstName();
  }

  public String getLastName() {
    return actor.getLastName();
  }

  public Long getActiveSinceYear() {
    return actor.getActiveSinceYear();
  }

  public Date getBirthDate() {
    return actor.getBirthDate();
  }

  public List<MovieView> getMovies() {
    ArrayList<MovieView> views = new ArrayList<MovieView>();
    for (Movie movie : actor.getMovies()) {
      views.add(new MovieView(movie));
    }
    return views;
  }

  public List<Award> getAwards() {
    return actor.getAwards();
  }
}
