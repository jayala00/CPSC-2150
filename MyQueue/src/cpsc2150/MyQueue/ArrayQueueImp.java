//Clare DuVal and Jonathan Ayala
//CPSC 2151 Sec 002
//Lab 4

package cpsc2150.MyQueue;

    /**
     * Correspondence: this = myQ[0...depth-1], myQ[0] is the front
     of the Queue
     * Correspondence: size = depth
     *
     * @invariant: 0 <= depth <= MAX_DEPTH
     */
    public class ArrayQueueImp implements IntegerQueueI {
        private Integer[] myQ;
        private int depth;

        // constructor class makes the array empty

        /**
         * @return returns an array myQ with allocated size MAX_DEPTH
         * @post [returns an array myQ capable of storing MAX_DEPTH amount of Integers]
         */
        public ArrayQueueImp()
        {
            myQ = new Integer[MAX_DEPTH];
            depth = -1;
        }

        public void add(Integer x)
        {
            myQ[depth++] = x;

        }

        public Integer pop()
        {
            Integer x = myQ[depth];
            depth--;
            return x;


        }

        public int size()
        {
            int size = depth;
            return size;
        }



    }

