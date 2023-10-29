package construction.abstractFactory;

public class Produit_factory1 implements IProduit_factory{

	public ProduitA getProduitA() {
		return new ProduitA1();
	}
		
	public ProduitB getProduitB() {
		return new ProduitB1();
	}
	
}
