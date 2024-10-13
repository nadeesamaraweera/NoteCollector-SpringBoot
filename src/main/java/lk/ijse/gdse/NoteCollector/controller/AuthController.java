package lk.ijse.gdse.NoteCollector.controller;

import lk.ijse.gdse.NoteCollector.jwtmodel.JWTResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @PostMapping("signup")
    public ResponseEntity<JWTResponse> signUp(){
        return null;
    }
    @PostMapping("signin")
    public ResponseEntity<JWTResponse> signIn(){
        return null;
    }


}
