package infnetjavaq8;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Consumidor {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void getRequest() 
	{
		RestTemplate template = new RestTemplate();
		String msgRetorno = template.getForEntity("https://query1.finance.yahoo.com/v7/finance/quote?symbols=TLS.AX,MUS.AX", String.class).getBody();
		System.out.println(msgRetorno);
	}
}
