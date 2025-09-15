public class Country {
	private String name;
	private CapitalCity capital;
	Country(String n, CapitalCity c) {
		setName(n);
		setCapital(c);
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setCapital(CapitalCity c) {
		capital = c;
	}
	public String getName() {
		return name;
	}
	public CapitalCity getCapital() {
		return capital;
	}
	public boolean hasMegaCapitalCity() {
		return capital.isMegaCity();
	}
	@Override
	public String toString() {
		return "Country: " + name + ", with capital " + capital.toString();
	}
}
