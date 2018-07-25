public class Bubble {
    public static void bubbleShort(long[] array)
    {
        for(int i= array.length-1;i>-1;i--)
        {
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1])
                {
                    swap(array,j,j+1);
                }
            }
        }
    }
    private static void swap(long[] array,int one,int two)
    {
        long temp = array[one];
        array[one] = array[two];
        array[two] =temp;
    }
    public static void main(String[] args)
    {
        long[] array = {12,56,856,69,42,65,75,95,82,100,2};
        Bubble b = new Bubble();
        b.bubbleShort(array);
        for(int k=0;k<array.length;k++)
        {
            System.out.print(array[k]+",");
        }
    }
}
