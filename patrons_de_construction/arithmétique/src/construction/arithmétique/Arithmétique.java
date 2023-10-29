package construction.arithmétique;

public class Arithmétique {

	private static Arithmétique instance = null;
	// D'autres attributs, classiques et non "static".
	
	private int x;
	private int y;
	private String nom;
	
	// Constructeur de l'objet.
	
	private Arithmétique(){ // La présence d'un constructeur privé supprime le constructeur public par défaut.
		super();
	}
	
	private Arithmétique(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	private Arithmétique(int x, int y, String nom) {
			
			this.x = x;
			this.y = y;
			this.nom = nom;
		}
	
	// Méthode renvoyant une instance de la classe Singleton
	public static Arithmétique getInstance() {

		if (instance == null) {
			instance = new Arithmétique();
		}
		return instance;	
	}
	
	public static Arithmétique getInstance(int x, int y) {
		if (instance == null){
			instance = new Arithmétique(x, y);
		}
		return instance;
	}
	
	public static Arithmétique getInstance(int x, int y, String nom) {
		if (instance == null){
			instance = new Arithmétique(x, y, nom);
		}
		return instance;
	}


	//D'autres méthodes classiques et non "static".
	
	public int somme(int x, int y){
		return x + y;
	}
	
	public int soustract(int x, int y){
		return x - y;
	}
	
	public int multiplication(int x, int y){
		return x * y;
	}
	
	public float moyenne(int x, int y) {
	
		return somme(x, y)/2;
	
	}
	
	public void affiche() {
	
		System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y + " et mon nom est: " + this.nom);
	
	}
	// redefinir la méthode clone pour empêcher son utilisation
	
	@Override
	
	public Object clone() throws CloneNotSupportedException {
	
		throw new CloneNotSupportedException();
	
	}
	
}
