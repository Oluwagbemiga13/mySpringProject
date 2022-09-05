/*
 *  @ Danile Rakovský
$RequestHeader set AuditDate expr=%{TIME_YEAR}-%{TIME_MON}-%{TIME_DAY}
$RequestHeader set AuditDateTime expr=%{TIME}
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.mySpringProject.controller;
 
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
  @GetMapping("/helloworld")
  public String helloWorld() {
    return "Hello World!";
  }
  
  @GetMapping("/dan")
  public ArrayList<String> dan() {
      ArrayList<String> list = new ArrayList<>();
      list.add("Dan");
      list.add(" je");
      list.add(" frajer!");
    return list;
  }
  @GetMapping("/danda")
  public String danToString(){
      
      String text = null;
      ArrayList<String> list = new ArrayList<>();
      list.add("Dan");
      list.add(" je");
      list.add(" frajer!");
      for(String element: list){
          if (text == null){
          text = element;
          }
          else{
      text = text + element;
          }
      }
      return text;
  }
  @GetMapping("/tolu")
  public String toluMessage(){
      
      String text = "Tolu is the most beautiful woman ever!!!";
      return text;
  }
  
  @GetMapping("/daniel")
  public String danielMessage(){
      
      String text = "\nDaniel is the most fartiful man ever!!!";
      String text1 = "\nDaniel is the most fartiful man ever!!!";
      
      for (int i=0; i<200;i++){
      text1 = text + text1;
      }
      return text1;
  }
  
}