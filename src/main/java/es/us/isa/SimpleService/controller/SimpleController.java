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
    public ResponseEntity<String> oneParamString(@RequestParam(name = "p1") String p1) {

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

    @GetMapping("/oneDependencyEnumParams")
    public ResponseEntity<String> oneDependencyEnumParams(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3") Integer p3
    ) {

        String message = "oneDependencyEnumParams is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyArithRelEnumParams")
    public ResponseEntity<String> oneDependencyArithRelEnumParams(
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p5") Integer p5
    ) {

        String message = "oneDependencyArithRelEnumParams is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/oneDependencyComplexEnumParams")
    public ResponseEntity<String> oneDependencyComplexEnumParams(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3") Integer p3
    ) {

        String message = "oneDependencyComplexEnumParams is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial1")
    public ResponseEntity<String> combinatorial1(
            @RequestParam(name = "p1") String p1,
            @RequestParam(name = "p2") String p2,
            @RequestParam(name = "p3") String p3,
            @RequestParam(name = "p4") String p4,
            @RequestParam(name = "p5") String p5
    ) {

        String message = "combinatorial1 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial2")
    public ResponseEntity<String> combinatorial2(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) Integer p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) Integer p4,
            @RequestParam(name = "p5", required = false) Integer p5,
            @RequestParam(name = "p6", required = false) Boolean p6,
            @RequestParam(name = "p7", required = false) Integer p7,
            @RequestParam(name = "p8", required = false) Integer p8,
            @RequestParam(name = "p9", required = false) Integer p9,
            @RequestParam(name = "p10", required = false) Integer p10
    ) {

        String message = "combinatorial2 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial3")
    public ResponseEntity<String> combinatorial3(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) String p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "combinatorial3 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial4")
    public ResponseEntity<String> combinatorial4(
            @RequestParam(name = "p1", required = false) Integer p1,
            @RequestParam(name = "p2", required = false) Integer p2,
            @RequestParam(name = "p3", required = false) Integer p3,
            @RequestParam(name = "p4", required = false) Integer p4,
            @RequestParam(name = "p5", required = false) Integer p5,
            @RequestParam(name = "p6", required = false) String p6,
            @RequestParam(name = "p7", required = false) String p7,
            @RequestParam(name = "p8", required = false) String p8,
            @RequestParam(name = "p9", required = false) String p9,
            @RequestParam(name = "p10", required = false) String p10
    ) {

        String message = "combinatorial4 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial5")
    public ResponseEntity<String> combinatorial5(
            @RequestParam(name = "p1") Boolean p1,
            @RequestParam(name = "p2") String p2,
            @RequestParam(name = "p3") Integer p3,
            @RequestParam(name = "p4") String p4,
            @RequestParam(name = "p5") Integer p5,
            @RequestParam(name = "p6") Boolean p6,
            @RequestParam(name = "p7") String p7,
            @RequestParam(name = "p8") String p8,
            @RequestParam(name = "p9") String p9,
            @RequestParam(name = "p10") String p10
    ) {

        String message = "combinatorial5 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial6")
    public ResponseEntity<String> combinatorial6(
            @RequestParam(name = "p1") String p1,
            @RequestParam(name = "p2") String p2,
            @RequestParam(name = "p3") Integer p3,
            @RequestParam(name = "p4") Integer p4,
            @RequestParam(name = "p5") Integer p5
    ) {

        String message = "combinatorial6 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial7")
    public ResponseEntity<String> combinatorial7(
            @RequestParam(name = "p1") String p1,
            @RequestParam(name = "p2", required = false) String p2,
            @RequestParam(name = "p3") Integer p3,
            @RequestParam(name = "p4") Integer p4,
            @RequestParam(name = "p5", required = false) Integer p5
    ) {

        String message = "combinatorial7 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/combinatorial8")
    public ResponseEntity<String> combinatorial8(
            @RequestParam(name = "p1", required = false) Boolean p1,
            @RequestParam(name = "p2") Boolean p2,
            @RequestParam(name = "p3",required = false) Boolean p3,
            @RequestParam(name = "p4") Boolean p4,
            @RequestParam(name = "p5", required = false) Boolean p5,
            @RequestParam(name = "p6") String p6,
            @RequestParam(name = "p7", required = false) String p7,
            @RequestParam(name = "p8") String p8,
            @RequestParam(name = "p9",required = false) String p9,
            @RequestParam(name = "p10") String p10
    ) {

        String message = "combinatorial8 is called";
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
