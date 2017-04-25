class Cake {
	final private String HUEVO = "eggs";
	final private String HARINA = "flour";
	final private String AGUA = "water";
	final private String MIEL = "honey";
	int tiempo;
	int temperatura;
	
	//default constructor
	Cake() {
		tiempo = 0;
		temperatura = 0;
	}

	// parametrized constructor
	Cake(int t1, int temp1) {
		tiempo = t1;
		temperatura = temp1;
	}

	//getter methods for ingredients
	String getHuevo() {
		return HUEVO;
	}
	String getHarina() {
		return HARINA;
	}
	String getAgua() {
		return AGUA;
	}
	String getMiel() {
		return MIEL;
	}

	public String mix() {
		String m1 = "Mix the " + HUEVO + ", " + HARINA + ", " 
							+ AGUA + " and " + MIEL + " into a batter.";
		return m1;
	}

	public String bake() {
		String b1 = "Pour the batter into the pan and bake for " + tiempo + " minutes at " 
							+ temperatura + " degrees Fahrenheit.";
		return b1;
	}
}

//subclass of Cake
class ChocoCake extends Cake{
	String cacao;

	// default constructor
	ChocoCake() {
		super();
		cacao = "chocolate";
	}

	// parametrized constructor
	ChocoCake(int t2, int temp2) {
		super(t2, temp2);
		cacao = "chocolate";
	}

	public String mix(String choco) {
		String m2 = "Mix the " + getHuevo() + ", " + getHarina() + ", " 
							+ getAgua() + ", " + getMiel() + " and " + choco + " into a batter.";
		return m2;
	}

	public String bake() {
		String b2 = "Pour the batter into the pan and bake for " + tiempo + " minutes at " 
							+ temperatura + " degrees Fahrenheit.";
		return b2;
	}
}

//another subclass of Cake
class CrumbCake extends Cake{
	String canela;
	String cafe;

	// default constructor 
	CrumbCake() {
		super();
		canela = "cinnamon";
		cafe = "coffee";
	}

	// parametrized constructor
	CrumbCake(int t3, int temp3) {
		super(t3, temp3);
		canela = "cinnamon";
		cafe = "coffee";
	}

	public String mix(String crumb) {
		String m3 = "Mix the " + getHuevo() + ", " + getHarina() + ", " 
							+ getAgua() + ", " + getMiel() + " and " + crumb + " into a batter.";
		return m3;
	}

	public String bake() {
		String b3 = "Pour the batter into the pan and bake for " + tiempo + " minutes at " 
							+ temperatura + " degrees Fahrenheit.";
		return b3;
	}
}

class Main {
	public static void main(String args[]) {
		//Object made with default constructor
		Cake pastel = new Cake();
		System.out.println("Base ingredients: ");
		System.out.println(pastel.getHuevo());
		System.out.println(pastel.getHarina());
		System.out.println(pastel.getAgua());
		System.out.println(pastel.getMiel());
		System.out.println(pastel.tiempo);
		System.out.println(pastel.temperatura);
		System.out.println(pastel.mix());
		System.out.println(pastel.bake());

		System.out.println();
		
		//Object made from parameterized constructor
		Cake pastel2 = new Cake(30, 350);
		System.out.println("Cake recipe: ");
		System.out.println(pastel2.tiempo);
		System.out.println(pastel2.temperatura);
		System.out.println(pastel2.mix());
		System.out.println(pastel2.bake());

		System.out.println();
		
		//Object made from default constructor
		ChocoCake cocoPastel = new ChocoCake();
		System.out.println("Chocolate Cake recipe: ");
		System.out.println(cocoPastel.getHuevo());
		System.out.println(cocoPastel.getHarina());
		System.out.println(cocoPastel.getAgua());
		System.out.println(cocoPastel.getMiel());
		System.out.println(cocoPastel.cacao);

		System.out.println();

		//Object made from parameterized constructor
		ChocoCake cocoPastel2 = new ChocoCake(35, 350);
		System.out.println(cocoPastel2.mix());
		System.out.println(cocoPastel2.bake());

		System.out.println();

		//Object made from default constructor
		CrumbCake migajaPastel = new CrumbCake();
		System.out.println("Crumb Cake recipe: ");
		System.out.println(migajaPastel.getHuevo());
		System.out.println(migajaPastel.getHarina());
		System.out.println(migajaPastel.getAgua());
		System.out.println(migajaPastel.getMiel());	
		System.out.println(migajaPastel.canela);
		System.out.println(migajaPastel.cafe);		

		System.out.println();

		//Object made from parameterized constructor
		CrumbCake migajaPastel2 = new CrumbCake(32, 350);
		System.out.println(migajaPastel2.mix());
		System.out.println(migajaPastel2.bake());


	}
}