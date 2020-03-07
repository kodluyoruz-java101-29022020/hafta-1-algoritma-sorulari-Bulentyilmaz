package ilkOdev;

import java.util.Random;
import java.util.Scanner;

public class IlkHafta {
	
	public static void girisKontrolu() {
		
		Scanner kul= new Scanner(System.in);
		System.out.println("Kullanýcý girisi için þifre giriniz ...");
		String kullaniciSifre=kul.next();
		
		String kontrol="5555";
		if(kullaniciSifre==kontrol) {
			System.out.println("Giriþ Baþarýlýdýr...");
			
		}else 
			System.out.println("Giriþ Baþarýsýz...");
		
		
	}
	
	public static void temelIslemler() {
		Scanner kul= new Scanner(System.in);
	
		
		System.out.println("1  Toplama Ýþlemi ");
		System.out.println("2  Çýkarna Ýþlemi");
		System.out.println("3  Çarpma  Ýþlemi ");
		System.out.println("4  Bölme   Ýþlemi");
		
		System.out.println("Yapýlacak iþlemi seciniz .....");
		int islem;	
		islem=kul.nextInt();
			
		
		System.out.println("Ýþlemler için   birinci sayii giriniz giriniz ...");
		int birinciSayi=kul.nextInt();
		System.out.println("Ýþlemler için   ikinci sayii giriniz giriniz ...");
		int ikinciSayi=kul.nextInt();
		int sonuc;
	
		switch(islem) {
		
		case 1:
			System.out.println("Toplama Yapýlýyor");
			sonuc =birinciSayi+ikinciSayi;
			
			System.out.println("Ýþlem Sonucu = " +sonuc);
			
			break;
			
		case 2:
			System.out.println("Cýkarma  Yapýlýyor");
			sonuc =birinciSayi-ikinciSayi;
			System.out.println("Ýþlem Sonucu = " +sonuc);
			break;
			
		case 3:
			System.out.println("Çarpma   Yapýlýyor");
			sonuc =birinciSayi*ikinciSayi;
			System.out.println("Ýþlem Sonucu = " +sonuc);
			break;
		
		case 4 :
			System.out.println("Bölme   Yapýlýyor");
			sonuc =birinciSayi/ikinciSayi;
			System.out.println("Ýþlem Sonucu = " +sonuc);
			break;

			default :
				System.out.println("seçiminiz Listede yok ....");
				}
				
	}
		
	public static void randomSayiOrtalamasi() {
		int dizi[] = new int[100];
		
	Random random=new Random();
	int toplamSayi=0;
	for (int i=0; i<100;i++) {
		dizi[i]=random.nextInt(100);
		toplamSayi=dizi[i]+toplamSayi;
	}
	double ortalama;
	
		
		ortalama=toplamSayi/dizi.length;
		
		System.out.println("Tüm SAyilarýn Ortalamasý = " +ortalama);
		
	}
	
	public static void goruntu(){
		
		for(int i=0; i<=10 ;i++) {
			
			for(int j =0;j<=i ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
		
	public static void tekCiftBulma() {
		Random r=new Random();
		int sayilar[] = null;
		for (int i=0; i<100;i++) {
			sayilar[i]=r.nextInt(100);
			
		}
	
		for (int i=0; i<sayilar.length;i++) {
			
			
				if (sayilar[i] %2==0) {
		            System.out.print(sayilar[i]+"Sayý Çift Sayýdýr");
		             
		        }
		        else {
		        System.out.print(sayilar[i]+"Sayý Tek Sayýdýr");
		        }
				
				
				
		}
	
	}
	
	
	public static  void printPDFDocument(String body) {

		System.out.println("PDf Yazdýrdýgýnýz yazi "+body);
	}
	public static void printWordDocument(String body) {
		System.out.println("Word Yazdýrdýgýnýz yazi "+body);
	}
	
	

	


	
	
	
	
	public static void main(String[] args) {
		Scanner kul = new Scanner(System.in);
		
		
		//----1. Soru -------------------------------------------------------------//
				
		// girisKontrolu();
		
		//---- 2.Soru ------------------------------------------------------------//
		

		// temelIslemler();
		
		//---- 3.Soru ------------------------------------------------------------//
		
		//randomSayiOrtalamasi();
		
		//---- 4.Soru ------------------------------------------------------------//
		
		//goruntu();
		
		//---- 5.Soru ------------------------------------------------------------//
		
		//tekCiftBulma();
		boolean b = false;
		
		while(!b) {
		System.out.println("Ödev 1 ");
		System.out.println("Ödev 2");
		System.out.println("Ödev 3 ");
		System.out.println("ÖDev 4");
		System.out.println("Ödev 5 ");
		System.out.println("ÖDev 6");
		System.out.println("Çkýþ Ýçin 0");
		
		System.out.println("Yapýlacak iþlemi seciniz .....");
		int islem;	
		islem=kul.nextInt();
				
		switch(islem) {
		
		case 0:
			b = true;
			System.out.println("Çkýþ Yapýldý");
			break;
		case 1:
			girisKontrolu();
			break;
			
		case 2:
			girisKontrolu();
			break;
			
		case 3:
			randomSayiOrtalamasi();
			break;
		
		case 4 :
			goruntu();
			break;

		case 5 :
			tekCiftBulma();
			break;
		
		case 6:
			String wordKelime="Word Bülent Yilmaz";
			String pdfKelime="Pdf Bülent Yilmaz";
			
			WordDocument word = new WordDocument();
			word.setBody(wordKelime);
			
			PDFDocument pdf = new PDFDocument();
			pdf.setBody(pdfKelime);
			
			String Wordkelime=word.getBody();
			String PdfKelime =pdf.getBody();
			printPDFDocument(Wordkelime);
			printWordDocument(Wordkelime);
			break;
		
		default :
				System.out.println("seçiminiz Listede yok ....");
				}
		}	
		
			
	}
	

}