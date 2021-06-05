package Naruto;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<Test> graph = new WeightedGraph<>(true);

        Test a = new Test("A");
        Test b = new Test("B");
        Test c = new Test("C");
        Test d = new Test("D");

        graph.addEdge(a, b, 8);
        graph.addEdge(a, c, 1);
        graph.addEdge(a, d, 4);
        graph.addEdge(c, d, 5);


        d.setValue("S");

        for (Test st : graph.adjacencyList(a)){
            System.out.println(st);
        }



        System.out.println();

        for (Test st : graph.adjacencyList(c)){
            System.out.println(st);
        }

        // D -> S



        /*

        System.out.println("Dijkstra: ");
        Search<String> djk = new DijkstraSearch<>(graph, "A");
        outputPath(djk, "B");
        System.out.println("BFS: ");
        Search<String> bfs = new BFS<>(graph, "A");
        outputPath(bfs, "B");*/
    }
    public static void outputPath(Search<String> search, String key) {
        LinkedList<String> path = (LinkedList<String>) search.pathTo(key);
        for (int i = 0; i + 1 < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println(path.get(path.size() - 1));
    }
}
