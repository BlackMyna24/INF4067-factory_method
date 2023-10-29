package construction.abstractFactory;

public class Produit_factory2 implements IProduit_factory {

	public ProduitA getProduitA() {
		return new ProduitA2();
	}
			
	public ProduitB getProduitB() {
		return new ProduitB2();
	}
	
}
