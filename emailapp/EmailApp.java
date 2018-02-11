package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em1 = new Email("Vivek","Sahu");
		//em1.changePassword("chPass");
		//System.out.println(em1.getChPassword());
		//em1.setAlternateEmail("altEmail.com");
		//System.out.println(em1.getAlternateEmail());
		//em1.setMailboxCapacity(capacity);
		//System.out.println(em1.getMailboxCapacity());
		System.out.println(em1.showInfo());

	}

}
