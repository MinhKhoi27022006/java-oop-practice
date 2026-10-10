package act2;
import java.util.*;
public class Member extends Person {
	private List<Item> borrowedItems = new ArrayList<>();
	public Member(int id, String name, String email) {
		super(id, name, email);
		
	}
    public List<Item> getBorrowedItems() {
        return Collections.unmodifiableList(borrowedItems);
    }
    public void borrowItem(Item item) {
        if (borrowedItems.contains(item)) {
            System.out.println("Item already borrowed!");
            return;
        }
        borrowedItems.add(item);
    }
    public void returnItem(Item item) {
        if (!borrowedItems.contains(item)) {
            System.out.println("Item not borrowed!");
            return;
        }
        borrowedItems.remove(item);
    }
    // toi ten la fkhou 
	@Override
	public String toString() {
		return "Member [borrowedItems=" + borrowedItems + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
    
    

	

}
