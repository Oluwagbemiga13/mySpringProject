/*
 *  @ Danile Rakovský
$RequestHeader set AuditDate expr=%{TIME_YEAR}-%{TIME_MON}-%{TIME_DAY}
$RequestHeader set AuditDateTime expr=%{TIME}
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mySpringProject;

/**
 *
 * @author Daniel
 */
public class Cocktail {
    
    int id;
    String name;
    int price;
    
    public Cocktail(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    
}
