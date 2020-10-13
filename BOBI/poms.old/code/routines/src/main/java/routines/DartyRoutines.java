package routines;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/*
Classe Contenant des fonctions g�n�riques
 */

public class DartyRoutines {

	//CRO (2015-06-09):
	/**
	 * Encode une chaîne de caractère en AES128, puis en BASE64
	 * 
	 * {talendTypes} String
     * 
     * {Category} TalendDate
	 */
	public static String EncodeAES128Base64(String chaine) {
		
		String  CIPHER = "AES";
		SecretKeySpec KEY = new SecretKeySpec("DartyCom-Catalog".getBytes(), CIPHER);
		String EncodedString = "";
		
		try {
			//Encodage en AES128 :
			byte[] dataToSend = chaine.getBytes(Charset.forName("UTF-8"));
			//byte[] dataToSend = chaine.getBytes(Charsets.UTF_8);
			Cipher c = Cipher.getInstance("AES");
			c.init(Cipher.ENCRYPT_MODE, KEY);
			byte[] encryptedData = c.doFinal(dataToSend);

			//Encodage en BASE64 :
			EncodedString = Base64.encodeBase64URLSafeString(encryptedData);
			//EncodedString = Base64.encode(encryptedData);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return EncodedString;
	}

	//CRO (2015-07-07):
	/**
	 * Decode une chaîne de caractère en BASE64, puis en AES128
	 * 
	 * {talendTypes} String
     * 
     * {Category} TalendDate
	 */
	public static String DecodeAES128Base64(String chaine) {
		
		String  CIPHER = "AES";
		SecretKeySpec KEY = new SecretKeySpec("DartyCom-Catalog".getBytes(), CIPHER);
		byte[] EncodedBytes;
		String DecodedString = "";
		
		try {
			//Decodage en BASE64 :
			EncodedBytes = Base64.decodeBase64(chaine);

			//Decodage en AES128 :
			Cipher c = Cipher.getInstance("AES");
			c.init(Cipher.DECRYPT_MODE, KEY);
			byte[] decryptedData = c.doFinal(EncodedBytes);
			DecodedString = new String(decryptedData);
			
		} catch (Exception e) {
			return new String("");
			//throw new RuntimeException(e);
		}
		return DecodedString;
	}


	/**
	 * Decode une chaîne de caractère URLEncoded en BASE64, puis en AES128
	 * 
	 * {talendTypes} String
     * 
     * {Category} TalendDate
	 */
	public static String URLDecodeAES128Base64(String chaine) {
		try {
			chaine = java.net.URLDecoder.decode(chaine, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String  CIPHER = "AES";
		SecretKeySpec KEY = new SecretKeySpec("DartyCom-Catalog".getBytes(), CIPHER);
		byte[] EncodedBytes;
		String DecodedString = "";
		
		try {
			//Decodage en BASE64 :
			EncodedBytes = Base64.decodeBase64(chaine);

			//Decodage en AES128 :
			Cipher c = Cipher.getInstance("AES");
			c.init(Cipher.DECRYPT_MODE, KEY);
			byte[] decryptedData = c.doFinal(EncodedBytes);
			DecodedString = new String(decryptedData);
			
		} catch (Exception e) {
			return new String("");
			//throw new RuntimeException(e);
		}
		return DecodedString;
	}

	/**
	 * Construit l'identifiant du job pour liaison entre les jobs fils en concaténant la date du jour 
	 * au format yyyyMMddHHmmssSSS, "_" et le paramètre de la fonction
	 * @param pQueueName
	 * @return identifiant pour le suivi des statistiques
	 */
	public static String RightStringPadding(String chaine, char rempl, int longueur) {
        for(int i = 0; i<longueur; i++){
            chaine = chaine+rempl;
        }
        chaine = chaine.substring(0,longueur);
		return chaine;
	}
	
	//BDR 
	public static String MD5_Crypt(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		        	sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		        }
	        return sb.toString();
		   } catch (java.security.NoSuchAlgorithmException e) {}
		   return null;
    }
	public static int DateToTimeStamp(String date, String Format) {
        //Format ex = yyyyMMdd hh:mm:ss
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat(Format);
	        Date FomatageDate = dateFormat.parse(date);
	        return (int) ((FomatageDate.getTime())/1000);
		}catch(ParseException e){}
		return 0;
	}
	
	public static String RightTalendPadding(String chaine, char rempl, int longueur) {
        if(chaine==null) chaine="erreur";
		String Native = chaine;
        for(int i = 0; i<longueur; i++){
        chaine = rempl+chaine;
    }
    chaine = chaine.substring(Native.length());
	return chaine;
	}
	public static String LeftTalendPadding(String chaine, char rempl, int longueur) {
		for(int i = 0; i<longueur; i++){
            chaine = chaine+rempl;
        }
    chaine = chaine.substring(0,longueur);
	return chaine;
	}
	
	public static int ConvertStringToIntger(String chaine) {
		if(chaine==null || chaine.length()==0) return 0;
        try{
            double d = Double.valueOf(chaine);
            return (int) d;
        }catch(NumberFormatException e){}
        return 0;
	}
	
	
	public static String buildIdJob(String pQueueName) {
		return TalendDate.formatDate("yyyyMMddHHmmss", TalendDate.getCurrentDate())+"_"+pQueueName;
	}
	
	public static String TrimFields(String chaine) {
		if(chaine!=null) return chaine.trim();
		return chaine;
	}
	
	public static Double ConvertStringToDouble(String chaine) {
		if(chaine==null || chaine.length()==0) return 0.0;
        try{
            return Double.valueOf(chaine);
        }catch(NumberFormatException e){}
        return 0.0;
	}
	
	public static String nvl(String aParam) {
		if (aParam==null) return "";
		return aParam;
	}
	
	public static int VAL_DEFAUT_NUMERIQUE = 0;

	
	/**
	  * Fonction de conversion de String en Long - Retourne la valeur numérique par défaut s'il y a une exception
	  * @param aSource String a convertir
	  * @return Double REsultat - Retourne la valeur numérique par d�faut s'il y a une exception
	  */
	 public static long String2Long(String aSource) {
		 if (aSource==null)
			 return VAL_DEFAUT_NUMERIQUE;
				 
		 
		 long lResult;
		 
		 try {
			 lResult = Long.parseLong(aSource.replace(",", "."));
		 } catch (Exception ex) {
			 lResult = VAL_DEFAUT_NUMERIQUE;
		 }
		 
		 return lResult;
	 }
	
	 
	public static Long ReverseTimeStamp(String aDaterescDeb) {
		
		Long lResult = null;
		Date aDaterescFin;
		aDaterescFin = new Date(Long.MAX_VALUE);
		
		lResult=Long.valueOf(aDaterescFin.getTime()-String2Long(aDaterescDeb.trim()));
		return lResult;
				
	}
	public static int AggrSum(String s1, String s2, String v1, String v2) {
		/*
		 * BDR : 23/10/2013 : Ajout d'un trim() sur le champ s2
		  */
		if(s1==null || s2==null || v1==null || v2==null) return -1;

        int sum = 0;
        
        String [] tab1 = s1.split(v2);
        String [] tab2 = s2.split(v2);
        //Matouk ajout de verification sur la taille de tab2 : && i < tab2.length 
        for (int i = 0; i < tab1.length; i++) {
            if(tab1[i].equals(v1) && i < tab2.length ){
                sum += Integer.valueOf(tab2[i].trim());
            }
        }
        
        return sum;
    }
	
	public static String  ReturnComment(String s1, String s2, String v1, String v2) {
        String [] tab1 = s1.split(v2);
        String [] tab2 = s2.split(v2);
        String res=" ";
        
        for (int i = 0; i < tab1.length; i++) {
            if(tab1[i].equals(v1) && i < tab2.length ){
                res =  tab2[i];
            	i=tab1.length + 1 ;
            }
        }
        return res;
	}
	
	public static String HourFormat(String chaine) {	
		SimpleDateFormat INPUT = new SimpleDateFormat ("HHmm"); 
    	SimpleDateFormat OUTPUT = new SimpleDateFormat ("HH:mm");
		Date t = null;
		try { 
			t = INPUT.parse(chaine); 
			return OUTPUT.format(t).toString();
		} catch (ParseException e) {}
		return null; 
		
	}
	
	public static String SpecHourFormat(String chaine, String PEntree, String PSortie) {	
		//SpecHourFormat("134300","HHmmss","HH:mm") => 13:43
		SimpleDateFormat INPUT = new SimpleDateFormat (PEntree); 
        SimpleDateFormat OUTPUT = new SimpleDateFormat (PSortie);
        Date t = null;
        try { 
                t = INPUT.parse(chaine); 
                return OUTPUT.format(t).toString();
        } catch (ParseException e) {}
        return null; 
    }	
}

