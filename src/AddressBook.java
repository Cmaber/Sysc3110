import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> arr;

    public AddressBook() {
        arr = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo a) {

        arr.add(a);
    }
    public void removeBuddy(BuddyInfo c) {
        arr.remove(c);
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        BuddyInfo buddy = new BuddyInfo("chris");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(buddy);
    }
}
