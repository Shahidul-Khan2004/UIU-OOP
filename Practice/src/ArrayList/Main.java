package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class str implements Comparable<str> {

    String title;

    str(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(str that) {
        if(Integer.parseInt(that.title) > Integer.parseInt(title)) return 1;
        else return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<str> a = new ArrayList<>();
        a.add(new str("123"));
        a.add(new str("456"));
        a.add(new str("789"));
        Collections.sort(a);

        for (str s : a) {
            System.out.println(s.title);
        }
    }
}
