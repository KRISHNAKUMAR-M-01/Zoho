package String;

public class NextChar {
    public static void main(String[] args) {
        String string = "Aabfz x";
        System.out.println("Updated: "+nextChar(string));
    }
    public static String nextChar(String str){
        String update="";
        for(char c:str.toCharArray()){
          if(c=='z'){
              update+='a';
          }
          else if(c=='Z'){
              update+='A';
          }
          else if(c>='a' && c<='y' ||c>='A' && c<='Y' ){
              update+=(char)(c+1);
          }
          else{
              update+=c;
          }

        }
        return update;
    }
}
