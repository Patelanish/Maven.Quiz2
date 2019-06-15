package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    private String migrationMonth;


    public RedRobin(String migrationMonth) {
        this.migrationMonth = migrationMonth;

    }

    public RedRobin() {
        this.migrationMonth = "August";

    }

    public String color() {
        return "red";
    }

    public int speed(){
        return 10;
    }

    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;

    }

    public String getMigrationMonth() {
        return migrationMonth;
    }




}
