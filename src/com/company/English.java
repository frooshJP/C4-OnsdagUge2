package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "press 'Q' for quit. Press any button to continue";
    }

    @Override
    public String selectedLanguage() {
        return "the selected language is ";
    }
}
