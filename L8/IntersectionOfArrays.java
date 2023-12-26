
import java.util.ArrayList;

public class IntersectionOfArrays {

    public static void main(String[] args) {

        int[] one = {1,2,2,1};
        int[] two = {2,2};

        System.out.println(intersection(one, two));
    }

    public static ArrayList<Integer> intersection(int[] one, int[] two) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < one.length && j < two.length) {

            if(one[i] < two[j]) {
                i++;
            }else if(one[i] > two[j]) {
                j++;
            }else{
                ans.add(one[i]);
                i++;
                j++;
            }
        }

        return ans;
    }
}