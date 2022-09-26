import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> arr;

    public AddressBook() {

        arr = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo a) {

        arr.add(a);
    }
    public BuddyInfo removeBuddy(int index) {
        if(index>=0&&index<arr.size()){
            return arr.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        BuddyInfo buddy = new BuddyInfo("chris");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);
    }
}
