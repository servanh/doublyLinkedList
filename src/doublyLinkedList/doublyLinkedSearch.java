package DoublyLinkedList;

public class DoublyLinkedSearch {
    public void search(int value)
    {

        DoublyLinkedList d = DoublyLinkedList.listInstance;
        int i =1;
        int verify = 0;
        while(d.elementAt(i) != -1)
        {
            if(d.elementAt(i) == value)
            {
               verify++;
            }
            //System.out.println(d.elementAt(i));
            i++;
        }


        if(verify > 0)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
    public int searchPosition(int value)
    {
        DoublyLinkedList d = DoublyLinkedList.listInstance;
        int i =1;
        int position = 0;
        while(d.elementAt(i) != -1)
        {
            if(d.elementAt(i) == value)
            {
                position=i;
            }
            //System.out.println(d.elementAt(i));
            i++;
        }

        return position;

    }
}
