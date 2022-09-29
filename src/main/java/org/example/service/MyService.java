package org.example.service;

public class MyService {
    public int getTextLength(String text) {
        //Hier eine Nullprüfung einbauen
        if (text == null) {
            throw new TextSourceException("\n##########\nBefinde mich jetzt in der MyService Exception: NULL !!!\n##########");
        }
        //if(text != null){throw new TextSourceException("\n##########\nText is too large!!");}
        return text.length();
    }

    //Klasse zurückliefern wenn ich ihr einen Namen liefere
    // Checked Exeptions, IntelliJ kompiliert das Programm nicht, bis die Klasse erstellt wurde
    /*
    public Class getClassByName(String name) {
        return Class.forName(name);
    }
    */
}
