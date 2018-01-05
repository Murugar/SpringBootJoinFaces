package com.iqmsoft.controller;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
 
@ManagedBean(name="helloController")
@RequestScoped
public class HelloController {
     
        private String timeStamp;
     
    public HelloController() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        timeStamp = date.format(formatter);
    }
     
    private String hello = "Hello Spring Boot Join Faces";
 
    public String getHello() {
        return hello;
    }
 
    public void setHello(String hello) {
        this.hello = hello;
    }
 
    public String getTimeStamp() {
        return timeStamp;
    }
 
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
 
    public String updateTime() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        timeStamp = date.format(formatter);
        return null;
    }
 
}