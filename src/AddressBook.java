import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> arr;

    public static void main(String[] args) {
        ArrayList<BuddyInfo> arr = new ArrayList<BuddyInfo>();
        System.out.println("AddressBook");
    }

    public void addBuddy(BuddyInfo a) {

        arr.add(a);
    }
    public void removeBuddy(BuddyInfo c) {
        arr.remove(c);
    }
}
