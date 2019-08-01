/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrartest.cine.model;

/**
 *
 * @author luis.leon
 */
public class Movie {

    private String title;
    private String duration;
    private int minimumAge;
    private String director;
    

    public Movie(String title, String duration, int minimumAge, String director) {
        this.title = title;
        this.duration = duration;
        this.minimumAge = minimumAge;
        this.director = director;
      
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    
    
    
    
    
}
