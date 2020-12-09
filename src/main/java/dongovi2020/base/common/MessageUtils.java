package dongovi2020.base.common;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageUtils {
	
	private static MessageSource resources = new ClassPathXmlApplicationContext("spring/context-message.xml");
	
	public static String getMessage(String code){
        return resources.getMessage(code, null, Locale.getDefault());
    }

    public static String getMessage(String code, String args[]){
        return resources.getMessage(code, args, Locale.getDefault());
    }
}
