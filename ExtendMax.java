
public class ExtendMax {
    public static<T extends Comparable<T>>T Maximum(T a, T  b, T c, T d, T e){
        T max = ; // assume S1 is maximum

        if(S2.compareTo(max)>0)
            max = S2;
        if(S3.compareTo(max)>0)
            max = S3;
        return max;   
    }
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Maximum of three Strings Apple ,Peach, Banana is "+ Maximum("Apple","Peach", "Banana")) ;
    }
    
}