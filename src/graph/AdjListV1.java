package graph;

// Implementation of Adjacency List

class NodeV1 {
    int data;
    NodeV1 next;
}

public class AdjListV1 {
    static final int V = 5;
    NodeV1[] adjList = new NodeV1[V];

    public static void main(String[] args) {
        AdjListV1 obj = new AdjListV1();

        System.out.println("Adding Edge From 0 to 1");
        obj.addEdge(0, 1);
        System.out.println("Adding Edge From 0 to 2");
        obj.addEdge(0, 2);
        System.out.println("Adding Edge From 0 to 3");
        obj.addEdge(0, 3);
        System.out.println("Adding Edge From 1 to 3");
        obj.addEdge(1, 3);
        System.out.println("Adding Edge From 1 to 4");
        obj.addEdge(1, 4);
        System.out.println("Adding Edge From 2 to 3");
        obj.addEdge(2, 3);
        System.out.println("Adding Edge From 3 to 4");
        obj.addEdge(3, 4);

        System.out.println("Adjacency List Representation of the Graph");
        obj.printGraph();
    }

    public void addEdge(int src, int dest) {
        NodeV1 newNode = new NodeV1();
        newNode.data = dest;
        newNode.next = null;

        if (adjList[src] == null)
            adjList[src] = newNode;
        else {
            NodeV1 last = adjList[src];

            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;

        }
    }

    public void printGraph() {
        int i;

        for (i = 0; i < V; i++) {
            NodeV1 temp = adjList[i];

            System.out.print("adjList[" + i + "]->");

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
