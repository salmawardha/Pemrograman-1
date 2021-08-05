public class PelajarB {
    //attribut - data
   private String nama;
   private int no_ID;
   private String prodi;
   
   
   //constructor - untuk wujudkan objek baru
   Pelajar (String namaSaya, int idSaya, String prodiSaya) {  //new Pelajar("Norita", 1234,"IT");

        nama = namaSaya; no_ID = idSaya; prodi=prodiSaya;
   }


   //method - tindakan yang boleh dilakukan

   public void cetakNama () {
     System.out.println("Nama : "+ nama);
     
   public void getNoID () {
		return no_ID;
	}
	
	public void ubahProdi() {
		prodi = "EE"
	}

	public String getProdi() {
		return prodi;
	}
	
	

   }
}