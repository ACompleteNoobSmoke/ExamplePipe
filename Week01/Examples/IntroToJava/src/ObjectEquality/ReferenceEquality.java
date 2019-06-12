package ObjectEquality;

public class ReferenceEquality {

	private int id;
	private String name;
	
	public ReferenceEquality(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		ReferenceEquality re1 = new ReferenceEquality(1, "name1");
		ReferenceEquality re2 = new ReferenceEquality(1, "name1");
		ReferenceEquality re3 = new ReferenceEquality(1, "name1");

		System.out.println(re1 == re2); //FALSE

		re1 = re2;
		
		System.out.println(re1 == re2);
	}
}
