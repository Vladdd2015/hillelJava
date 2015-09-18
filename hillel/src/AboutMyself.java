/**
 * Created by Влад on 18.09.2015.
 */
public class AboutMyself {
    public static void main(String[] args){
       String myName = "Vlad";

       String mySurname = "Palienko";

       int myBirthYear = 1994;

       int currentYear = 2015;

       int myAge = currentYear - myBirthYear;

       System.out.println("My name is " + myName + " " + mySurname);
       System.out.println("I'm " + myAge + " years old");

    }
}
