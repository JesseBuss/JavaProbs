package TopCoder;

public class WritingWords {
	public int write(String word) {
		if (word == null)
			return 0;
		int numTaps = 0;
		for (int i = 0; i < word.length(); i++) {
			int numToAdd = word.charAt(i) - 'A' + 1;
			numTaps += numToAdd;
		}
		return numTaps;
	}
}