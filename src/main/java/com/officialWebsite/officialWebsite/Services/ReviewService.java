package com.officialWebsite.officialWebsite.Services;

import com.officialWebsite.officialWebsite.Dtos.ReviewFormDto;
import com.officialWebsite.officialWebsite.Model.ReviewForm;
import com.officialWebsite.officialWebsite.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    public ReviewFormDto addReview1(ReviewFormDto reviewFormDto) {

        ReviewForm reviewForm = new ReviewForm();
        reviewForm.setName(reviewFormDto.getName());
        reviewForm.setContact(reviewFormDto.getContact());
        reviewForm.setFeedback(reviewFormDto.getFeedback());
        reviewForm.setSuggestion(reviewFormDto.getSuggestion());

        ReviewForm reviewForm1 = reviewRepository.save(reviewForm);

        ReviewFormDto reviewFormDto1 = new ReviewFormDto();
        reviewFormDto1.setName(reviewForm1.getName());
        reviewFormDto1.setContact(reviewForm1.getContact());
        reviewFormDto1.setFeedback(reviewForm1.getFeedback());
        reviewFormDto1.setSuggestion(reviewForm1.getSuggestion());

        return reviewFormDto1;
    }
}
