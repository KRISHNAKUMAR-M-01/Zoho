    package Task;

    import javax.swing.plaf.TableHeaderUI;
    import java.util.Arrays;

    public class Task {
        public static void main(String[] args) {
            String string="krish#kanna#M@21";
            stringManipulation(string);
        }
        public static void stringManipulation(String str){
            char[] arr=str.toCharArray();
            int countHash=0;
            int countAt=0;
            String beforeCap="";
            boolean isSeen=false;
            boolean isSeen1=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='#'){
                   countHash++;
                   arr[i]='$';
                }
                if(arr[i]=='@'){
                    countAt++;
                }
                if(!isSeen){
                    arr[i]=Character.toUpperCase(arr[i]);
                    if(arr[i]=='$'){
                        isSeen=true;
                    }
                }
                if(arr[i]=='@'){
                    beforeCap+=new String(arr);
                    arr[i-1]=Character.toLowerCase(arr[i-1]);
                }

            }
            System.out.println("The count of # : "+countHash);
            System.out.println("The count of @ : "+countAt);
            System.out.println("Before Changing to lowerCase : "+beforeCap);
            System.out.println("After Changing the LastName as LowerCase : "+ new String(arr));

            String newString=new String(arr);

            String replace=newString.replace('$',' ');
            System.out.println("replacing Seperators with Space : "+replace);

            String[] strArr=newString.split("\\$");
            String rev=strArr[0];
            String revString="";
            for(int i=rev.length()-1;i>=0;i--){
                revString+=rev.charAt(i);
            }

            strArr[0]=revString;
            String updatedString="";
            for(int i=0;i<strArr.length;i++){
                if (i<str.length()){
                    updatedString+=strArr[i]+" ";
                }

            }
            System.out.println("The String after Reversing the first name and replacing : "+updatedString);

        }
    }
