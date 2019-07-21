package ListNode;

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        }

    }
    public class Main{
        public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(7);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        ListNode lsum = Solution.addTwoNumbers(l1,l2);
        System.out.println(lsum.val + "->" + lsum.next.val + "->" + lsum.next.next.val + "->" + lsum.next.next.next.val);
        }
    }

    class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int int1 = getInteger(l1);
        int int2 = getInteger(l2);
        int sum = int1 + int2;
        Integer s = new Integer(sum);
        String ss = s.toString();
        StringBuffer sb = new StringBuffer(ss);
        sb.reverse();
        String ssr = sb.toString();
        return toListNode(ssr);
    }
    private static ListNode toListNode(String str){
        ListNode l = new ListNode(str.charAt(0) - 48);
        int i = 1;
        buildListNode(l,str,i);
        return l;
    }

    private static int buildListNode(ListNode l, String str, int i) {
        if(i == str.length()){
            return 0;
        }
        l.next = new ListNode(str.charAt(i) - 48);
        i += 1;
        return buildListNode(l.next, str, i);
    }

    private static int getInteger(ListNode l) {//***利用递归的方式计算要求的值***
         int sum = 0;
         if(l.next == null){
             return l.val;
         }
         sum = l.val + getInteger(l.next)*10;
         return sum;
    }
}

