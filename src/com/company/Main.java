package com.company;

public class Main {

    public static void main(String[] args) {


        Persoon p1 = new Persoon("Jan", "van der Straten");

        Persoon p2 = new Persoon("Joske", "Vermeulen");

        System.out.println("Belgisch: " +p1.getSorteerbareNaamBE());

        System.out.println("Nederlands: " +p1.getSorteerbareNaamNL());

        System.out.println("Belgisch: " +p2.getSorteerbareNaamBE());

        System.out.println("Nederlands: "+p2.getSorteerbareNaamNL());
    }
}
