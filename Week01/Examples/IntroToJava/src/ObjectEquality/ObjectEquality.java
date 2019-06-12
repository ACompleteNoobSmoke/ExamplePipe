package ObjectEquality;

public class ObjectEquality {

	private int id;
	private String name;
	
	public ObjectEquality(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectEquality other = (ObjectEquality) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {
		
		ObjectEquality e1 = new ObjectEquality(4, "name1");
		ObjectEquality e2 = new ObjectEquality(2, "name1");
		ObjectEquality e3 = new ObjectEquality(4, "name1");
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
	}
	
}
