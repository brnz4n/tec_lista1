package attlista1;

public class questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 6;
		
		if((a>10) || ((a+b)==20)) {
			System.out.println("número válido");
		}
		else if(a==b) {
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		}
		else {
			System.out.println("numero nao valido");
		}
	}
}