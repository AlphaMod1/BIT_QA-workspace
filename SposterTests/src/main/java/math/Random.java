package math;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

	public String rString(int len, boolean hasInts) {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		String AlphaBeticString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(len);

		if(hasInts) {
			for (int i = 0; i < len; i++) {
				int index = (int) (AlphaNumericString.length() * Math.random());
				sb.append(AlphaNumericString.charAt(index));
			}
		}
		else {
			for (int i = 0; i < len; i++) {
				int index = (int) (AlphaBeticString.length() * Math.random());
				sb.append(AlphaBeticString.charAt(index));
			}
		}

		return sb.toString();

	}
	
	public String rIntString(int min, int max){
		int rnd = ThreadLocalRandom.current().nextInt(min, max + 1);
		StringBuilder sb = new StringBuilder();
		sb.append("");
		sb.append(rnd);
		return sb.toString();
	}
	
	public int rInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

}
