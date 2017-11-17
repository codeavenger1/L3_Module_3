package interfaces;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String funk) {
		// TODO Auto-generated method stub
		String a = "This is a test";
		StringBuffer b = new StringBuffer(a);
		
		b.reverse();
		a = b.toString();
		return a;
	}

}
