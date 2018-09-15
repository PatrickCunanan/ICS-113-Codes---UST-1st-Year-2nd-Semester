package games;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harjit
 */
public class GameBean {
    public String title,picture,ratings;
    public GameBean(String title,String picture,String ratings){
        this.title = title;
        this.picture = picture;
        this.ratings = ratings;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void setpicture(String picture){
        this.picture = picture;
    }
    public void setratings(String ratings){
        this.ratings = ratings;
    }
    public String gettitle(){
        return title;
    }
    public String getpicture(){
        return picture;
    }
    public String getratings(){
        return ratings;
    }
}
