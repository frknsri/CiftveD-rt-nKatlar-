import java.util.Scanner;
public class NoName {
    public static void main(String[] args) {
        int n ;
        int total = 0 ;
        Scanner inp = new Scanner(System.in);
        do{
            System.out.print("sayı giriniz :");
            n = inp.nextInt();
            if (n%2==0||n%4==0){
                total +=n;
                System.out.println("çift sayı ve 4 e tam bölünrn sayıların toplamaı : "+total);
            }else {
                System.out.println("tek sayı girdiniz");
                break;
            }
        }while (n>0);
        System.out.println("toplam : "+ total + "\n");









    }
}
