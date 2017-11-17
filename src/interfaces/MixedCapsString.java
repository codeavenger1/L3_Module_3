package interfaces;
public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String funk) {
		// TODO Auto-generated method stub\
		String a = "";
		for (int i = 0; i < funk.length(); i++) {
			if(i%2 ==0) {
				a += Character.toLowerCase(funk.charAt(i));
			} else {
				a += Character.toUpperCase(funk.charAt(i));
			}
			}
		
		
		return a;
	}

}
