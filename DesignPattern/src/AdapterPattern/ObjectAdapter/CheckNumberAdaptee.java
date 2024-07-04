package AdapterPattern.ObjectAdapter;

public class CheckNumberAdaptee {
    public boolean isNumber(String str){
        try {
            String regex = "[0-9]+";
            return str.matches(regex);
        }catch (Exception e){
            return false;
        }
    }
}
