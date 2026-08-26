class Node {
    int data;
    Node next;

    Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node ( int data) {
        this.data = data;
        this.next = null;
    }
}





public class LinkedList {

     private static Node arrtoLL (int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        
    return head; }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        Node node = new Node(arr[0],null);
        System.out.print(node.data);
    }
   
}
