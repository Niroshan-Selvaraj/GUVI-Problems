public class ObtainSmallesttNumberProSet12{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		List<Integer> list1 = new ArrayList<Integer>();

		String numberStr = input.nextLine();
		int removeDigit = input.nextInt();

		String expr = formRegularExpressionString(numberStr, removeDigit);

		String splitBigAndSmall = findBigAndSmallPossibleNumber(numberStr,
				removeDigit);
		String start = splitBigAndSmall.split("-")[0];
		String end = splitBigAndSmall.split("-")[1];

		int startNum = Integer.parseInt(start);
		int endNum = Integer.parseInt(end);
		String pattern = "";

		//Finding smallest to highest number indexes like 01234,012345,035,124 etc..
		int len =  numberStr.length() - removeDigit;
		for (int i = startNum; i <= endNum; i++) {
			if ((i + "").length() <len) {
				pattern = "0" + i + "";
			} else
				pattern = i + "";

			if (pattern.matches(expr)) {

				list.add(pattern);

			}
		}
		
//form a string by joining indexes (like 01234 to 4321 if the actual string is 432156)
		String temp = "";
		for (String str : list) {
			temp = "";
			for (int i = 0; i < numberStr.length(); i++) {
				if(!(str.contains(i+"")))
				temp += numberStr.charAt(i);
			}
			list1.add(Integer.parseInt(temp));
		}

		Collections.sort(list1);
		System.out.println(list1.get(0));

	}

	public static String formRegularExpressionString(String numberStr,
			int removeDigit) {
		String expr = "";
		String firstPart = "^(?=\\d{";
		String secondPart = "$";
		String exp1 = "";
		for (int i = 0; i < numberStr.length(); i++) {

			exp1 += i + "?";

		}
		expr = firstPart + (numberStr.length() - removeDigit) + "" + "}$)"
				+ exp1 + secondPart;
		return expr;
	}

	public static String findBigAndSmallPossibleNumber(String numberStr,
			int removeDigit) {
		StringBuilder start = new StringBuilder();
		StringBuilder end = new StringBuilder();
		int startStrlen = numberStr.length() - removeDigit;

		if (removeDigit == numberStr.length())
			startStrlen = numberStr.length() - 1;

		for (int i = 0; i < startStrlen; i++) {
			start.append(i);
		}
		for (int i = removeDigit; i < numberStr.length(); i++) {
			end.append(i);
		}

		return start + "-" + end;

	}


	}
}
