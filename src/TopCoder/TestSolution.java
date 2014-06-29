package TopCoder;

public class TestSolution {
	public static void main(String[] args) {
		WritingWords w = new WritingWords();
		System.out.println(w.write("A"));
		System.out.println(w.write("ABC"));
		System.out.println(w.write("VAMOSGIMNASIA"));
		System.out.println(w.write("TOPCODER"));
		System.out.println(w.write("SINGLEROUNDMATCH"));
		System.out.println(w.write("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ"));
		System.out.println(w.write(null));
		System.out.println(w.write(""));
		System.out.println(w.write("JAVAPROBSISTHEBESTONLINEJAVATUTORIAL"));
	}
}
