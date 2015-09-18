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

        myName = "Vlad ";

        System.out.println("1." + myName + mySurname);

        myName = "Vlad";

        mySurname = " Palienko";

        System.out.println("2." + myName + mySurname);

        System.out.println("3." + "Vlad " + "Palienko");

        System.out.println("4." + "Vlad" + " Palienko");

        System.out.println("5." + "Vlad" + " " + "Palienko");


    }
}
