import java.util.*;
public class arrayadd
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int d[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                d[i][j]=sc.nextInt();
            }
        }
        System.out.print(a[r][c]+b[r][c]);

        


        
    }
}