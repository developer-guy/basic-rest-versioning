package com.rest.versioning;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiVersion(1)
@RequestMapping("x")
public class HelloController {

    @RequestMapping("a")
    String a() {
        return "Api version 1";
    }         // maps to /v1/x/a

    @RequestMapping("b")
    @ApiVersion(2)
    String b() {
        return "Api version 2";
    }         // maps to /v2/x/b

    @RequestMapping("c")
    @ApiVersion({1, 3})
    String c() {
        return "Api version 1,3";
    }
}
