import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    String name;
    String[] numPhone;

    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        Scanner scanner = new Scanner(System.in, "Cp866");
        while (count<5) {                        
            System.out.println("input name");
            String name = scanner.nextLine();
            System.out.println("input phone number");
            String numPhone = scanner.nextLine();
            if (phoneBook.containsKey(name)){
                list = phoneBook.get(name);
                if(!phoneBook.containsKey(numPhone)){
                    list.add(numPhone);
                }
            }else{
            list = new ArrayList<>();
            list.add(numPhone);
            phoneBook.put(name, list);          
            }
            count++;            
        }
        scanner.close();
        printBook(phoneBook);
    }
    public static void printBook(Map<String, ArrayList<String>> list){        
        for (String key : list.keySet()) {
            ArrayList<String> value = list.get(key);      
            System.out.println("Name: " + key + " Phone numbers: " + value);
        }
    }        
}
