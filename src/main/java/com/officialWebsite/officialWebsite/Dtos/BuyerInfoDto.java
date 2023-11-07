package com.officialWebsite.officialWebsite.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuyerInfoDto {
    private String name;
    private String contact ;
    private String state;
    private String city;
    private String special;
}
