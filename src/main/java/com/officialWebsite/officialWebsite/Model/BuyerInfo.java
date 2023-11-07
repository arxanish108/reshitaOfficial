package com.officialWebsite.officialWebsite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BuyerInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuyerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String contact ;
    private String state;
    private String city;
    private String special;

}
