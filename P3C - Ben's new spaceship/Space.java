import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Space extends World
{
    public Space()
    {    
        super(800, 600, 1);
        addObject( new Spaceship ("Enterprise" , 1 ), 400, 300);
        
    }
}