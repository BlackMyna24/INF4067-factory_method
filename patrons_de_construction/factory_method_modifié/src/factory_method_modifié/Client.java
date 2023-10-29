package factory_method_modifié;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produit_factory produitFactory = new Produit_factory();
		
		ProduitA produitA = null;
		
		produitA = produitFactory.getProduitA(Produit_factory.TYPE_PRODUITA1);
		produitA.methodeA();
		
		produitA = produitFactory.getProduitA(Produit_factory.TYPE_PRODUITA2);
		produitA.methodeA();
		
		produitA = produitFactory.getProduitA(Produit_factory.TYPE_PRODUITA3);
		produitA.methodeA();

		/*produitA = produitFactory.getProduitA(5);
		produitA.methodeA();*/
	}

}
