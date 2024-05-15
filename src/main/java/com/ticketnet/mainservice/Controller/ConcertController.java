package com.ticketnet.mainservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcertController {


    @GetMapping(value = "/concerts")
    public String getConcerts (@RequestParam(value = "artist")String artist,
                               @RequestParam(value = "venue", required = false) String venue){
        return "Welcome";
    }

}
