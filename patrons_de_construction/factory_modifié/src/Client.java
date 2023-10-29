
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Considérons 03 types de produits de 03 familles différentes.");
		
		Produit_factory produitFactory1 = new Produit_factory1();
		Produit_factory produitFactory2 = new Produit_factory2();
		Produit_factory produitFactory3 = new Produit_factory3();
		
		ProduitA produitA = null;
		
		System.out.println("Utilisation de la première fabrique: ");
		produitA = produitFactory1.getProduitA();
		produitA.methodeA();
		
		System.out.println("Utilisation de la deuxième fabrique: ");
		produitA = produitFactory2.getProduitA();
		produitA.methodeA();
		
		System.out.println("Utilisation de la troisième fabrique: ");
		produitA = produitFactory3.getProduitA();
		produitA.methodeA();
	}

}
