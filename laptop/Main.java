package laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new MacBook();
        LaptopUser laptopUser = new LaptopUser(laptop);
        
        while (true){
            System.out.print("Masukan Perintah : ");
            String input = scanner.nextLine();
            switch (input){
                case "UP":
                    laptopUser.makeLaptopLouder();
                    break;
                case "DOWN":
                    laptopUser.makeLaptopSilence();
                    break;
                case "ON":
                    laptopUser.turnOnLaptop();
                    break;
                case "OFF":
                    laptopUser.turnOffLaptop();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    break;
                    
            }
        }
    }
}