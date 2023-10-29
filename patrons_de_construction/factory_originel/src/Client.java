
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produit_factory produitFactory1 = new Produit_factory1();
		Produit_factory produitFactory2 = new Produit_factory2();
		
		ProduitA produitA = null;
		
		System.out.println("Utilisation de la première fabrique: ");
		produitA = produitFactory1.getProduitA();
		produitA.methodeA();
		
		System.out.println("Utilisation de la deuxième fabrique: ");
		produitA = produitFactory2.getProduitA();
		produitA.methodeA();

	}

}
