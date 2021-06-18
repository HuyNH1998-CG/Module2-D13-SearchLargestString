import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) { // O(n)
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) { // O(n)
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear(); //O(1)
        }
        for (Character ch : max){ // O(1)
            System.out.println(ch);
        }
        System.out.println();
    }
}

// T(n) = (n*(n -1)) + (i + 1)
// T(n) = O(n^2) + O(n);
// T(n) = O(n^2);
// => O(n^2)