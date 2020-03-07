package ilkOdev;

import java.util.Random;
import java.util.Scanner;

public class IlkHafta {
	
	public static void girisKontrolu() {
		
		Scanner kul= new Scanner(System.in);
		System.out.println("Kullan�c� girisi i�in �ifre giriniz ...");
		String kullaniciSifre=kul.next();
		
		String kontrol="5555";
		if(kullaniciSifre==kontrol) {
			System.out.println("Giri� Ba�ar�l�d�r...");
			
		}else 
			System.out.println("Giri� Ba�ar�s�z...");
		
		
	}
	
	public static void temelIslemler() {
		Scanner kul= new Scanner(System.in);
	
		
		System.out.println("1  Toplama ��lemi ");
		System.out.println("2  ��karna ��lemi");
		System.out.println("3  �arpma  ��lemi ");
		System.out.println("4  B�lme   ��lemi");
		
		System.out.println("Yap�lacak i�lemi seciniz .....");
		int islem;	
		islem=kul.nextInt();
			
		
		System.out.println("��lemler i�in   birinci sayii giriniz giriniz ...");
		int birinciSayi=kul.nextInt();
		System.out.println("��lemler i�in   ikinci sayii giriniz giriniz ...");
		int ikinciSayi=kul.nextInt();
		int sonuc;
	
		switch(islem) {
		
		case 1:
			System.out.println("Toplama Yap�l�yor");
			sonuc =birinciSayi+ikinciSayi;
			
			System.out.println("��lem Sonucu = " +sonuc);
			
			break;
			
		case 2:
			System.out.println("C�karma  Yap�l�yor");
			sonuc =birinciSayi-ikinciSayi;
			System.out.println("��lem Sonucu = " +sonuc);
			break;
			
		case 3:
			System.out.println("�arpma   Yap�l�yor");
			sonuc =birinciSayi*ikinciSayi;
			System.out.println("��lem Sonucu = " +sonuc);
			break;
		
		case 4 :
			System.out.println("B�lme   Yap�l�yor");
			sonuc =birinciSayi/ikinciSayi;
			System.out.println("��lem Sonucu = " +sonuc);
			break;

			default :
				System.out.println("se�iminiz Listede yok ....");
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
		
		System.out.println("T�m SAyilar�n Ortalamas� = " +ortalama);
		
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
		            System.out.print(sayilar[i]+"Say� �ift Say�d�r");
		             
		        }
		        else {
		        System.out.print(sayilar[i]+"Say� Tek Say�d�r");
		        }
				
				
				
		}
	
	}
	
	
	public static  void printPDFDocument(String body) {

		System.out.println("PDf Yazd�rd�g�n�z yazi "+body);
	}
	public static void printWordDocument(String body) {
		System.out.println("Word Yazd�rd�g�n�z yazi "+body);
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
		System.out.println("�dev 1 ");
		System.out.println("�dev 2");
		System.out.println("�dev 3 ");
		System.out.println("�Dev 4");
		System.out.println("�dev 5 ");
		System.out.println("�Dev 6");
		System.out.println("�k�� ��in 0");
		
		System.out.println("Yap�lacak i�lemi seciniz .....");
		int islem;	
		islem=kul.nextInt();
				
		switch(islem) {
		
		case 0:
			b = true;
			System.out.println("�k�� Yap�ld�");
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
			String wordKelime="Word B�lent Yilmaz";
			String pdfKelime="Pdf B�lent Yilmaz";
			
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
				System.out.println("se�iminiz Listede yok ....");
				}
		}	
		
			
	}
	

}