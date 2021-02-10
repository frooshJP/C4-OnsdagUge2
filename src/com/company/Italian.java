package com.company;

public class Italian implements Dialog {

    private String s = "Italian";
    @Override
    public String getLanguage() { return s; }

    @Override
    public String quit() { return "premere 'Q' q per uscire. Premere il pulsante opzionale per continuare"; }

    @Override
    public String selectedLanguage() { return "la lingua selezionata è"; }

}

