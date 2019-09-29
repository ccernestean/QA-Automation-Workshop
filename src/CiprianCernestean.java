import java.nio.charset.StandardCharsets;
import java.util.*;

public class CiprianCernestean {
    public static void main(){
        Week1();
        Week2();
    }

    public static void Week1(){
        System.out.println("Hello Wolrd!");
        for (int i = 0; i <20; i++){
            System.out.print("-");
        }
        System.out.println("");

        //4
        Random random1 = new Random();
        System.out.println("Random values: ");
        //Random boolean
        boolean rbol1 = random1.nextBoolean();
        System.out.println("  Boolean: " + rbol1);

        //Random char
        char rchar1 = (char)(random1.nextInt(26) + 'a');
        System.out.println("  Char: " + rchar1);

        //Random int
        int rint1 = random1.nextInt();
        System.out.println("  Int: " + rint1);

        //Random long
        long lint1 = random1.nextLong();
        System.out.println("  Long: " + lint1);

        //Random double
        double rdouble1 = random1.nextDouble();
        System.out.println("  Double: " + rdouble1);

        //Random string
        byte [] rarray1 = new byte[10];  //string length
        random1.nextBytes(rarray1);
        String rstring1 = new String(rarray1, StandardCharsets.US_ASCII);
        System.out.println("  String: " + rstring1);

        //Random array
        byte [] rarray2 = new byte[10]; //array length
        random1 .nextBytes(rarray2);
        System.out.println("  Array: " + rarray2);

        for (int i = 0; i <20; i++){
            System.out.print("-");
        }
        System.out.println("");

        //5
        int int1 = random1.nextInt(101);
        int int2 = random1.nextInt(101);
        int int3 = random1.nextInt(101);
        int int4 = random1.nextInt(101);
        System.out.println("Variables: "+ int1 + "," + int2 + "," + int3 + "," + int4);

        // Unary operations
        ++int1;
        int2++;
        --int3;
        int4--;
        System.out.println("  After unary operations: "+ int1 + "," + int2 + "," + int3 + "," + int4);

        //Random arithmetic
        String operators = "-+/*-+/*-+/*-+/*";
        for (int i = 0; i < 4; i++){
            int index1 = random1.nextInt(operators.length());
            char operation = operators.charAt(index1);
            System.out.print("  Operation that will be used:" + operation);
            System.out.print(" Equation:" + int1 + " " + operation + " " + int2);
            int int9 = 0;
            switch (operation){
                case '+':
                    int9 = int1 + int2;
                    break;
                case '-':
                    int9 = int3 - int4;
                    break;
                case '*':
                    int9 = int4 * int1;
                    break;
                case '/':
                    int9 = int3 / int2;
                    break;
            }
            System.out.println(" Result:" + int9);
        }

        if (int1 > int2){
            System.out.println("  Value of " + int1 + " is larger than vale of " + int2);
        } else if (int2 > int1){
            System.out.println("  Value of " + int2 + " is larger than vale of " + int1);
        } else {
            System.out.println("  Value of " + int1 + " is equal to the vale of " + int2);
        }

        for (int i = 0; i <20; i++){
            System.out.print("-");
        }
        System.out.println("");

        //6
        int a = random1.nextInt();
        int b = random1.nextInt();
        if ( a > b){
            System.out.println("Value of " + a + " is larger than vale of " + b);
        } else if (a == b){
            System.out.println("Value of " + a + " is equal to the vale of " + b);
        } else {
            System.out.println("Value of " + b + " is larger than vale of " + a);
        }

        //7
        int[] array1 = new int[10];
        for (int i = 1; i < 10; i++){
            Random random2 = new Random();
            array1[i] = random2.nextInt(101);
            array1[0] = 15;
        }

        var arrayleng1 = array1.length;
        for (int i = 0; i <20; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("Array:");
        for (int i = 0; i < arrayleng1; i++){
            if (array1[i] != 15){
                System.out.println(array1[i]);
            }
        }
    }
    public static void Week2(){
        //1
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = scan1.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the second string:");
        String s2 = scan2.nextLine();

        System.out.println("Fisrt string: " + s1);
        System.out.println("Second string: " + s2);

        if (s1.length() == s2.length()) {
            System.out.println("String are equal in length! ");
            int compare1 = s1.compareTo(s2);
            if (0 == compare1) {
                System.out.println("Strings are identical!");
            } else {
                System.out.println("Strings are not identical!");
            }
        } else {
            System.out.println("Strings are not equal in length!");
        }

        String s3 = s1.concat(s2);
        System.out.println("Concatendated: " + s3);

        //2
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Palindrome check, enter string:");
        String s4 = scan3.nextLine();
        String[] div1 = s4.split(" ");
        String s5 = div1[0];
        String revs1 = "";
        for (int i = s5.length() - 1; i >= 0; i--) {
            revs1 = revs1 + s5.charAt(i);
        }
        if (s5.equals(revs1)) {
            System.out.println("The word " + s5 + " is a palindrome!");
            boolean ispalindrome = true;
        } else {
            System.out.println("The string is not a palindrome!");
        }
        for (int i = 0; i <= 20; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        //3
        String emptystring0 = "";
        int itemnr = 0;
        String[] emptyarray0 = new String[10];
        ArrayList<String> stringlist0 = new ArrayList<>();
        int leftlimit0 = 65; // A
        int rightlimit0 = 122; // z
        int stringlength = 10;  //string length
        int listlength = 10;  //list length

        for (int i = 0; i < listlength; i++) {
            Random random0 = new Random();
            //stringlength = random0.nextInt(10);
            StringBuilder buffer = new StringBuilder(stringlength);
            for (int j = 0; j < stringlength; j++) {
                int randomint0 = leftlimit0 + (int) (random0.nextFloat() * (rightlimit0 - leftlimit0 + 1));
                if (randomint0 >= 91 && randomint0 <= 96){
                    j = j - 1;
                } else {
                    buffer.append((char) randomint0);
                }
            }
            String generatedString = buffer.toString();
            stringlist0.add(generatedString);
        }
        for (int k = 0; k <stringlist0.size(); k++){
            //System.out.println(stringlist0.get(k));
            if((stringlist0.get(k).charAt(0) == 'a') ||
                    (stringlist0.get(k).charAt(0) == 'e') ||
                    (stringlist0.get(k).charAt(0) == 'i') ||
                    (stringlist0.get(k).charAt(0) == 'o') ||
                    (stringlist0.get(k).charAt(0) == 'u') ||
                    (stringlist0.get(k).charAt(0) == 'A') ||
                    (stringlist0.get(k).charAt(0) == 'E') ||
                    (stringlist0.get(k).charAt(0) == 'I') ||
                    (stringlist0.get(k).charAt(0) == 'O') ||
                    (stringlist0.get(k).charAt(0) == 'U')){
                emptystring0 = emptystring0.concat(stringlist0.get(k).toLowerCase() + ",");
            } else {
                emptyarray0[itemnr] = stringlist0.get(k).toUpperCase();
                itemnr++;
            }
        }

        System.out.print("Generated strings: ");
        System.out.println(stringlist0);
        System.out.print("With vowels: ");
        System.out.println(emptystring0);
        System.out.print("With consonants: ");
        System.out.println(Arrays.toString(emptyarray0));

        for (int l =0; l < stringlist0.size(); l++){
            if ((stringlist0.get(l).contains("x")) || (stringlist0.get(l).contains("X"))){
                System.out.print("String: " + stringlist0.get(l));
                stringlist0.set(l, "skipped");
                System.out.println(" replaced with: " + stringlist0.get(l));
            } else if (stringlist0.get(l).length() < 3){
                System.out.print("String: " + stringlist0.get(l));
                stringlist0.set(l, "skipped");
                System.out.println(" replaced with: " + stringlist0.get(l));
            }
        }

        System.out.print("Corrected string: ");
        System.out.println(stringlist0);

        for (int i = 0; i <= 20; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        //4
        HashMap<String,String> map0=new HashMap<String,String>();
        map0.put("Andrew","realandrew@something.nz");
        map0.put("Mary","official_mary@otherthing.ca");
        map0.put("Josh","joshboss@anything.uk");
        map0.put("Lucy","lucylicicous@somethinglicious.com");

        System.out.println("Initial list:");
        for(Map.Entry m:map0.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("The map size is: " + map0.size());

        if (map0.containsKey("Mary")){
            System.out.println("Mary is on the list");
        } else {
            System.out.println("Mary is not in the list");
        }

        if (map0.containsKey("Josh")){
            System.out.println("Josh's email adress: " + map0.get("Josh"));
        } else {
            System.out.println("Josh has no email address");
        }
        map0.remove("Lucy");

        System.out.println("Sorted:");
        TreeMap<String, String> sort0 = new TreeMap<>();
        sort0.putAll(map0);
        for (Map.Entry<String, String> entry : sort0.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " ,Email: " + entry.getValue());
        }
    }
}
