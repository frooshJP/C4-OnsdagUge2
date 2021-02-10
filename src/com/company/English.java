package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {

        return "Press any button to continue, press 'Q' for quit. ";

    }

    @Override
    public String selectedLanguage() {
        return "the selected language is ";
    }
}
