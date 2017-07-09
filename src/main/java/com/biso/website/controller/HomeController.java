package com.biso.website.controller;

import com.biso.website.data.PostRepository;
import com.biso.website.data.entity.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by biso on 01.07.17.
 */

@Controller
public class HomeController {

    @Autowired
    PostRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(Model model) {
        List<Post> posts = repository.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }
}
