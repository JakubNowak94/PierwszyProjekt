
public class Obliczanie {
	public static String[] rozdzielStringa(String dzialanie){
		String[] rozdzielenie = dzialanie.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)|(?<=\\*)|(?=\\*)|(?<=\\/)|(?=\\/)|");
		for (String string : rozdzielenie) {
			System.out.println(string);
		}
		return rozdzielenie;
	}
}
