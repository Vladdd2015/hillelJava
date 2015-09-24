/**
 * Created by NewClass10 on 24.09.2015.
 */
public class Operations {
    public static void main(String[] args) {
        int res = 5 + 89;

        res = res + 1;//увеличивает на любое число

        res += 1;//увеличивает на любое число
        res++;//увеличивает только на еденицу
        ++res;//^ тоже самое ^

        print(res++);//98.Сначала передастся в метод print
        print(++res);//100.Сначала увеличит на 1

        int mod = 5 % 4;

        print(mod);



        boolean canAttend = paid() | addvert();//лог. "или" || - короткая логика

        System.out.println("can attend classes: " + canAttend);


        canAttend = paid() & knowledge();//лог. "и" && -короткая логика
        System.out.println("can attend classes: " + canAttend);

        int message = 100;
        int key = 31;

        System.out.println("message is " + message);

        int crypted = message ^ key;

        System.out.println("creped message is " + crypted);

        int uncrypted = crypted ^ key;

        System.out.println("uncrypted message is " + uncrypted);
    }

    public static boolean paid(){
        System.out.println("in paid method");
        return true;
    }

    public static boolean addvert(){
        System.out.println("in addvert method");
        return false;
    }

    public static boolean knowledge(){
        System.out.println("in knowledge method");
        return false;
    }

    public static void print(int i) {
        System.out.println(i);
    }
}
