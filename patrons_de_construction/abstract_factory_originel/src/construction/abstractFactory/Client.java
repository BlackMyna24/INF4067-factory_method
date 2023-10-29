package construction.abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IProduit_factory produitFactory1 = new Produit_factory1();
		IProduit_factory produitFactory2 = new Produit_factory2();
		
		ProduitA produitA = null;
		ProduitB produitB = null;
		
		System.out.println("Utilisation de la premiere fabrique");
		produitA = produitFactory1.getProduitA();
		produitB = produitFactory1.getProduitB();
		produitA.methodeA();
		produitB.methodeB();
		
		System.out.println("Utilisation de la seconde fabrique");
		produitA = produitFactory2.getProduitA();
		produitB = produitFactory2.getProduitB();
		produitA.methodeA();
		produitB.methodeB();
		
	}

}
