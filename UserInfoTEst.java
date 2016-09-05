import java.util.Scanner;
public class UserInfoTEst
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your name, followed by a space, your staff ID, followed by a space, \nand your DOB in the format yyyymmdd");
        UserInfo c = new UserInfo();
        c.setName(reader.next());
        c.setStaffID(reader.nextInt());
        c.setDOB(reader.nextInt());
        System.out.println("Your name is "+ c.getName()+", your staff ID is " + c.getStaffID()+", and your DOB is "+c.getDOB());
    } 
}