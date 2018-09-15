/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sssit;

/**
 *
 * @author Patrick
 */
public class User {
    private String name,password,email;
    
    public void setname (String n){
    name =n;
    }
    public void setemail (String n){
    email =n;
    }
    public void setpassword (String n){
    password =n;
    }
    public String getname (){
    return name;
    }
    public String getemail (){
    return email;
    }
    public String getpassword (){
    return password;
    }
}
