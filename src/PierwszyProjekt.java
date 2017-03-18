import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * G��wna klasa odpowiedzialna za komunikacj� z u�ytkownikiem
 * 
 * @author Jakub Nowak
 *
 */
public class PierwszyProjekt {
	/**
	 * Metoda odczytuj�ca dane z pliku i wy�wietlaj�ca je u�ytkownikowi
	 * 
	 * @throws IOException
	 */
	public static void obliczajZPliku() throws IOException {
		File plik = new File("dzialania.txt");
		Scanner odczyt = new Scanner(plik);
		String dzialanie = "0";
		while(true){
			dzialanie = odczyt.nextLine();
			if(dzialanie.equals("koniec")) break;
            
			Obliczanie obliczanie = new Obliczanie();
			String[] rozdzielony_string = obliczanie.rozdzielStringa(dzialanie);
			int wynik = obliczanie.obliczDzialanie(rozdzielony_string);
			System.out.println(dzialanie + "=" +wynik);
		}
		odczyt.close();
	}
	/**
	 *  Metoda pobieraj�ca dane od u�ytkownika i wy�wietlaj�ca je po przetworzeniu
	 */
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
	/**
	 * Metoda wy�wietlaj�ca menu u�ytkownikowi
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int wybor;
		
		System.out.println("Wybierz interesuj�c� Cie opcje:");
		System.out.println("1 - Oblicznie z konsoli");
		System.out.println("2 - Oblicznie z pliku");
		System.out.print("Wybierz opcj� podajac liczbe: ");
		
		Scanner odczyt = new Scanner(System.in);
		wybor = odczyt.nextInt();
		
		switch (wybor) {
		case 1:
			obliczajZKonsoli();
			System.out.println("Koniec pracy programu");
			break;
			
		case 2:
			try {
				obliczajZPliku();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Koniec pracy programu");
			break;
			
		default:
			break;
		}
	}
}
