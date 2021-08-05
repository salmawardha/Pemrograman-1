public class KuliahP1 {
	public static void main (String args []) {

	pelajar p1 = new Pelajar("Salma", 20537141005, "TI");
	p1.cetakNama();
	System.out.println(p1.getNoID());

	pelajar p2 = new Pelajar("Ali", 20537141001, "TI");
	p2.cetakNama();
	System.out.println(p2.getNoID());

	pelajar p3 = new Pelajar("Susan", 20537141007, "TI");
	p3.cetakNama();
	System.out.println(p3.getNoID());
	p3.ubahProdi();
	System.out.println(p3.getProdi());
	}
}