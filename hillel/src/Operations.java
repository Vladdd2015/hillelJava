/**
 * Created by NewClass10 on 24.09.2015.
 */
public class Operations {
    public static void main(String[] args) {
        int res = 5 + 89;

        res = res + 1;//����������� �� ����� �����

        res += 1;//����������� �� ����� �����
        res++;//����������� ������ �� �������
        ++res;//^ ���� ����� ^

        print(res++);//98.������� ���������� � ����� print
        print(++res);//100.������� �������� �� 1

        int mod = 5 % 4;

        print(mod);



        boolean canAttend = paid() | addvert();//���. "���" || - �������� ������

        System.out.println("can attend classes: " + canAttend);


        canAttend = paid() & knowledge();//���. "�" && -�������� ������
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
