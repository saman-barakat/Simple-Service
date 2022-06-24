package es.us.isa.SimpleService.controller;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping(path = "api")
public class SimpleController {


    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/noParams")
    public ResponseEntity<String> noParams() {

        String message = "noParams is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneParamBoolean")
    public ResponseEntity<String> oneParamBoolean(@RequestParam(name = "p1", required = false) Boolean p1) {

        String message = "oneParamBoolean is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneParamString")
    public ResponseEntity<String> oneParamString(@RequestParam(name = "p1", required = true) String p1) {

        String message = "oneParamString is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneParamInt")
    public ResponseEntity<String> oneParamInt(@RequestParam(name = "p1", required = false) Integer p1) {

        String message = "oneParamInt is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneParamEnumString")
    public ResponseEntity<String> oneParamEnumString(@RequestParam(name = "p1", required = false) String p1) {

        String message = "oneParamEnumString is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneParamEnumInt")
    public ResponseEntity<String> oneParamEnumInt(@RequestParam(name = "p1", required = false) Integer p1) {

        String message = "oneParamEnumInt is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyRequires")
    public ResponseEntity<String> oneDependencyRequires(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyRequires is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyOr")
    public ResponseEntity<String> oneDependencyOr(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyOr is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyOnlyOne")
    public ResponseEntity<String> oneDependencyOnlyOne(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyOnlyOne is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyAllOrNone")
    public ResponseEntity<String> oneDependencyAllOrNone(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyAllOrNone is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyZeroOrOne")
    public ResponseEntity<String> oneDependencyZeroOrOne(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyZeroOrOne is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyArithRel")
    public ResponseEntity<String> oneDependencyArithRel(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyArithRel is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyComplex")
    public ResponseEntity<String> oneDependencyComplex(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "oneDependencyComplex is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
