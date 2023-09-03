package attlista1;

public class questao17 {
	public static void main(String[] args) {
        int A = 7, B = 5;

        if (A > 10 || A + B == 20) {
            System.out.println("número válido");
        } else if (A == B) {
            System.out.println("A é igual B");
        } else if (A != 10 && B != 10 && A < 10) {
            System.out.println("A é menor que 10");
        } else {
            System.out.println("número não válido");
        }
    }
}
