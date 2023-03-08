import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        char[] strArray = str.toCharArray();
        int i = 0;
        int j = strArray.length - 1;

        while (i < j) {
            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++;
            j--;
        }

        String reverteStr = new String(strArray);
        System.out.println("String invertida: " + reverteStr);
    }
}
