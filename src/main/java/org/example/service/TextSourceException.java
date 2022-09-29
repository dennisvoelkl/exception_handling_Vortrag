package org.example.service;

import org.example.exception.MyApplicationException;

public class TextSourceException extends MyApplicationException {
    public TextSourceException(String message) {
        //SUPER ruft Superklasse auf (Eltern oder Oberklasse)
        super(message);
    }

    public TextSourceException() {
        super();
    }
}
