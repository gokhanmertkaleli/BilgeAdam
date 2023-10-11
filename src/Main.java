public class Main {

	public static void main(String[] args) {
		MuhabbetKusu mKusu =new MuhabbetKusu();
		Balik jBalık =new JaponBalıgı();
		Balik pirana = new Pirana();
		mKusu.barinma();
		mKusu.beslenme();
		mKusu.boşaltım();
		mKusu.uçma();
		mKusu.solunum();
		System.out.println("--------------------------------");
		jBalık.barinma();
		jBalık.beslenme();
		jBalık.boşaltım();
		jBalık.yüzme();
		jBalık.solunum();
		System.out.println("--------------------------------");
		pirana.barinma();
		pirana.beslenme();
		pirana.boşaltım();
		pirana.yüzme();
		pirana.solunum();
}
}