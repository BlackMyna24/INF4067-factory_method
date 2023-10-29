
public abstract class Produit_factory {

	public ProduitA getProduitA() {
		return createProduitA();
	}
	
	protected abstract ProduitA createProduitA();
	
}
