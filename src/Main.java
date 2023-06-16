import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesap Makinesine Hoş Geldiniz!");

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("1- Toplama");
            System.out.println("2- Çıkarma");
            System.out.println("3- Çarpma");
            System.out.println("4- Bölme");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");

            int secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Hesap Makinesi kapatılıyor...");
                break;
            }

            double sayi1, sayi2;
            switch (secim) {
                case 1:
                    System.out.print("Toplama için ilk sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Toplama için ikinci sayıyı girin: ");
                    sayi2 = scanner.nextDouble();
                    double toplam = sayi1 + sayi2;
                    System.out.println("Sonuç: " + toplam);
                    break;
                case 2:
                    System.out.print("Çıkarma için ilk sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Çıkarma için ikinci sayıyı girin: ");
                    sayi2 = scanner.nextDouble();
                    double fark = sayi1 - sayi2;
                    System.out.println("Sonuç: " + fark);
                    break;
                case 3:
                    System.out.print("Çarpma için ilk sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Çarpma için ikinci sayıyı girin: ");
                    sayi2 = scanner.nextDouble();
                    double carpim = sayi1 * sayi2;
                    System.out.println("Sonuç: " + carpim);
                    break;
                case 4:
                    System.out.print("Bölme için ilk sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Bölme için ikinci sayıyı girin: ");
                    sayi2 = scanner.nextDouble();
                    if (sayi2 != 0) {
                        double bolum = sayi1 / sayi2;
                        System.out.println("Sonuç: " + bolum);
                    } else {
                        System.out.println("Hata: Sıfıra bölme hatası!");
                    }
                    break;
                case 5:
                    System.out.print("Üssü alınacak sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Üssü girin: ");
                    sayi2 = scanner.nextDouble();
                    double us = Math.pow(sayi1, sayi2);
                    System.out.println("Sonuç: " + us);
                    break;
                case 6:
                    System.out.print("Faktoriyeli hesaplanacak sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    double faktoriyel = 1;
                    for (int i = 1; i <= sayi1; i++) {
                        faktoriyel *= i;
                    }
                    System.out.println("Sonuç: " + faktoriyel);
                    break;
                case 7:
                    System.out.print("Mod alınacak sayıyı girin: ");
                    sayi1 = scanner.nextDouble();
                    System.out.print("Mod girin: ");
                    sayi2 = scanner.nextDouble();
                    double mod = sayi1 % sayi2;
                    System.out.println("Sonuç: " + mod);
                    break;
                case 8:
                    System.out.print("Dikdörtgenin uzun kenarını girin: ");
                    double uzunKenar = scanner.nextDouble();
                    System.out.print("Dikdörtgenin kısa kenarını girin: ");
                    double kisaKenar = scanner.nextDouble();
                    double alan = uzunKenar * kisaKenar;
                    double cevre = 2 * (uzunKenar + kisaKenar);
                    System.out.println("Alan: " + alan);
                    System.out.println("Çevre: " + cevre);
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                    break;
            }
        }
    }
}
