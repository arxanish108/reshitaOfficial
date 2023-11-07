package com.officialWebsite.officialWebsite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RequestVisit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @Column(unique = true)
    private String contact;
    private String feedback;
    private String suggestion;

}
