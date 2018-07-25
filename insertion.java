public class insertion {
    public static void insertionShort(long[] array)
    {

        int in,out;
        for(out=1;out<array.length;out++)
        {
            long temp = array[out];
            in =out;
            while (in> 0 && array[in-1] >= temp)
            {
                array[in] = array[in-1];
                --in;

            }
            array[in] = temp;
        }

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long[] array={2,65,23,86,59,45,61,75,92,453,125,456,856,7854,15,};
        insertion in = new insertion();
        in.insertionShort(array);
        for(int e=0;e<array.length;e++)
        {
            System.out.print(array[e]+",");
        }
        long end = System.currentTimeMillis();
        System.out.println("");
        System.out.println("elapstime is "+(end-start)+" sec");
    }
}
