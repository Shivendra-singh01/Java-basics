class Node {
    int data;
    Node next;

    Node() {

    }

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
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        
    return head; 
}

    private static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(" ");
    }

    private static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    private static boolean searchValue(Node head, int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return true;
            temp = temp.next;
        }
        return false; 
    }

    private static Node removeHead(Node head) {
        if(head == null) return head;
        head = head.next;
    return head;
    }

    private static Node removeTail(Node head) {
        if(head == null) return head;
        Node temp = head;
        while( temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    private static Node removekthNode(Node head, int k) {
        if(head == null ) return head;
        if(k == 1) {
            head = head.next;
        }
        int cnt = 0; 
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if(cnt == k) {
                
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }

    return head;}

    private static Node insertnewHead(Node head, int val) {
        Node temp  = new Node(val, head);
       
    return temp; 
    }

    private static Node insertnewTail(Node head, int val) {
        if(head == null) {return new Node(val);}
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;

        return head;
    }

    private static Node insertkthNode(Node head, int val , int k) {
        if (head == null) {
            if( k == 1) {
                return new Node(val);
            }
            else {System.out.println("LinkedList is empty put valid value for k !");}
        }
        int cnt = 0; 
        Node temp = head;
        while (temp.next != null) {
            cnt++;
            if(cnt == k-1) {
                Node n = new Node(val);
                n.next = temp.next;
                temp.next = n;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        Node head = arrtoLL(arr);

        head = insertkthNode(head,6,3);
        printLL(head);
       
        System.out.println("Length of LL: " + lengthOfLL(head));
        System.out.println(searchValue(head,1)); 

        
    }
   
}
