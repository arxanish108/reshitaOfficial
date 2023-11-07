package com.officialWebsite.officialWebsite.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewFormDto {
    private String name;
    private String contact;
    private String feedback;
    private String suggestion;
}
