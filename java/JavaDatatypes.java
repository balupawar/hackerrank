import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                long long1 = -9223372036854775808l;
                long long2 = 9223372036854775807l;
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte\n* short\n* int\n* long");    
                }
                else if( x >= -32768 && x<= 32767){
                    System.out.println("* short\n* int\n* long");   
                }
                 else if( x >= -2147483648 && x<= 2147483647){
                    System.out.println("* int\n* long");
                }
                 else if( x >= long1  && x<= long2 ){
                    System.out.println("* long");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }finally{
                sc.close();
            }

        }
    }
 }

