package es.us.isa.SimpleService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api")
public class SimpleController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/oneParamInt")
    public ResponseEntity<String> oneParamInt(@RequestParam(value = "p1", required = false) Integer p1) {

        return new ResponseEntity<>("/oneParamInt is visited, p1:" + p1, HttpStatus.OK);
    }
}
