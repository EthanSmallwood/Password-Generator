package EndortechPasswordGenerator;

import java.util.Scanner;

public class Window {

    public static Scanner scanner = new Scanner(System.in);
    public void print(String prompt){ System.out.println(prompt); }

    public int getInt(){
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }


    public void mainWindow(Generator gen){
        print("PASSWORD GENERATOR");
        print("Lowercase = "+ gen.isUseLowerCase());
        print("Uppercase = "+gen.isUseUpperCase());
        print("Digits = "+gen.isUseDigits());
        print("Symbols = "+gen.isUseSymbols());
        print("Length = "+gen.getLength());
        print("""
                
                Switches
                1 - Lowercase
                2 - Uppercase
                3 - Digits
                4 - symbols
                5 - Length
                6 - Generate
                7 - Exit
                
                please enter an option (Integer Only): 
                """);
    }
}
