package com.biso.website;

import com.biso.website.data.PostRepository;
import com.biso.website.data.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by biso on 09.07.17.
 */
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private PostRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.deleteAll();

        repository.save(new Post("Who am I ?", "I am a software engineer with a couple of years experience.\n" +
                "                            My motto is \"Simplicity is the glory of expression\" and I like splitting my work into small, simple and concrete workflows.", "Biser Ivanov", new Date()));
        repository.save(new Post("What I can do for you ?", "I can automate every business process by developing simple, scalable and robust software.", "Biser Ivanov", new Date()));
        repository.save(new Post("Why you should choose me to develop your software ?", "Because I ...", "Biser ivanov", new Date()));

    }
}
