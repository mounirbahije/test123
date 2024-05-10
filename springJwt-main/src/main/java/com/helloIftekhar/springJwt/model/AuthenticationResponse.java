package com.helloIftekhar.springJwt.model;

/**
 * Représente la réponse d'authentification contenant un jeton et un message.
 */
public class AuthenticationResponse {
    private String token;
    private String message;

    public AuthenticationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }
}
