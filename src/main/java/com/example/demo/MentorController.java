package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MentorController {  //Sending a whole object through the getApi.
    @GetMapping("/getObj")
    public Mentor getMenotor(){  //We dont have to write code to convert java object into json manually, spring will handel it.
        MentorService men = new MentorService();
        return men.getMentor();
    }

//    @Autowired
//    private MentorService men =new MentorService();

    @GetMapping("/getList")
    public List<Mentor> getMentors(){
        MentorService men =new MentorService();
        return men.getMentors();
    }
}
