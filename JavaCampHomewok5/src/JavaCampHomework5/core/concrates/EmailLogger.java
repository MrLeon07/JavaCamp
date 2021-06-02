package JavaCampHomework5.core.concrates;


import JavaCampHomework5.core.abstracts.ILogger;

public class EmailLogger implements ILogger{

	@Override
	public void log(String address,String message) {
		System.out.println(address+"'e "+message+" iletisi gönderildi.");
		
	}

	@Override
	public void log(String message) {
		System.out.println(message+" loglandý.");
	}

	
}
