import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner toRead = new Scanner(System.in);
    String word = toRead.nextLine();
    int count = 0;

    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == ' ') {
            System.out.println("count is " + count);
            count = 0;
        } else {
            count++;
        }
    }
    System.out.println("count is " + count);}


}