package com.biso.website.data.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by biso on 09.07.17.
 */
public class Post {

    @Id
    public String id;

    public String heading;
    public String content;
    public String posterName;
    public Date postingDate;

    public Post () {}

    public Post(String heading, String content, String posterName, Date postingDate) {
        this.heading = heading;
        this.content = content;
        this.posterName = posterName;
        this.postingDate = postingDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Post { id=%s,\n heading='%s',\n content='%s', \n posterName='%s', \n postingDate='%s'\n}",
                id, heading, content, posterName , postingDate);
    }
}
