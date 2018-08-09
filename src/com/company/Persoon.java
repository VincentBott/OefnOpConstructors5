package com.company;

public class Persoon {

    private String voornaam;
    private String achternaam;

    public Persoon(String voornaam, String achternaam) {

        this.voornaam = voornaam;
        this.achternaam = achternaam;

    }

    public String getSorteerbareNaamBE() {

        return String.format("%s, %s", achternaam, voornaam);
    }

    public String getSorteerbareNaamNL() {


        String deelMetVanDe = "";

        String hoofdAchternaam = "";

        if (achternaam.lastIndexOf(' ') != -1) {

            hoofdAchternaam = achternaam.substring(achternaam.lastIndexOf(' ')+1);

            deelMetVanDe = achternaam.substring(0, achternaam.lastIndexOf(' '));
        }

            else
                hoofdAchternaam = achternaam;


        return String.format("%s, %s %s", hoofdAchternaam, voornaam, deelMetVanDe);
    }
}
