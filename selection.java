public class selection {
    public static void selectionShort(long[] array)
    {
       int out,in,min;
       for(out=0;out<array.length;out++)
       {
           min=out;
           for(in=out+1;in<array.length;in++)
           {
               if(array[in] < array[min])
               {
                   min=in;
                   swap(array,out,min);

               }
           }
       }
    }

    private static void swap(long[] array,int fist,int finals)
    {
        long temp = array[fist];
        array[fist] = array[finals];
        array[finals] =temp;
    }
    public static void main(String[] args)
    {
        long[] array = {30,56,856,69,42,65,75,95,82,100,2};
        selection b = new selection();
        b.selectionShort(array);
        for(int k=0;k<array.length;k++)
        {
            System.out.print(array[k]+",");
        }

    }
}
