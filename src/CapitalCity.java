public class CapitalCity {
	private String name;
	private int population;
	CapitalCity(String n, int p) {
		setName(n);
		setPopulation(p);
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setPopulation(int p) {
		population = p;
	}
	
	public String getName() {
		return name;
	}
	public int getPopulation() {
		return population;
	}
	public boolean isMegaCity() {
		return population>10000000;
	}
	@Override
	public String toString() {
		return " ity: " + name + ", with a population of " + population;
	}
}
