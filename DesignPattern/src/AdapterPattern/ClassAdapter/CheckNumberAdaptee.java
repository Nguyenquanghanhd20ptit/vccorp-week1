package AdapterPattern.ClassAdapter;

public class CheckNumberAdaptee {
  public boolean isNumber(String s){
      try {
          String regex = "[0-9]+";
          return s.matches(regex);
      }catch (Exception e){
          return false;
      }
  }
}
