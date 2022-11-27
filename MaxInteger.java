

public class MaxInteger {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x; // assume max number at 1st

        if(y.compareTo(max)>0)
             max = y; // y is the largest
        if(z.compareTo(max)>0)
             max = z; // z is the largest
        return max; // return the max num of three variables


    }
    public static void main(String args[]){
        System.out.println("Maximum of three integers  54,5,8 is "+ maximum(54,5,8));
    }
}
