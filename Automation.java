package week5.day4;

public class Automation extends MultipleLanguage {

	

	public void java() {
		System.out.println("java language");
		
	}

	public void selenium() {
		System.out.println("selenium code");
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation amt=new Automation();
		
		amt.selenium();
		amt.java();
		amt.ruby();
	}
	

}
