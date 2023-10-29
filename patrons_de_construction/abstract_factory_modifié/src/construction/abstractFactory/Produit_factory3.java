package construction.abstractFactory;

public class Produit_factory3 implements IProduit_factory{

	public ProduitA getProduitA() {
		return new ProduitA3();
	}
		
	public ProduitB getProduitB() {
		return new ProduitB3();
	}


}