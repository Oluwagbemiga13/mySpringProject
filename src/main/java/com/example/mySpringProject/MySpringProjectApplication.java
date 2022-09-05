package com.example.mySpringProject;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringProjectApplication {
    
    public static ArrayList<Cocktail> cocktails = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MySpringProjectApplication.class, args);
                
                Cocktail mojito = new Cocktail(0, "Mojito", 15);
                Cocktail maiTai = new Cocktail(1, "MaiTai", 20);
                Cocktail water = new Cocktail(2, "Water", 10);
                
                cocktails.add(mojito);
                cocktails.add(maiTai);
                cocktails.add(water);
	}

}
