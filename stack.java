import java.util.Deque;
import java.util.LinkedList;

public class stack{
    public static void main(String[] args){
        Deque<Integer> stack1 = new LinkedList<>();
        for(int i = 0;i<5;i++){
            stack1.push(i);
        }
        boolean condition = stack1.isEmpty();
        System.out.println(condition);
        int temp = stack1.pop();
        System.out.println("The number taken out is: "+temp);
        int now = stack1.peek();
        System.out.println("The last number in stack now is: "+now);
        int size = stack1.size();
        System.out.println("The size of the stack now is: "+size);
    }
}