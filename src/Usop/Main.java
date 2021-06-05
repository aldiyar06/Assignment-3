package Usop;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>();

        graph.addEdge("Almaty", "Astana");
        graph.addEdge("Almaty", "Shymkent");
        graph.addEdge("Shymkent", "Astana");
        graph.addEdge("Shymkent", "Kyzylorda");
        graph.addEdge("Astana", "Kostanay");

        for (String v : graph.adj()){
            System.out.println(v);
        }

        System.out.println(graph.getEdgesCount());
        System.out.println(graph.getVerticesCount());
        System.out.println(graph.hasEdge("Almaty", "Astana"));
        System.out.println(graph.hasVertex("Atyrau"));



    }
}
