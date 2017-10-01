package doublyLinkedList;

public class doublyLinkedSearch {
    public void search(int value)
    {

        doublyLinkedList d = doublyLinkedList.listInstance;
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
}
