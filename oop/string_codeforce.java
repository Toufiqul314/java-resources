
import java.util.Scanner;

class string_codeforce{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}