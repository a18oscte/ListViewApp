import java.util.ArrayList;

public class mountain {

    private String name;
    private String location;
    private int height;

    public mountain(String n, String l, int h){
        name = n;
        location = l;
        height = h;
    }

    public String info(){
        String tmp;
        tmp = location + " " + height;

        return tmp;
    }
}
