public class binary {
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        long arra[] = {12,23,24,25,30,40,50,60,70,80,90};
        binary bi = new binary();
        bi.binarysearchAlt(arra,60);
        long end = System.currentTimeMillis();
        System.out.println("");
        System.out.println("elaps time is "+(end-start)+" sec");

    }

    int binarysearchAlt(long arra[],long searchkey)
    {
        int lowerbond = 0;
        int upperbond = arra.length - 1;
        while (lowerbond <= upperbond)
        {
            int mid = lowerbond + (upperbond -lowerbond)/2;
            if(arra[mid] == searchkey)
            {
                return mid;
            }
            else if(arra[mid] < searchkey)
            {
                lowerbond = mid +1;
            }
            else
            {
                upperbond = mid -1;
            }
        }return -1;
    }

}
