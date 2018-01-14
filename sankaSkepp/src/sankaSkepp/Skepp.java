package sankaSkepp;

public class Skepp {
	
	private int size;
	private int HP;
	private String name;
	
	public Skepp(int sz, String nm) {
		size = sz;
		name = nm;
		HP = sz;
	}

	public String getName()
	{
		return name;
	}
	
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
