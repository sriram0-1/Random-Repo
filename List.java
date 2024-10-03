import java.util.ArrayList;

public class List {

    public ArrayList<String> create() {
        return new ArrayList<>();
    }

    public void append(ArrayList<String> list, String element) {
        list.add(element);
    }

    public void remove(ArrayList<String> list, String element) {
        list.remove(element);
    }

    public void removeAtIndex(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    public static void main(String[] args) {
        List lf = new List();

        ArrayList<String> myList = lf.create();

        lf.append(myList, "Hello");
        lf.append(myList, "HI");
        lf.append(myList, "Bye");
        lf.append(myList, "GoodBye");

        System.out.println("After adding: " + myList);

        lf.remove(myList, "HI");
        lf.removeAtIndex(myList, 0);
        System.out.println("After removing: " + myList);
    }
}
