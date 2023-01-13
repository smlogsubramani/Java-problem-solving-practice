public class reverse {
    public static void main(String[] args){
        String originalstr = "priya";
        String reverse = "";
        int i;
        int len = originalstr.length();
        for(i= len-1; i>=0;i--){
            reverse = reverse + originalstr.charAt(i);
            
        }
             System.out.println("reversed string =" + reverse);
    }
}
