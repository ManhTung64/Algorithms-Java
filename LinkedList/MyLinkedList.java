public class MyLinkedList {
    public Node head = null;
    public Node tail = null;
    public MyLinkedList()
    {

    }
    public void add(int data)
    {
        Node list = new Node(data); //next = null, data = 1
        if (head == null){
            head = list; // data = 1, next = null
            tail = list;
        }
        else
        {
            tail.next = list;
            tail = list; // update the new position for tail
        }
    }
    public String toString()
    {
        Node tmp = head;
        String s = "";
        while (tmp != null)
        {
            s += tmp.data +" "; //time high
            tmp = tmp.next;
        }
        return s;
    }
    public void addFirst(int data)
    {
        Node list = new Node(data); //next = null, data = 1
        list.next = head;
        head = list;
    }
    public void removeFirst()
    {
        if(head != null)
        {
            Node tmp = head;
            head = head.next;
            tmp.next = null;
        }
    }
    public void removeLast()
    {
        Node current = head;
        Node tmp = head;
        while(current.next != null)
        {
            tmp = current;
            current = current.next;
        }
        tmp.next = null;
        tail = tmp;
    }
    //other function: addfirst, removefirst, last, addIndex, removeIndex, contains:true, false
    public void addIndex(int index, int data)
    {
        Node list = new Node(data);
        int count = 0;
        Node current = head;
        while(current.next != null)
        {
            if(count == (index - 1)) {
                list.next = current.next;
                current.next = list;
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Index not found");
    }
    public void removeIndex(int index)
    {
        int count = 0;
        Node current = head;
        boolean found = false;
        while(current.next != null)
        {
            if(count == (index - 1)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Index not found");
    }
    public boolean Contains(int data)
    {
        return false;
    }
}
