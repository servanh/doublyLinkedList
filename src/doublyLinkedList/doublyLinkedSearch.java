package DoublyLinkedList;


/**
 * this search function is implemented to search at position or specified value.
 */
public class DoublyLinkedSearch {

    //searches specified value
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

    //searches at specified node
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
