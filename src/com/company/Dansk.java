package com.company;

public class Dansk implements Dialog {

    private String s = "danish";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryk 'Q' forgdsgsdgsdg at stoppe. Tryk valgfri knap for at forsætte ";
    }

    @Override
    public String selectedLanguage() {
        return "det valgte sprog er ";
    }
}
