import java.util.Scanner;
public class Main {
    static int hesaplama(int usDeger, int taban){
        int result = 1;
        if (usDeger!=0){
            return result = taban * hesaplama(usDeger - 1 , taban);

        }else return 1;

    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int taban,usDeger;
        System.out.print("Taban sayımızı giriniz : ");
        taban = input.nextInt();
        System.out.print("Üs sayımızı giriniz : ");
        usDeger= input.nextInt();


        System.out.print("SONUÇ : " + hesaplama(usDeger,taban));
    
    


    }
}