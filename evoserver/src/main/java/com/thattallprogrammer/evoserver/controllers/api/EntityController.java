package com.thattallprogrammer.evoserver.controllers.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EntityController {
    @GetMapping("/test-point")
    @ResponseBody
    public String entity() {
        return "{'x':100, 'y':100}";
    }

}
