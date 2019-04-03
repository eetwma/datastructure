class ListNode{ 
    int value;
    ListNode next;  //(help you find the next neighbor)

    ListNode(int value){
        this.value = value;
    }
}
public class linkedlist{
    public static ListNode generate(int n) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for(int i = 1;i<n;i++){
          cur.next = new ListNode(i);
          cur = cur.next;
        }
        return head;
      }
    public static void main(String[] args){
        ListNode newHead = generate(5);
        ListNode temp = newHead;
        while(temp != null){
        System.out.println(temp.value);
        temp = temp.next;
        }
    }
}