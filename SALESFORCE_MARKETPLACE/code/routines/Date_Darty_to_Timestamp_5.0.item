package routines;

	import java.sql.Timestamp;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	
public class Date_Darty_to_Timestamp {	 
	 
	    public static SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	 
	    public static Date stringToDate(String sDate) throws ParseException {
	        return formatter.parse(sDate);
	    }
	 
	    public static Timestamp toDBDateFormat(String sDate) throws ParseException {
	        return new Timestamp(stringToDate(sDate).getTime());
	    }
	 
	    public static String dateToString(Date date) {
	        return formatter.format(date);
	 
	    }
	    
	    // Convert(yyDDDHHmmssSSS --> yyyyMMdd HH:mm:ss:SSS)
	    public static String DartyDateToTalendDate(String input) {
		  SimpleDateFormat ft = new SimpleDateFormat ("yyDDDHHmmssSSS"); 
	      SimpleDateFormat ft_2 = new SimpleDateFormat ("yyyyMMdd HH:mm:ss:SSS");
	      Date t = null; 
	      try { 
	          t = ft.parse(input); 
	      } catch (ParseException e) { 
	      }
	      return ft_2.format(t);
	    }
	    
	    public static void main(String[] args) throws ParseException {
	        String inputDate = "05-14-2005 15:53:42";
	        Date d=stringToDate(inputDate);
	        System.out.println("1ere methode:"+d);
	//affiche: 1ere methode:Sat May 14 15:53:42 GMT 2005
	        System.out.println("1ere methode:"+dateToString(d));
	//affiche: 1ere methode:05-14-2005 15:53:42
	 
	        Timestamp t= toDBDateFormat(inputDate);
	        System.out.println("1ere methode:"+t);
	//affiche 2eme methode: 2005-05-14 15:53:42.0
	        System.out.println("2eme methode: "+dateToString(t));
	//affiche: 2eme methode:05-14-2005 15:53:42
	    }
	 
	}