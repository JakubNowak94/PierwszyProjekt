import java.util.Scanner;

public class PierwszyProjekt {
	public static void obliczajZPliku(){
		System.out.println("Wybrales plik");
	}
	
	public static void obliczajZKonsoli(){
		String dzialanie = "/0";
		System.out.println("Podawaj kolejno dzialania potwierdzajac je klawiszem ENTER, aby zakonczyc obliczanie wpisz zamiast dzialania 'Koniec'");
		while(dzialanie!="koniec"){
			Scanner odczyt = new Scanner(System.in);
			dzialanie = odczyt.nextLine();
			
			Obliczanie obliczanie = new Obliczanie();
			String[] rozdzielony_string = obliczanie.rozdzielStringa(dzialanie);
		}
	}
	public static void main(String[] args) {
		int wybor;
		
		System.out.println("Wybierz interesuj¹c¹ Cie2 opcje:");
		System.out.println("1 - Oblicznie z konsoli");
		System.out.println("2 - Oblicznie z pliku");
		System.out.print("Wybierz opcjê podajac liczbe: ");
		
		Scanner odczyt = new Scanner(System.in);
		wybor = odczyt.nextInt();
		
		switch (wybor) {
		case 1:
			obliczajZKonsoli();
			break;
			
		case 2:
			obliczajZPliku();
			break;
			
		default:
			break;
		}
	}
}
