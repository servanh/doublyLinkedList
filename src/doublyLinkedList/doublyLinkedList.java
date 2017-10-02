package doublyLinkedList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class doublyLinkedList {
    int size =0;
    Node head = null;
    Node tail = null;
    public ArrayList<Integer> values = new ArrayList<Integer>();
    public ArrayList<String> instructions = new ArrayList<String>();

    public static doublyLinkedList listInstance = new doublyLinkedList();

    public static void parseInput(String fileName)
    {


        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            line = bufferedReader.readLine();

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

        String[] lineArray = line.split(" ");
        String[] charArray = line.split("");

        for(int i=0;i<lineArray.length;i++)
        {
            for(int k=0;i<lineArray[i].length();k++) {


                if (Character.isDigit(lineArray[i].charAt(k)))
                {
                    String append = "";
                    int insert = 0;
                    StringBuilder sb = new StringBuilder();
                    while(Character.isDigit(lineArray[i].charAt(k)))
                    {
                        sb.append(k);
                        if( Character.isDigit(lineArray[i].charAt(k+1)))
                        {
                            sb.append(k+1);
                        }

                        append = (sb.toString());
                    }

                }
            }
        }


    }

    public Node addAtStart(int data){
        System.out.println("Adding Node " + data + " at the start");
        Node n = new Node(data);
        if(size==0){
            head = n;
            tail = n;
        }else{
            n.next = head;
            head.previous = n;
            head = n;
        }
        size++;
        return n;
    }

    public Node addAtEnd(int data){
        System.out.println("Adding Node " + data + " at the End");
        Node n = new Node(data);
        if(size==0){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            n.previous = tail;
            tail =n;
        }
        size++;
        return n;
    }

    public Node addAfter(int data, Node prevNode){
        if(prevNode==null){
            System.out.println("Node after which new node to be added cannot be null");
            return null;
        }else if(prevNode==tail){//check if it a last node
            return addAtEnd(data);
        }else{
            System.out.println("Adding node after "+ prevNode.data);
            //create a new node
            Node n = new Node(data);

            //store the next node of prevNode
            Node nextNode = prevNode.next;

            //make new node next points to prevNode
            n.next = nextNode;

            //make prevNode next points to new Node
            prevNode.next = n;

            //make nextNode previous points to new node
            nextNode.previous = n;

            //make  new Node previous points to prevNode
            n.previous = prevNode;
            size++;
            return n;
        }
    }




    public int elementAt(int index){
        if(index>size){
            return -1;
        }
        Node n = head;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n.data;
    }

    //get Size
    public int getSize(){
        return size;
    }

    public void print(){
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while(temp!=null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}


