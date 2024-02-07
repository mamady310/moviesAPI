package com.moviesAPI.moviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

@RequestMapping("/api/movies")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> postBody) {
        return new ResponseEntity<Review>(reviewService.createReview(postBody.get("reviewBody"), postBody.get("imdbId")),
        HttpStatus.CREATED);
    }
}
