package javabasics;

import java.util.Date;

public class Conflicts {

    public static void main(String[] args) {
        // conflicts by package
        Date date = new Date();
        java.sql.Date anotherDate = new java.sql.Date(1993L);

    }
}
