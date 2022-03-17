import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        String userName,password,passwordNew;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adiniz :");
        userName = input.nextLine();

        System.out.print("Sifreni :");
        password = input.nextLine();

        if (userName.equals("giris") && password.equals("123")){
            System.out.println("Giris basarili!");
        }else if (userName.equals("giris") || !password.equals("123")){
            System.out.println("Yanlis Sifre. Parola sifirlamak istermisiniz? Yes=1/No=2");

        }else if (!userName.equals("giris") || password.equals("123")){
            System.out.println("Yanlis username");
        }
        select = input.nextInt();
        switch (select){
            case 1:
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni sifre giriniz");
                password = inp.nextLine();

                if (password.equals("123")){
                    System.out.print("Eski sifre girdiniz lutfen yeni bir sifre olusturun:");
                    password = inp.nextLine();
                    System.out.print("Sifre basarili bir sekilde degistirildi:");
                break;


                }else{
                    System.out.println("Sifre basarili bir sekilde degistirildi");
                }
                break;
            case 2:
                System.out.print("Sifre degistirme islemi sonlandi");
                break;
            default:
                System.out.print("Yanlis giris yaptiniz lutfen tekrar deneyin:");
        }

































    }
}
