import java.util.*;

public class UPTMMarketingOptimization {

    //Cost Matrix (Adjacency Matrix)
    static int [][] costMatrix = {
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
    public static String dynamicProgrammingMCOP(int[][] dist) {
        int n = dist.length;
        int VISITED_ALL = (1 << n) - 1;
        int[][] memo = new int[n][1 << n];
        for (int[] row : memo) Arrays.fill(row, -1);

        int minCost = dynamicProgrammingMCOPHelper(0, 1, dist, memo, VISITED_ALL);

        return "Dynamic Programming Route: UPTM -> ... | Total Cost: " + minCost;
    }//end of static method

    private static int dynamicProgrammingMCOPHelper(int pos, int mask, int[][] dist, int[][] memo, int VISITED_ALL) {
        if (mask == VISITED_ALL) {
            return dist[pos][0]; // Balik ke UPTM
        }
        if (memo[pos][mask] != -1) {
            return memo[pos][mask];
        }

        int res = Integer.MAX_VALUE;
        for (int city = 0; city < dist.length; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = dist[pos][city] + dynamicProgrammingMCOPHelper(city, mask | (1 << city), dist, memo, VISITED_ALL);
                res = Math.min(res, newAns);
            }
        }
        return memo[pos][mask] = res;
    }//end of a static method

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
        for (int i = 1; i < arr.length; i++) {
            int iTemp = arr[i];
            int j;
            for (j = i - 1; j >= 0 && iTemp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = iTemp;
        }
        return "Insertion Sort Completed";
    }//end of a static method

    // Binary Search
    public static String binarySearch(int[] arr, int target)
    {
        int first = 0;
        int last = arr.length - 1;  // Use arr.length instead of n
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;

            if (arr[mid] == target)
                return "Found at index " + mid;
            else if (arr[mid] < target)
                first = mid + 1;
            else if (arr[mid] > target)
                last = mid - 1;
        }
        return "Not found";
    }//end of a static method

    // Min-Heap
    /*private PriorityQueue<Integer> heap = new PriorityQueue<>();
    {
        // TO BE IMPLEMENTED: Heap Algorithm logic
        // Write your code here
    }//end of a static method*/

    // Splay Tree
    static class SplayTree
    {
        // TO BE IMPLEMENTED: Splay Tree Algorithm logic
        // Write your code here
    }//end of a static method

    // Driver method
    public static void main(String[] args)
    {
        // TSP Algorithms - Only Dynamic Programming is uncommented
        // System.out.println(greedyMCOP(costMatrix));
        System.out.println(dynamicProgrammingMCOP(costMatrix));
        // System.out.println(backtrackingMCOP(costMatrix));
        // System.out.println(divideAndConquerMCOP(costMatrix));

        // Sorting and Searching
        int[] arr = {8, 3, 5, 1, 9, 2};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Binary Search (5 found at index): " + binarySearch(arr, 5));

        // Min-Heap Test - Commented out
        // MinHeap heap = new MinHeap();
        // heap.insert(10);
        // heap.insert(3);
        // heap.insert(15);
        // System.out.println("Min-Heap Extract Min: " + heap.extractMin());

        // Splay Tree Test - Commented out
        // SplayTree tree = new SplayTree();
        // tree.insert(20);
        // tree.insert(10);
        // tree.insert(30);
        // System.out.println("Splay Tree Search (10 found): " + tree.search(10));
    }
}
