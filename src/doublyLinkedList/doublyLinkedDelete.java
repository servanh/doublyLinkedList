package DoublyLinkedList;

/**
 * This is delete class will delete from start or end or a value depending on input.
 */

public class DoublyLinkedDelete {


    DoublyLinkedList d = DoublyLinkedList.listInstance;
    DoublyLinkedSearch s = new DoublyLinkedSearch();

    //deletes specified value from list or stack or queue
    public void deleteValue(int value)
    {
       int position= s.searchPosition(value);
        deleteAtPos(position);
    }

    //Deletes from end of list
    public void deleteFromEnd(){
        if(d.size==0){
            System.out.println("\nList is Empty");
        }else if(d.size==1){
            deleteFromStart();
        }else{
            //store the 2nd last node
            int x = d.tail.data;
            Node prevTail = d.tail.previous;

            //detach the last node
            d.tail = prevTail;
            d.tail.next=null;
            System.out.println("\ndeleting node " + x + " from end");
            d.size--;
        }
    }


    //deletes value from head
    public void deleteFromStart(){
        if(d.size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting node " + d.head.data + " from start");
            d.head = d.head.next;
            d.size--;
        }
    }


    //deletes at specified node.
    public void deleteAtPos(int pos)
    {
        if (pos == 1)
        {
            if (d.size == 1)
            {
                d.head = null;
                d.tail = null;
                d.size = 0;
                return;
            }
            d.head = d.head.next;
            d.head.previous=null;
            d.size--;
            return ;
        }
        if (pos == d.size)
        {
            d.tail = d.tail.previous;
            d.tail.next=null;
            d.size-- ;
        }
        Node ptr = d.head.next;
        for (int i = 2; i <= d.size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.previous;
                Node n = ptr.next;

                p.next=n;
                n.previous=p;
                d.size-- ;
                return;
            }
            ptr = ptr.next;
        }
    }
}

