import java.util.Arrays;

public class LinearSeacrhString {
    public static void main(String[] args) {
          String name ="vinit";
          char target = 'i';
          boolean ans =   Search(name,target);
            boolean ans2 =   search2(name,target);
                  System.out.println(ans);
                         System.out.println(ans2);
        System.out.println(Arrays.toString(name.toCharArray()));    ///.toCharArray() converts the string into a character array
        //char array (like char[]) and returns a string representation of its contents.
    }

    static boolean search2(String str, char target) {
               if (str.length() == 0) {
                          return false;
                      }    for(char ch : str.toCharArray()) {
                                       if (ch == target) {
                                           return true;
                                       }
                                   }
                                   return false;
                               }
               



static boolean Search(String str,char target){
if( str.length()==0){
    return false;
}
for(int i=0; i<str.length(); i++){
    if(target==str.charAt(i)){
        return true;
    }


}      return false;

    }


}

