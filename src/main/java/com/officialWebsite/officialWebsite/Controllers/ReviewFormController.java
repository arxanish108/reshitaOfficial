package com.officialWebsite.officialWebsite.Controllers;

import com.officialWebsite.officialWebsite.Dtos.ReviewFormDto;
import com.officialWebsite.officialWebsite.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/review")
public class ReviewFormController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/review")
    public ResponseEntity<?> addReview(@RequestBody ReviewFormDto reviewFormDto){
        ReviewFormDto reviewFormDto1 = reviewService.addReview1(reviewFormDto);
        if(reviewFormDto1 != null){
            return new ResponseEntity<>(reviewFormDto1, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Not Added",HttpStatus.NOT_FOUND);
        }
    }
}
