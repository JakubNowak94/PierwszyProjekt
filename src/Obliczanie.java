
public class Obliczanie {
	public static int obliczDzialanie(String[] dzialanie){
		int wynik = 0;
		int rozmiar_stringa = dzialanie.length;
		
		while (rozmiar_stringa!=1){
			String [] pomocniczy_string = dzialanie;
			for(int i = 0, j = 0; i < dzialanie.length; i++, j++){
				pomocniczy_string[j] = dzialanie[i];
				if(dzialanie[i].equals("*")){
					int liczba1 = Integer.parseInt(pomocniczy_string[j-1]);
					int liczba2 = Integer.parseInt(dzialanie[i+1]);
					int wynik_miejscowy1 = liczba1*liczba2;
					pomocniczy_string[j-1] = String.valueOf(wynik_miejscowy1);
					i++;
					j--;
					rozmiar_stringa = rozmiar_stringa-2;
				}
				if(dzialanie[i].equals("/")){
					int liczba1 = Integer.parseInt(pomocniczy_string[j-1]);
					int liczba2 = Integer.parseInt(dzialanie[i+1]);
					int wynik_miejscowy2 = liczba1/liczba2;
					pomocniczy_string[j-1] = String.valueOf(wynik_miejscowy2);
					i++;
					j--;
					rozmiar_stringa = rozmiar_stringa-2;
				}
			}
			
			String [] dzialanie2 = new String[rozmiar_stringa];
			for(int i = 0; i < rozmiar_stringa; i++){
				dzialanie2[i] = pomocniczy_string[i];
				
			}
			
			String [] pomocniczy_string2 = dzialanie2;
			for(int i = 0, j = 0; i < dzialanie2.length; i++, j++){
				pomocniczy_string2[j] = dzialanie2[i];
				if(dzialanie2[i].equals("+")){
					int liczba1 = Integer.parseInt(pomocniczy_string2[j-1]);
					int liczba2 = Integer.parseInt(dzialanie2[i+1]);
					int wynik_miejscowy3 = liczba1+liczba2;
					pomocniczy_string2[j-1] = String.valueOf(wynik_miejscowy3);
					i++;
					j--;
					rozmiar_stringa = rozmiar_stringa-2;
				}
				if(dzialanie2[i].equals("-")){
					int liczba1 = Integer.parseInt(pomocniczy_string2[j-1]);
					int liczba2 = Integer.parseInt(dzialanie2[i+1]);
					int wynik_miejscowy4 = liczba1-liczba2;
					pomocniczy_string2[j-1] = String.valueOf(wynik_miejscowy4);
					i++;
					j--;
					rozmiar_stringa = rozmiar_stringa-2;
				}
			}
			String [] dzialanie3 = new String[rozmiar_stringa];
			for(int i = 0; i < rozmiar_stringa; i++){
				dzialanie3[i] = pomocniczy_string2[i];
			}
			wynik = Integer.parseInt(dzialanie3[0]);
		}
		return wynik;
	}
	
	public static String[] rozdzielStringa(String dzialanie){
	//	String[] rozdzielenie = dzialanie.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)|(?<=\\*)|(?=\\*)|(?<=\\/)|(?=\\/)|");
		String[] rozdzielenie = dzialanie.split("(?=\\+)|(?<=\\+)|(?=\\-)|(?<=\\-)|(?=\\*)|(?<=\\*)|(?=\\/)|(?<=\\/)");
		return rozdzielenie;
	}
}
