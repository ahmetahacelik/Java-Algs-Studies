import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  The {@code q4} class represents a bag (or multiset) of 
 *  generic items. It supports insertion and iterating over the 
 *  items in arbitrary order.
 *  <p>
 *  This implementation uses a singly linked list with a non-static nested class Node.
 *  See {@link Bag} for a version that uses a static nested class.
 *  The <em>add</em>, <em>isEmpty</em>, and <em>size</em> operations
 *  take constant time. Iteration takes time proportional to the number of items.
 *  <p>
 *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */

public class q4<Item>
{
    private Node first;    // beginning of bag
    private int n;         // number of elements in bag

    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * Initializes an empty bag.
     */
    public q4() {
        first = null;
        n = 0;
    }

    /**
     * Is this bag empty?
     * @return true if this bag is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this bag.
     * @return the number of items in this bag
     */
    public int size() {
        return n;
    }

    /**
     * Adds the item to this bag.
     * @param item the item to add to this bag
     */
    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
    
    public void print(){
      Node current = first;
      System.out.println("the content of the linked list are:");
      while(current != null){
         System.out.print(current.item + "\t");
         current = current.next;
      }
      System.out.println("");
    }

    public q4<Item> deleteNth(int i){
      if (first==null){
            System.out.println("");}
      else if (i==0){
          first=first.next;
      }
      else {
          
          Node n=first;
          for (int j=0;j<i-1;j++){
              n=n.next;
              
          }
          n.next=n.next.next;
      }
        return this;
    }
    public static void main(String args[]){
      q4<String> bag = new q4<String>();
      int n = 5;
      
      for(int i = 5; i > 0; i--)
        bag.add("entry " + Integer.toString(i-1));
      
      bag.print();
      q4<String> bag2 = bag.deleteNth(2);
      bag2.print();
      
      // what should be the output of the line below ?
      System.out.println(bag == bag2);
    }
}
