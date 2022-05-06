/**
 * The rectangle class example used to show class design and methods with
 * and without parameters and return values.
 * @author Ben Smith
 * @version January 2021
 */
class Rectangle {
    /**
     * Instance variables for a rectangle object are height and width. 
     * Both are double values.
     * double height
     * double width
     */
    private double height;
    private double width;

     /**
     * constructor for a rectangle object that accepts double values for height and width 
     * @param initHeight double height of the rectangle
     * @param initWidth double width of the rectangle
     */
    public Rectangle(double initHeight, double initWidth) 
    {
        height = initHeight;
        width = initWidth;
    }

    /**
     * getHeight method to access the value of height.
     * @returns height double value
     */
    public double getHeight() { return height; }

    /**
     * getWidth method to access the value of width.
     * @returns width double value
     */
    public double getWidth() { return width; }

    /**
     * setHeight method to set the value of height to a new value.
     * @param newHeight double to set new height value
     */
    public void setHeight(double newHeight) { height = newHeight; }

    /**
     * setWidth method to set the value of width to a new value.
     * @param newWidth double to set new width value
     */
    public void setWidth(double newWidth) { width = newWidth; }

    /**
     * perimeter method to calculate the rectangle's perimeter.
     * @returns perimeter double value
     */
    public double perimeter() 
    {
        double perimeter = 2*height + 2*width;
        return perimeter;
    }

    /**
     * area method that returns the rectangle's area.
     * @return area double value
     */
    public double area() { 
        double area = height * width;
        return area;
    }

    /** Scale - scales the rectangle by scale factor
     *  Precondition scaleFactor > 0
     *  @param scaleFactor is a double number
     */
    public void scale(double scaleFactor) 
    { 
        height = height * scaleFactor;
        width = width * scaleFactor;
    }

    /** Scale Height - scales the height of the rectangle by scale factor
     *  Precondition scaleFactor > 0
     *  @param scaleFactor is a double number
     */
    public void scaleHeight(double scaleFactor) 
    { 
        height = height * scaleFactor;
    }

    /** ScaleWidth - scales the rectangle's width by a scale factor
     *  Precondition scaleFactor > 0
     *  @param scaleFactor is a double number
     */
    public void scaleWidth(double scaleFactor) 
    { 
        width = width * scaleFactor;
    }

    /** ScaleBoth - scales the rectangle by scale factors for width and height
     *  Precondition scaleFactors for both width and height will be > 0
     *  @param scaleFactorHeight is a double number to change height
     *  @param scaleFactorWidth is a double number to change width
     */
    public void scaleBoth(double scaleFactorHeight, double scaleFactorWidth) 
    { 
        height = height * scaleFactorHeight;
        width = width * scaleFactorWidth;
    }

    /**
     * diagonal method returns the height of the diagonal of the rectangle
     * @returns diagonal double value
     */
    public double diagonal()
    {
        double diagonal = Math.sqrt( (width*width) + (height*height) );
        return diagonal;
    }

    /**
     * display method uses asterisks (*) to display the size of the rectangle 
     * to the nearest int.
     * This method prints the result to the console.
     */
    public String display()
    {
        String rect = "";
        for(int r = 0 ; r < (int)height ; r++)
        {
            for(int c = 0 ; c < (int)width ; c++)
            {
                rect+="* ";
            }
            rect+="\n";
        }
        return rect;
    }

    /**
     * toString method to return the rectangle's properties as a String
     * @returns a string description of the object.
     */
    public String toString() 
    {
        return "Rectangle with height " + height + " and width " + width 
        + "\n and the diagonal is length " + this.diagonal() 
        + "\n" + this.display();
    }

}