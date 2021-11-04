package com.servers.servermanager.enumaration;

public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_Down("SERVER_DOWN");

    private final  String status;

    Status(String status){
        this.status=status;
    }
    public  String getStatus(){
        return this.status;
    }
}
