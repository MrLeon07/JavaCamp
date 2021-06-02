package JavaCampHomework5.core.concrates;

import JavaCampHomework5.core.abstracts.IConfirmatory;

public class EmailConfirmatory implements IConfirmatory{

	@Override
	public void sendConfirmationMessage(String adress, String message) {
		System.out.println(adress+" adresine doðrulama mesajý gönderildi. Doðrulama mesajý: "+message);
		
	}

}
