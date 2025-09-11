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
	public void setLevel(int l) {
		level = l;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getLevel() {
		return level;
	}
	public static Monster basicBattle(Monster a, Monster b) {
		if(a.getLevel() < b.getLevel()) {return b;}
		return a;
	}
	public static Monster typeBattle(Monster a, Monster b) {
		if(a.getType() == "Water" && b.getType() == "Fire") {return b;}
		if(a.getType() == "Earth" && b.getType() == "Water") {return b;}
		if(a.getType() == "Fire" && b.getType() == "Earth") {return b;}
		return a;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLevel: " + level;
	}
	public boolean equals(Monster m) {
		return (name.equals(m.getName())) && (type.equals(m.getType()));
	}
	
}
