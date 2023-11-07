package com.officialWebsite.officialWebsite.Repository;

import com.officialWebsite.officialWebsite.Model.ReviewForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewForm,Long> {

}
