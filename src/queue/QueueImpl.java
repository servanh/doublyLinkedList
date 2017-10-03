package Queue;
import DoublyLinkedList.DoublyLinkedList;
import DoublyLinkedList.DoublyLinkedDelete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Simple Circular Queue class implemented using functions in DoublyLinkedList.
 */
public class QueueImpl implements Queue {
    DoublyLinkedList l = DoublyLinkedList.listInstance;
    DoublyLinkedDelete d = new DoublyLinkedDelete();

    public static ArrayList<Integer> values = new ArrayList<Integer>();
    public static ArrayList<String> instructions = new ArrayList<String>();

    //Parses input and saves to parallel value and instruction arrayLists.
    @SuppressWarnings("Duplicates")
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
            System.out.println(line);

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

            for(int k=0;k<lineArray[i].length()-1;k++) {


                if(lineArray[i].length() < 3)
                {
                    i++;
                }
                if(lineArray[i].equals("del"))
                {
                    values.add(0);
                    instructions.add(lineArray[i]);
                    i++;
                }
                else if (Character.isDigit(lineArray[i].charAt(k)))
                {
                    String append = "";
                    int insert = 0;
                    StringBuilder sb = new StringBuilder();
                    while(Character.isDigit(lineArray[i].charAt(k)))
                    {
                        sb.append(lineArray[i].charAt(k));
                        k++;

                    }
                    append = (sb.toString());
                    insert = Integer.parseInt(append);
                    values.add(insert);

                }
                else if(Character.isAlphabetic(lineArray[i].charAt(k)))
                {
                    String append = "";
                    StringBuilder sb = new StringBuilder();
                    while(k<lineArray[i].length() &&  Character.isAlphabetic(lineArray[i].charAt(k)) )
                    {
                        sb.append(lineArray[i].charAt(k));
                        k++;

                    }
                    append = (sb.toString());
                    instructions.add(append);
                }
            }
        }



    }


    //runs parsed instructions
    public static void runInstructions()
    {
        QueueImpl q = new QueueImpl();
        for(int i=0;i<values.size();i++)
        {
            if(instructions.get(i).equals("in"))
            {
                q.enQueue(values.get(i));
            }
            else if(instructions.get(i).equals("del"))
            {
                q.deQueue();
            }

        }
    }
    @Override
    public void enQueue(int value) {
        l.addAtEnd(value);
    }

    @Override
    public void deQueue() {
        d.deleteFromStart();
    }

    @Override
    public void displayQueue() {
        l.print();
    }
}
