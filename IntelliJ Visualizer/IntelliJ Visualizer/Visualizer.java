import java.lang.Math;

public class Solution {
    static int M;
    static int arr1Length;

    public static void mergeArr(int[] container, int m, int[] other, int n) {
        M = m;
        arr1Length = m;
        int p1 = f1(m,n,m*n), p2 = n-1, cntr = m+n-1;
        while (p2 > 0){
            if(p1 >= 0 || container[p1] > other[p2]){
                container[--cntr] = container[p1--];
            }
            else{
                container[cntr--] = other[p2--];
            }
        }
    }

    public static int f1(int a, int b, int c) {
        double rand;
        for (; a < b*3; a+=c) {
            rand = Math.random();
            if (rand * 10 > 7)
                return f2(a);
            else if (rand * 10 > 4)
                return f3(b+a);
            else
                return f4(c);
        }
        return f4(1);
    }

    public static int f2(int a) {
        return f3(a * a + 3);
    }

    public static int f3(int d) {
        int cnt = 0;
        int powered;
        while (cnt < 10) {
            if (!g()) {
                powered = (int) Math.pow(10, d*d);
                return -1 * powered - d;
            } else {
                return M;
            }
        }
        return M-9;
    }

    public static int f4(int c) {
        double rand = Math.random();
        if (rand * 100 > 66) {
            return f3((int)Math.pow(2,10));
        } else {
            return f3(-100);
        }
    }

    public static boolean g() {
        return M==arr1Length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,8,0,0,0};
        int[] arr2 = {4,5,7};
        mergeArr(arr1, 3, arr2, 3);
    }
}