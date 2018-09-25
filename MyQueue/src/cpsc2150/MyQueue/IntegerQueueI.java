//Clare DuVal and Jonathan Ayala
//CPSC 2151 Sec 002
//Lab 4

package cpsc2150.MyQueue;

/**
 * A queue containing integers.
 * A queue is a data structure where the first item added to the
 structure is the first item removed from the structure
 * This queue is bounded by MAX_DEPTH
 *
 * Initialization ensures the queue is empty
 * Defines: size:Z
 * Constraints: 0 <= size <= MAX_DEPTH
 */
public interface IntegerQueueI {
    int MAX_DEPTH = 100;

    // Adds x to the end of the Queue

    /**
     *
     * @param x an integer that is added to the queue
     *
     * @pre [ x is a valid integer]
     * @post [ places Integer x into the end of the queue ]
     */
    public void add(Integer x);

    //removes and returns the Integer at the front of the queue

    /**
     *
     * @return  returns Integer from the front of the queue
     * @post [returns Integer from the front of the queue and removes it from the queue ]
     */
    public Integer pop();

    //returns the number of Integers in the Queue

    /**
     *
     * @return returns the number of Integers in the queue
     * @post [returns a valid integer size]
     */
    public int size();
}

