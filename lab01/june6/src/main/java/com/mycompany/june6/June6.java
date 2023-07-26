

package com.mycompany.june6;


public abstract class June6 {
    private double height;
    private double radius;
    

    public abstract double calculatevolume();
    
    public void setHeight(double height){
          this.height = height;
        
    }
    public void setRadius(double radius){
        this.radius=radius;
     }
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }
    
}
