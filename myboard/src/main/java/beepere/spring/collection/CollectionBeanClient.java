package beepere.spring.collection;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("CollectionBean");
		//List<String> addressList = bean.getAddressList();
		
		Map<String, String> addressList = bean.getAddressList();
		
		for(String key:addressList.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, addressList.get(key)));
		}
		
		/**
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		**/
		factory.close();
	}
}
