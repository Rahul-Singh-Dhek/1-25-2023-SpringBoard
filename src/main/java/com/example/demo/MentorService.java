package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MentorService {
    public Mentor getMentor(){  //We dont have to write code to convert java object into json manually, spring will handel it.
        return new Mentor(10,20);
    }

    public List<Mentor> getMentors(){
        List<Mentor> Mentors=new ArrayList<>();
        Mentors.add(new Mentor(1,2));
        Mentors.add(new Mentor(3,4));
        Mentors.add(new Mentor(5,6));
        Mentors.add(new Mentor(7,8));
        Mentors.add(new Mentor(9,0));
        return Mentors;
    }

}
