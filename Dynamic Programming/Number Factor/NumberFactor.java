import java.util.*;

class NumberFactor {
    public int Number_factor(int n) {
        ArrayList<Integer> mat = new ArrayList<Integer>();
        int i;
        for (i = 0; i <= n; i++) {
            if (i == 0 || i == 1 || i == 2)
                mat.add(1);
            else if (i == 3)
                mat.add(2);
            else
                mat.add((mat.get(i - 4) + mat.get(i - 3) + mat.get(i - 1)));
        }

        return mat.get(n);
    }

    public static void main(String[] args) {
        NumberFactor num = new NumberFactor();
        System.out.println(num.Number_factor(4));
    }
}