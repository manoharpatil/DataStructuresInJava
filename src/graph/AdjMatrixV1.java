package graph;

// Implementation of Adjacency Matrix

public class AdjMatrixV1 {

    static final int V = 5;

    public static void main(String[] args) {
        int[][] adjMatrix = new int[V][V];

        AdjMatrixV1 obj = new AdjMatrixV1();

        System.out.println("Adding Edge From 0 to 1");
        obj.addEdge(adjMatrix, 0, 1);
        System.out.println("Adding Edge From 0 to 2");
        obj.addEdge(adjMatrix, 0, 2);
        System.out.println("Adding Edge From 0 to 3");
        obj.addEdge(adjMatrix, 0, 3);
        System.out.println("Adding Edge From 1 to 3");
        obj.addEdge(adjMatrix, 1, 3);
        System.out.println("Adding Edge From 1 to 4");
        obj.addEdge(adjMatrix, 1, 4);
        System.out.println("Adding Edge From 2 to 3");
        obj.addEdge(adjMatrix, 2, 3);
        System.out.println("Adding Edge From 3 to 4");
        obj.addEdge(adjMatrix, 3, 4);

        System.out.println("Adjacency Matrix Representation of the Graph: ");
        obj.printAdjMatrix(adjMatrix);
    }

    public void addEdge(int[][] arr, int src, int dest) {
        arr[src][dest] = 1;
    }

    public int hasEdge(int[][] arr, int src, int dest) {
        if (arr[src][dest] == 1)
            return 1;

        return 0;
    }

    public void removeEdge(int[][] arr, int src, int dest) {
        arr[src][dest] = 0;
    }

    public void printAdjMatrix(int[][] arr) {

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



