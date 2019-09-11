package course.chapter6.date.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) throws ParseException {
        
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
    	Date d = (Date) Date.from(Instant.parse("2019-09-07T13:34:07Z"));
    	
    	System.out.println(sdf.format(d));
    	
    	//adicionando uma unidade de tempo
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(d);
    	calendar.add(Calendar.HOUR_OF_DAY, 4);
    	d = calendar.getTime();
    			
    	System.out.println(sdf.format(d));
    	System.out.println("----------------");
    	
    	//obtendo uma unidade de tempo
    	int minutes = calendar.get(Calendar.MINUTE);
    	int month = 1 + calendar.get(Calendar.MONTH);
    	
    	System.out.println("Minute: " + minutes);
    	System.out.println("Month: " + month);
        
    }
}
