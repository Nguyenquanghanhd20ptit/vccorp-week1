package AdapterPattern.ClassAdapter;

public class CheckPhoneAdapter extends CheckNumberAdaptee implements IPhoneTarget{
    @Override
    public boolean isPhoneNumber(String s) {
      try {
          if(isNumber(s)){
              String regex = "^(84|0[3|5|7|8|9])[0-9]{8}$";
              if(s.matches(regex)){
                  return true;
              }else {
                  return false;
              }
          }else {
              return false;
          }
      }catch (Exception e){
          return false;
      }
    }
}
