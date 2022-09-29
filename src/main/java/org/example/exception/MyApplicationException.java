package org.example.exception;
// 1. Package exception erstellt
// 2. Klasse "MyApplicationException" erstellt
// 3. Klasse Extends erweitert
// 4. Konstruktor erstellt mit Exception
public class MyApplicationException extends RuntimeException {
    public MyApplicationException(String message) {
        //Ableitung haben wir nur dafür gemacht damit wir ind er Lage sind zu unterscheiden woher die Exceptions kommen
        //Konstruktor von der Oberklasse nehmen
        super(message);
    }

    public MyApplicationException() {

    }
}
