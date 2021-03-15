
public class Adatok {

	public static void main(String[] args) {
		Konyv book1 = new Konyv();
		
		book1.setAr(1500);
		book1.setCim("The Book");
		book1.setEv(2020);
		book1.setSzerzo("Leonardo DiCaprio");
		System.out.println(book1.toString());
		book1.incPrice(50);
		System.out.println(book1.toString());

	}

}
