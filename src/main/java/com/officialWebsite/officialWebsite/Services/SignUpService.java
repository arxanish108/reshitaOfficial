package com.officialWebsite.officialWebsite.Services;

import com.officialWebsite.officialWebsite.Dtos.SignUpDto;
import com.officialWebsite.officialWebsite.Model.SignUp;
import com.officialWebsite.officialWebsite.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private SignUpRepository signUpRepository;
    public SignUpDto addSign(SignUpDto signUpDto) {

        SignUp signUp = new SignUp();
        signUp.setName(signUpDto.getName());
        signUp.setMobileNum(signUpDto.getMobileNum());
        signUp.setState(signUpDto.getState());
        signUp.setEmail(signUpDto.getEmail());
        signUp.setCity(signUpDto.getCity());

        SignUp signUp1 = signUpRepository.save(signUp);

        SignUpDto signUpDto1 = new SignUpDto();
        signUpDto1.setName(signUp1.getName());
        signUpDto1.setMobileNum(signUp1.getMobileNum());
        signUpDto1.setState(signUp1.getState());
        signUpDto1.setEmail(signUp1.getEmail());
        signUpDto1.setCity(signUp1.getCity());

        return signUpDto1;
    }
}
