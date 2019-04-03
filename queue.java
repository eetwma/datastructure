import java.util.Queue;
import java.util.LinkedList;

public class queue{
    public static void main(String[] args){
        Queue<Integer> queue1 = new LinkedList<>();
        for(int i = 0;i<5;i++){
            queue1.offer(i);
        }
        boolean condition = queue1.isEmpty();
        System.out.println(condition);
        int temp = queue1.poll();
        System.out.println("The number taken out is: "+temp);
        int now = queue1.peek();
        System.out.println("The last number in stack now is: "+now);
        int size = queue1.size();
        System.out.println("The size of the stack now is: "+size);
    }
}