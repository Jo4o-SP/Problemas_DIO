import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        leitor.nextLine(); 

        for (int i = 0; i < n; i++) {
            String nome = leitor.next();
            int valor = leitor.nextInt(); 

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        leitor.close();
    }
}