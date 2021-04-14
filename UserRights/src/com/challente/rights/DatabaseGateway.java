package com.challente.rights;
public class DatabaseGateway {
    final static  String WRITE_TO_DB = "write to database";

    private static String database;

    static void writeToDBForce(PowerUser powerUser, String message){
        powerUser.setUpAccessRight(WRITE_TO_DB,true);
        writeToDb(powerUser, message);
    }

    static void writeToDb(PowerUser powerUser, String message){
        if (powerUser.getValueOfAccessRight(WRITE_TO_DB)){
            database= message;
        }
    }

    static String readFromDB(){
        return  database;
    }
}
