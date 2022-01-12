package main;

public class string_checker {
    private final Boolean bool;
    private int pos;
    string_checker(String str, String i) {
        bool = str.contains(i);
        if(bool){
            pos = str.indexOf(i);
        }
    }
    public Boolean getBool() {
        return bool;
    }
    public int getPos() {
        return pos;
    }
}
