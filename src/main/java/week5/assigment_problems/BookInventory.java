public class BookInventory {
 private int copiesTotal,copiesAvailable;
 public BookInventory(int n){if(n<=0)throw new IllegalArgumentException("Total copies must be positive");copiesTotal=n;copiesAvailable=n;}
 public void checkOut(){if(copiesAvailable>0)copiesAvailable--;}
 public void checkIn(){if(copiesAvailable<copiesTotal)copiesAvailable++;}
 public int getCopiesAvailable(){return copiesAvailable;}
 public static void main(String[] args){BookInventory b=new BookInventory(3);b.checkOut();b.checkOut();b.checkOut();b.checkOut();System.out.println(b.getCopiesAvailable());b.checkIn();b.checkIn();b.checkIn();b.checkIn();System.out.println(b.getCopiesAvailable());}
}