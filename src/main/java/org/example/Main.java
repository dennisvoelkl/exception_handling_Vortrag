package org.example;
import org.example.service.MyService;

public class Main {
    public static void main(String[] args) {

        String myText = "A test string";
        //String myText = null;
        MyService service = new MyService();
        System.out.println("Text Length: " + service.getTextLength(myText));

        try {
            System.out.println("Text length: " + service.getTextLength(myText));
        }catch (NullPointerException e) {
            System.out.println("Error occured in get text length: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Unknown Error");
        //Wenn man sich sicher ist, das zuvor alles korrekt gelaufen ist, kann man mit finally aufräumen
        }finally {
            System.out.println(" Bitte am Ende immer aufräumen!");
        }

    }
}