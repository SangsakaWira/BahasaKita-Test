import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Main{
    public static void main(String args[]){
        int[] true_steps = {0,1,3,5,6,7,9,10};
        int[] false_steps = {0,1,7,8,9,10,19,20};
        Solution solution = new Solution();
        Boolean status_true = solution.canCross(true_steps);
        Boolean status_false = solution.canCross(false_steps);
        System.out.println(status_true);
        System.out.println(status_false);
    }
}