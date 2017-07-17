package com.biso.website.controller;

import com.biso.website.data.entity.UserMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by biso on 16.07.17.
 */
@Controller
public class ContactMeController {

    @RequestMapping(value = "/userMessage", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> userMessage(UserMessage message, HttpServletResponse response) {
        Map<String, String> result = new HashMap<>();
        result.put("status", "failed");
        return result;
    }
}
