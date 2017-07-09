package com.biso.website.data;

import com.biso.website.data.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by biso on 09.07.17.
 */
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findAll();
}
