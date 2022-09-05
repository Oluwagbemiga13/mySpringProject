/*
 *  @ Danile Rakovský
$RequestHeader set AuditDate expr=%{TIME_YEAR}-%{TIME_MON}-%{TIME_DAY}
$RequestHeader set AuditDateTime expr=%{TIME}
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mySpringProject.controller;
import com.example.mySpringProject.Cocktail;
import com.example.mySpringProject.MySpringProjectApplication;
import static com.example.mySpringProject.MySpringProjectApplication.cocktails;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel
 */
@RestController
public class CocktailController {
    
    @GetMapping("/cocktails")
    public ArrayList<Cocktail> getCocktails(){
        ArrayList<Cocktail> temp = new ArrayList<>();
        for (Cocktail cocktail : cocktails){
            temp.add(cocktail);
        }
        
    return temp;
    }
    
    
}
