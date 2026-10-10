import java.util.Scanner;
public class LibraryISBNValidator {
 static String normalizeCode(String raw) { String code=raw.trim(); if(code.length()<3)return code; return code.substring(0,3).toUpperCase()+code.substring(3); }
 static String validateAndFormat(String code) {
  if(code.length()!=13)return "Invalid: code must be exactly 13 characters";
  for(int i=0;i<3;i++)if(!Character.isLetter(code.charAt(i)))return "Invalid: publisher code must be 3 letters";
  for(int i=3;i<13;i++)if(!Character.isDigit(code.charAt(i)))return "Invalid: remaining 10 characters must be digits";
  String year=code.substring(3,7),catalog=code.substring(7,13);
  return new StringBuilder().append("[").append(code.substring(0,3)).append("] YEAR: ").append(year).append(" | CATALOG: ").append(catalog).toString();
 }
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); System.out.print("Enter ISBN-style code: "); String raw=sc.nextLine(); System.out.println(validateAndFormat(normalizeCode(raw))); sc.close(); }
}