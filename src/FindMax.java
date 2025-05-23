public class FindMax<T extends Comparable<T>> {

    T x, y, z;

    public FindMax(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T findMax(){
        return findMaximum(x,y,z);
    }

    public static  <T extends Comparable<T>> T findMaximum(T a, T b, T c){
        T max = a;

        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
}