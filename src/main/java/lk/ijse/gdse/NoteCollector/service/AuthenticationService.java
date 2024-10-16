package lk.ijse.gdse.NoteCollector.service;

import lk.ijse.gdse.NoteCollector.dto.impl.UserDTO;
import lk.ijse.gdse.NoteCollector.jwtmodel.JwtAuthResponse;
import lk.ijse.gdse.NoteCollector.jwtmodel.SignIn;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(UserDTO signUp);
    JwtAuthResponse refreshToken(String accessToken);
}
