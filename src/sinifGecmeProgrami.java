import java.util.Scanner;

public class sinifGecmeProgrami {

	public static void main(String[] args) {
		/* eğer girilen ders notları 0 veya 100 arasında değil ise 
		ortalamaya katılmasın.*/
		
		int Matematik, Fizik, Türkçe, Kimya, Müzik;
		double ortalama = 0;
		int sayac =0 ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Matematik notunuzu giriniz : " );
		Matematik= scan.nextInt();
		if (Matematik >=55 && Matematik <=100) {
			System.out.println("Tebrikler geçtiniz");
			
		}else if (Matematik<55 && Matematik >0 ) {
			System.out.println("Dersten Kaldınız..! ");
			
		} else {
			System.out.println("0-100 aralığında not girmediğiniz için notunuz ortalamaya dahil edilmeyecektir.");
			
		}
			
		System.out.println("Lütfen Fizik notunuzu giriniz : " );
		Fizik= scan.nextInt();
		
		if (Fizik >=55 && Fizik <=100) {
			System.out.println("Tebrikler geçtiniz");
		}else if (Fizik<55 && Fizik >0 ) {
			System.out.println("Dersten Kaldınız..! ");
			
		}else {
			System.out.println("0-100 aralığında not girmediğiniz için notunuz ortalamaya dahil edilmeyecektir.");
		}
		System.out.println("Lütfen Türkçe notunuzu giriniz : " );
		Türkçe= scan.nextInt();
		
		if (Türkçe >=55 && Türkçe <=100) {
			System.out.println("Tebrikler geçtiniz");
		}else if (Türkçe<55 && Türkçe >0 ) {
			System.out.println("Dersten Kaldınız..! ");
			
		}else {
			System.out.println("0-100 aralığında not girmediğiniz için notunuz ortalamaya dahil edilmeyecektir.");
		}
		System.out.println("Lütfen Kimya notunuzu giriniz : " );
		Kimya= scan.nextInt();
		
		if (Kimya >=55 && Kimya <=100) {
			System.out.println("Tebrikler geçtiniz");
		}else if (Kimya<55 && Kimya >0 ) {
			System.out.println("Dersten Kaldınız..! ");
			
		}else {
			System.out.println("0-100 aralığında not girmediğiniz için notunuz ortalamaya dahil edilmeyecektir.");
		}
		System.out.println("Lütfen Müzik notunuzu giriniz : " );
		Müzik= scan.nextInt();
		
		if (Müzik >=55 && Müzik <=100) {
			System.out.println("Tebrikler geçtiniz");
		}else if (Müzik<55 && Müzik >0 ) {
			System.out.println("Dersten Kaldınız..! ");
			
		}else {
			System.out.println("0-100 aralığında not girmediğiniz için notunuz ortalamaya dahil edilmeyecektir.");
		}
		
		ortalama = ((Matematik+Fizik+Türkçe+Kimya+Müzik) /5);
		System.out.println("Ortalamınız : " + ortalama );
		
		if (ortalama >=55 ) {
			System.out.println("Tebrikler Sınıfı Geçtiniz ");
		}else {
			System.out.println("maalesef sınıfta kaldınız ");
		}
	}

}
