package EndortechPasswordGenerator;

public class Generator {
    private static final String[] lowerCase = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static final String[] upperCase ={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static final String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] symbols = {"!","@","#","$","%","&","*","(",")","_","+","-","=","[","]","|",".","/","?",">","<"};
    private boolean useLowerCase = true;
    private boolean useUpperCase = true;
    private boolean useDigits = false;
    private boolean useSymbols = false;
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setUseLowerCase() {
        this.useLowerCase = !useLowerCase;
    }

    public void setUseUpperCase() {
        this.useUpperCase = !useUpperCase;
    }

    public void setUseDigits( ) {
        this.useDigits = !useDigits;
    }

    public void setUseSymbols() {
        this.useSymbols = !useSymbols;
    }

    public boolean isUseLowerCase() {
        return useLowerCase;
    }

    public boolean isUseUpperCase() {
        return useUpperCase;
    }

    public boolean isUseDigits() {
        return useDigits;
    }

    public boolean isUseSymbols() {
        return useSymbols;
    }

    public int randomInt(int length) {
        return (int)(Math.random()*length)+1;
    }

    public String[] randomOption() {
        while (true) {
            int index = randomInt(4);
            switch (index) {
                case 1 -> {
                    if (useLowerCase) {
                        return lowerCase;
                    }
                }
                case 2 -> {
                    if (useUpperCase) {
                        return upperCase;
                    }
                }
                case 3 -> {
                    if (useDigits) {
                        return digits;
                    }
                }
                case 4 -> {
                    if (useSymbols) {
                        return symbols;
                    }
                }
            }
        }
    }


    public String passwordGenerator(){
        if(length<=0){
            return"";
        }
        StringBuilder password = new StringBuilder(length);
        for(int i=0;i<length;i++){
            String[] option =randomOption();
            password.append(option[randomInt(option.length-1)]);

        }
        return new String (password);
    }





}
