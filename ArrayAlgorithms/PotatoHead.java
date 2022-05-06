
/**
 * This is the PotatoHead class that makes PotatoHead objects
 * It is my first class.
 *
 * @author Ben Smith
 * @version 1 (January 7, 2021)
 */

public class PotatoHead
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private String catchPhrase;
    private int eyeType;
    private boolean hasMoustache;

    /**
     * Constructor for objects of class PotatoHead takes in all 5 instance varibles
     * @param name String
     * @param age int
     * @param catchPhrase String
     * @param eyeType int
     * @param hasMoustache boolean
     */
    public PotatoHead(String name, int age, String catchPhrase, int eyeType, boolean hasMoustache)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
        this.catchPhrase = catchPhrase;
        this.eyeType = eyeType;
        this.hasMoustache = hasMoustache;
    }

    /**
     * Constructor for making a default Potatohead
     * 
     */
    public PotatoHead()
    {
        this.name = "No name Yet!";
        this.age = 0;
        this.catchPhrase = "This spud's a dud!";
        this.eyeType = 0;
        this.hasMoustache = false;
    }

    /**
     * setter for name
     * @param newName String which is the new name
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * setter for age
     * @param newAge int which is the new age
     */
    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    /**
     * setter for catchPhrase
     * @param newCatchPhrase String which is the new catch phrase
     */
    public void setCatchPhrase(String newCatchPhrase)
    {
        this.catchPhrase = newCatchPhrase;
    }

    /**
     * Getter for name
     * @return name String
     */
    public String getName() 
    {
        return this.name;
    }

    /**
     * Getter for age
     * @return age int
     */
    public int getage() 
    {
        return this.age;
    }

    /**
     * Getter for catchPhrase
     * @return catchPhrase String
     */
    public String getCatchPhrase() {return this.catchPhrase;}
    public boolean getHasMoustache() {return this.hasMoustache;}
    /**
     * HaveBirthday method that adds to age
     *
     * @return birthdayMessage String
     */
    public String haveBirthday()
    {
        // put your code here
        this.age = this.age +1;
        return "Hey, it's your birthday! you are " + this.age + " years old!";
    }

    /**
     * addMoustache method to add moustache only if no moustache 
     * @return message String 
     */
    public String addMoustache()
    {
        if( hasMoustache)
        {
            return "you already have a moustache";
        }
        hasMoustache = true;
        return "You now have a moustache";
    }

    /**
     * toString() method for the PotatoHead
     * @return String message with info about the PotatoHead
     */
    public String toString()
    {
        return "Your PotatoHead, " + name + " is " + age + " years old.\n your catchPhrase is " + 
        catchPhrase + " you have eyetype " + eyeType + " and you have a moustache? " + hasMoustache;
    }
}
