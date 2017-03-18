import java.util.Scanner;

public class PierwszyProjekt {
	public static void obliczajZPliku(){
		System.out.println("Wybrales plik");
	}
	
	public static void obliczajZKonsoli(){
		String dzialanie = "/0";
		System.out.println("Podawaj kolejno dzialania potwierdzajac je klawiszem ENTER, aby zakonczyc obliczanie wpisz zamiast dzialania 'Koniec'");
		while(true){
			Scanner odczyt = new Scanner(System.in);
			dzialanie = odczyt.nextLine();
			if(dzialanie.equals("koniec")) break;
			
			Obliczanie obliczanie = new Obliczanie();
			String[] rozdzielony_string = obliczanie.rozdzielStringa(dzialanie);
			int wynik = obliczanie.obliczDzialanie(rozdzielony_string);
			System.out.println(dzialanie + "=" +wynik);
		}
	}
	public static void main(String[] args) {
		int wybor;
		
		System.out.println("Wybierz interesuj¹c¹ Cie opcje:");
		System.out.println("1 - Oblicznie z konsoli");
		System.out.println("2 - Oblicznie z pliku");
		System.out.print("Wybierz opcjê podajac liczbe: ");
		
		Scanner odczyt = new Scanner(System.in);
		wybor = odczyt.nextInt();
		
		switch (wybor) {
		case 1:
			obliczajZKonsoli();
			System.out.println("Koniec pracy programu");
			break;
			
		case 2:
			obliczajZPliku();
			System.out.println("Koniec pracy programu");
			break;
			
		default:
			break;
		}
	}
}
