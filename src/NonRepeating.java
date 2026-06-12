public class NonRepeating {
    public static void main(String[] args) {
        String str="abcdabdc";
        String str1="&&$$@";
        String str2="AaA";
        System.out.println(FindNonRepeating(str));
        System.out.println(FindNonRepeating(str1));
        System.out.println(FindNonRepeating(str2));

    }
    public static Character FindNonRepeating(String str){
        int length=str.length();
        if(length==0){
            return null;
        }
        int[] count=new int[256];
        for(int i=0;i<length;i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<length;i++){
            if(count[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }
        return null;
    }
}
