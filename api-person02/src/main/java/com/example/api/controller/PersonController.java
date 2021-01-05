package com.example.api.controller;


import java.util.ArrayList;
import java.util.List;

import com.example.api.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import io.reactivex.Single;

@RestController
public class PersonController {

    @GetMapping("/listar")
    public Single<List<Person>> findAll(){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Jordy", "Zamata"));
        personList.add(new Person(2, "David", "Zapata"));
        personList.add(new Person(3, "Juan", "Conislla"));
        personList.add(new Person(4, "Astrid", "Palomino"));
        personList.add(new Person(5, "Diego", "Palomino"));
        personList.add(new Person(6, "Maria", "Conislla"));
        personList.add(new Person(7, "Kevin", "Espinoza"));
        personList.add(new Person(8, "Marco", "Mamani"));



        return Single.just(personList);
    }
}
