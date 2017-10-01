package doublyLinkedList;

public class doublyLinkedDelete {

    doublyLinkedList d = doublyLinkedList.listInstance;
    public void delete()
    {

    }
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

    public void deleteFromStart(){
        if(d.size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting node " + d.head.data + " from start");
            d.head = d.head.next;
            d.size--;
        }
    }
}

