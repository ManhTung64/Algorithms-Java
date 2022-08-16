

public class Test {
    public static void main(String[] args) {
        //example
        Node one = new Node(9);
        Node two = new Node(8);
        Node three = new Node(7);
        Node four = new Node(6);
        one.next = two;
        two.next = three;
        three.next = four;
        Node current = one;
        while(current != null)
        {
            System.out.println(current.data); // 9
            current = current.next;//next = two
        }
        //implement

        MyLinkedList myList = new MyLinkedList();//create my object
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.addFirst(0);
        myList.addIndex(4,9);
        System.out.println(myList);
        myList.removeIndex(4);
        System.out.println(myList);
    }
}
