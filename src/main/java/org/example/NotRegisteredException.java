package org.example;

public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String playerName) {
        super("Игорок с именем " + playerName + " не зарегестривован");
    }
}
