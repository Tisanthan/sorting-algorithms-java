public class binary1
{

    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        long[] array = {23,45,68,95,105,120,175,256,324,618};
        binary1 bi = new binary1();
        //System.out.println(bi.binarySearch(array,175));
        long d = bi.binarySearch(array,175);

        if (d<0){
            System.out.println("fail");
            System.out.println("unuseual input plz correct");
        }
        else
        {
            System.out.println("sucess");
            System.out.println("index no "+d);
        }

       long EndTime = System.currentTimeMillis();
       long elapsTime = EndTime - StartTime;
       System.out.println("elapstime is "+elapsTime+" sec");



    }
    public static int binarySearch(long[] array, long searchkey)
    {
        int lowerBond = 0;
        int upperBond =array.length - 1;
        int mkd;
        while(true)
        {
            mkd =(lowerBond + upperBond)/2;
            if(array[mkd]==searchkey)
            {
                return mkd;
            }
            else if(lowerBond > upperBond)
            {
                return -1;
            }
            else
            {
                if (array[mkd] < searchkey)
                {
                    lowerBond = mkd +1;
                }
                else
                {
                    upperBond = mkd -1;
                }
            }
        }
    }

}
