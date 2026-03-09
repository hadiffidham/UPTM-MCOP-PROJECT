import java.util.*;

public class UPTMMarketingOptimization {

    //Cost Matrix (Adjacency Matrix)
    static int [] [] costMatrix = {
            {0, 15, 25, 35},
            {15, 0, 30, 28},
            {25, 30, 0, 20},
            {35, 28, 20, 0}
    };

    //Location names
    static String[] locations = {"UPTM", "City B", "City C", "City D"};

    //Greedy TSP
    public static String greedyMCOP (int [][] dist){
        //TO BE IMPLEMENTED : Greedy Algorithm logic
        //Write your code here
        return "";
    }//end of a static method

    //Dynamic Programming TSP
    public static String dynamicProgrammingMCOP (int [][] dist){
        //TO BE IMPLEMENTED : dynamic programming algorithm logic
        //Write your code here
        return "";
    }//end of static method

    /* private static int dynamicProgrammingMCOPHelper(int pos, int mask, int [][] dist, int[][] memo, int VISITED_ALL, String [][] paths ){
        //TO BE IMPLEMENTED : private recursive method for dynamic
        //programming algorithm logic
        //Write your code here
        return "";
    }//end of a static method */

    // Backtracking TSP
    public static String backtrackingMCOP(int [][] dist){
        //TO BE IMPLEMENTED : backtracking algorithm logic
        //Write your code here
        return "";
    }//end of a static method

    /* private static int mcopBacktracking(int pos, int[][] dist,
                                        boolean[] visited,int n, int count, int cost, StringBuilder path)
    {
        // TO BE IMPLEMENTED: private recursive method for Backtracking
        // Algorithm logic
        // Write your code here
    }//end of a static method */

    // Divide and Conquer TSP
    public static String divideAndConquerMCOP(int[][] dist)
    {
        // TO BE IMPLEMENTED: Divide and Conquer Algorithm logic
        // Write your code here
        return "";
    }//end of a static method

    /* private static int divideAndConquerHelper(int pos, boolean[] visited,int currentCost, int[][] dist, int n, StringBuilder path)
    {
        // TO BE IMPLEMENTED: private recursive method for Divide and Conquer Algorithm logic
        // Write your code here
    }//end of a static method */

    /* private static boolean allVisited(boolean[] visited)
    {
        // TO BE IMPLEMENTED: to test whether all cities have been
        // visited Write your code here
    }//end of a static method */

    // Insertion Sort
    public static String insertionSort(int[] arr)
    {
        // TO BE IMPLEMENTED: Insertion Sort Algorithm logic
        // Write your code here
        return "";
    }//end of a static method

    // Binary Search
    public static String binarySearch(int[] arr, int target)
    {
        // TO BE IMPLEMENTED: Binary Search Algorithm logic
        // Write your code here
        return "";
    }//end of a static method

    // Min-Heap
    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    {
        // TO BE IMPLEMENTED: Heap Algorithm logic
        // Write your code here
    }//end of a static method
    // Splay Tree
    static class SplayTree
    {
        // TO BE IMPLEMENTED: Splay Tree Algorithm logic
        // Write your code here
    }//end of a static method
    // Driver method
    /* public static void main(String[] args)
    {
        System.out.println(greedyMCOP(costMatrix));
        System.out.println(dynamicProgrammingMCOP(costMatrix));
        System.out.println(backtrackingMCOP(costMatrix));
        System.out.println(divideAndConquerMCOP(costMatrix));
        // Sorting and Searching
        int[] arr = {8, 3, 5, 1, 9, 2};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Binary Search (5 found at index): " +
                binarySearch(arr, 5));
        // Min-Heap Test
        MinHeap heap = new MinHeap();
        heap.insert(10);
        heap.insert(3);
        heap.insert(15);
        System.out.println("Min-Heap Extract Min: " + heap.extractMin());
        // Splay Tree Test
        SplayTree tree = new SplayTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        System.out.println("Splay Tree Search (10 found): " + tree.search(10);
    } */
}
