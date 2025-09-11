public class Monster {
	private String name;
	private String type;
	private int level;
	Monster(String n, String t) {
		this(n, t, 1);
	}
	Monster(String n, String t, int l) {
		setName(n);
		setType(t);
		setLevel(l);
	}
	public void setName(String n) {
		name = n;
	}
	public void setType(String t) {
		type = t;
	}
	
}
