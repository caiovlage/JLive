package com.jlive.domain;
import java.util.HashMap;

public class DataBase
{
    private static HashMap<Object , String> DATA;
    private static  DataBase INSTANCIA;

    public static DataBase getInstance() {
        if(INSTANCIA == null) {
            INSTANCIA = new DataBase();
        }
        return INSTANCIA;
    }
}