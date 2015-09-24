/**
 * Created by NewClass10 on 17.09.2015.
 */
public class MyFirstClass {

  public static void main(String[] args){
      sayHello();

      int age = 30;

      someMethod(age);
  }

    private static void someMethod(int age) {
        System.out.println(age);
    }

    private static void ageCalculation() {
        int vladBirthYear = 1994;


        int vladAge = calculateAge(1994);

        System.out.println("I'm " + vladAge);

        int maxAge = calculateAge(1984);

        System.out.println("Max age " + maxAge);
    }

    public static void sayHello(){
        String helloMassage = "Hello,world";
        System.out.println(helloMassage);

    }

    public static int calculateAge(){
        final  int birthYear = 1994;

        int year = 2015;
        int age = year - birthYear;
        return age;
    }

    public static int calculateAge(int birthYear){

        int year = 2015;
        int age = year - birthYear;
        return age;
    }
}

