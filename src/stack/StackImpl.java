package Stack;
import DoublyLinkedList.DoublyLinkedList;
import DoublyLinkedList.DoublyLinkedDelete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StackImpl implements Stack {
    public DoublyLinkedList l = new DoublyLinkedList();
    public DoublyLinkedDelete d = new DoublyLinkedDelete();

    public static ArrayList<Integer> values = new ArrayList<Integer>();
    public static ArrayList<String> instructions = new ArrayList<String>();

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
                    k++;
                }
                if(lineArray[i].equals("pop"))
                {
                    values.add(0);
                    instructions.add(lineArray[i]);
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

    public static void runInstructions()
    {
       StackImpl s = new StackImpl();
        for(int i=0;i<values.size();i++)
        {
            if(instructions.get(i).equals("push"))
            {
                s.push(values.get(i));
            }
            else if(instructions.get(i).equals("pop"))
            {
                s.pop();
            }

        }
    }
    @Override
    public void push(int value)
    {
        l.addAtStart(value);
    }
    @Override
    public void pop()
    {
         d.deleteFromStart();
    }
    @Override
    public int size()
    {
        return l.getSize();
    }
    public void viewStack()
    {
        l.print();
    }

}
