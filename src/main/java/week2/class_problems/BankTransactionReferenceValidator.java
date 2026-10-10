import java.util.Scanner;
public class BankTransactionReferenceValidator {
 static String normalizeReference(String raw) { String reference=raw.trim(); if(reference.length()<3)return reference; return reference.substring(0,3).toUpperCase()+reference.substring(3); }
 static String validateAndFormat(String reference) {
  if(reference.length()!=14)return "Invalid: reference must be exactly 14 characters";
  for(int i=0;i<3;i++)if(!Character.isLetter(reference.charAt(i)))return "Invalid: bank code must be 3 letters";
  for(int i=3;i<14;i++)if(!Character.isDigit(reference.charAt(i)))return "Invalid: remaining 11 characters must be digits";
  String date=reference.substring(3,9),sequence=reference.substring(9,14);
  String formattedDate=date.substring(0,2)+"/"+date.substring(2,4)+"/"+date.substring(4,6);
  return new StringBuilder().append("[").append(reference.substring(0,3)).append("] DATE: ").append(formattedDate).append(" | SEQ: ").append(sequence).toString();
 }
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); System.out.print("Enter transaction reference: "); String raw=sc.nextLine(); System.out.println(validateAndFormat(normalizeReference(raw))); sc.close(); }
}