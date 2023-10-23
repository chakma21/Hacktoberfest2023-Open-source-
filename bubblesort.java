public class bubblesort {
    public static void main(String args[])
    {
        int ar[]={20,50,15,36,8,24,30,45};
        System.out.println("The array before sorting:");
        System.out.println("20 50 15 36 8 24 30 45");
        int n=0;
        for(int i=0;i<ar.length-1;i++)
        {
            for (int j=0;j<ar.length-1;j++)
            {
               if(ar[j]>ar[j+1])
               {
                n=ar[j+1];
                ar[j+1]=ar[j];
                ar[j]=n;
               }            
            }
        }
        System.out.println("The array after sorting:");
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

    }
}
