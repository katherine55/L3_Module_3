import interfaces.SpecialString;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	public String funkifyText(String x) {

		String newText = "";

		for (int i = x.length() - 1; i >= 0; i--) {
			newText += x.substring(i, i + 1);
		}
		return newText;
	}

}
