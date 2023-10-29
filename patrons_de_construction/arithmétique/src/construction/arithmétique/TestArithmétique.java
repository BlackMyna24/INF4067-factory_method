package construction.arithmétique;

public class TestArithmétique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int som = Arithmétique.getInstance().somme(2, 5);
		System.out.printf("La somme est %d \n",som);
		
		int fois = Arithmétique.getInstance().multiplication(7, 9);
		System.out.printf("\nLa multiplication donne %d \n",fois);
		
		Arithmétique s1 = Arithmétique.getInstance(8, 3);
		s1.affiche();
		
		Arithmétique s2 = Arithmétique.getInstance(5, 9);
		s2.affiche();
		
		Arithmétique s3 = Arithmétique.getInstance(som, fois, "oui");
		s3.affiche();
		}

}
