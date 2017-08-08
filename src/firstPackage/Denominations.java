package firstPackage;

public enum Denominations {
	Ten("10"), Hundered("100"), FiveHundered("500"), Thousand("1000"), ERROR(
			"0");

	private String den;

	Denominations(String deno) {
		den = deno;
	}

	public Denominations fromString(String str) {
		switch (str.toLowerCase()) {
		case ("10"):
			return (Ten);
		case ("100"):
			return (Hundered);
		case ("500"):
			return (FiveHundered);
		case ("1000"):
			return (Thousand);
		}
		return (ERROR);
	}

	public String toString() {
		return den + "";
	}
}
