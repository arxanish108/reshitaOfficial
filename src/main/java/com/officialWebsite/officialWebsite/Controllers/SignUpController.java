package com.officialWebsite.officialWebsite.Controllers;

import com.officialWebsite.officialWebsite.Dtos.SignUpDto;
import com.officialWebsite.officialWebsite.Services.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @PostMapping("/sign")
    public ResponseEntity<?> sign(@RequestBody SignUpDto signUpDto){
        SignUpDto signUpDto1 = signUpService.addSign(signUpDto);
        if(signUpDto1 != null){
            return new ResponseEntity<>(signUpDto1, HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
        }
    }
}
