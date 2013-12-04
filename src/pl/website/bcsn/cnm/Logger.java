package pl.website.bcsn.cnm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
	
	private static GregorianCalendar gc = new GregorianCalendar();
	
	
	public static void fine(String msg){
		String code = "FINE";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
	
	public static void finer(String msg){
		String code = "FINER";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
	
	public static void finest(String msg){
		String code = "FINEST";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
	
	public static void warning(String msg){
		String code = "WARNING";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
	
	public static void severe(String msg){
		String code = "SEVERE";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
	
	public static void error(String msg){
		String code = "ERR";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
	
	public static void fatal(String msg){
		String code = "FATAL";
		String date = gc.get(Calendar.YEAR) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.DAY_OF_MONTH) + 
				" " + gc.get(Calendar.HOUR_OF_DAY) + ":" + gc.get(Calendar.MINUTE) + ":" + gc.get(Calendar.SECOND) + ":" +
				gc.get(Calendar.MILLISECOND);
		System.out.println("["+date+"]["+code+"]"+msg);
	}
}
