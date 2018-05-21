package com.arjaycodes.codejokes.controller;

import com.arjaycodes.codejokes.entity.Joke;
import com.arjaycodes.codejokes.repository.JokeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class JokesController {

    private JokeRepository jokeRepository;
    public JokesController(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @RequestMapping({"/", ""})
    public String getRandomJoke(Model model) {
        String viewName = "jokes";
        List<Joke> allJokes = (ArrayList<Joke>) jokeRepository.findAll();

        int randIndex = new Random().nextInt();

        model.addAttribute(viewName, allJokes.get(
                (int) Math.floor(
                        randIndex*(allJokes.size()-1)
                )
        ));

        return viewName;
    }

}
