
/**
 * Write a description of class UserInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInfo
{
    private String name;
    private int staff_id;
    private int date_of_birth;
    
    public UserInfo(){}
    
    public String getName(){return this.name;}
    public int getStaffID(){return this.staff_id;}
    public int getDOB(){return this.date_of_birth;}
    
    public void setName(String s){this.name = s;}
    public void setStaffID(int s){this.staff_id = s;}
    public void setDOB(int s){this.date_of_birth = s;}
}
