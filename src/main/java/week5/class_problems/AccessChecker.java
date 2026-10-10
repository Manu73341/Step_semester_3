class MovieTicket {private String seatNumber;String screenId;protected double ticketPrice;public String movieTitle;}
public class AccessChecker {
 static String classifyAccess(String m,String c){switch(m){case "private":return c.equals("SAME_CLASS")?"ALLOWED":"DENIED";case "default":return c.equals("SAME_CLASS")||c.equals("SAME_PACKAGE")?"ALLOWED":"DENIED";case "protected":return c.equals("DIFFERENT_PACKAGE")?"DENIED":"ALLOWED";case "public":return "ALLOWED";default:return "DENIED";}}
 static String summarizeBatch(String[][] a){int ok=0,no=0;for(String[] x:a)if(classifyAccess(x[0],x[1]).equals("ALLOWED"))ok++;else no++;return "Allowed: "+ok+" | Denied: "+no;}
 public static void main(String[] args){String[][] a={{"default","SAME_PACKAGE"},{"default","DIFFERENT_PACKAGE"},{"public","DIFFERENT_PACKAGE"}};System.out.println(classifyAccess("private","SAME_CLASS"));System.out.println(classifyAccess("protected","DIFFERENT_PACKAGE"));System.out.println(summarizeBatch(a));}
}