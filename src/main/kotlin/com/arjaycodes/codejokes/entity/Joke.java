package com.arjaycodes.codejokes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jokeId;
    private String jokeName;
    private String jokeContent;

    public Joke() { }
    public Joke(String jokeName, String jokeContent) {
        this.jokeName = jokeName;
        this.jokeContent = jokeContent;
    }

    public Long getJokeId() {
        return jokeId;
    }
    public void setJokeId(Long jokeId) {
        this.jokeId = jokeId;
    }
    public String getJokeName() {
        return jokeName;
    }
    public void setJokeName(String jokeName) {
        this.jokeName = jokeName;
    }
    public String getJokeContent() {
        return jokeContent;
    }
    public void setJokeContent(String jokeContent) {
        this.jokeContent = jokeContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joke joke = (Joke) o;
        return Objects.equals(jokeId, joke.jokeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(jokeId);
    }
}
