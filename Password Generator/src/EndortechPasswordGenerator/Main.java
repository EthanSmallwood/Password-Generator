package EndortechPasswordGenerator;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Generator gen = new Generator();
        Window win = new Window();
        boolean control = true;

        while (control) {
            win.mainWindow(gen);
            int index = win.getInt();
            switch (index) {
                case 1->gen.setUseLowerCase();
                case 2->gen.setUseUpperCase();
                case 3->gen.setUseDigits();
                case 4->gen.setUseSymbols();
                case 5->{win.print("Please enter length of password: ");gen.setLength(win.getInt());}
                case 6->{win.print("Password = "+ gen.passwordGenerator());control=false; }
                case 7-> exit(0);
                default->win.print("Invalid input");
            }
        }








    }
}
