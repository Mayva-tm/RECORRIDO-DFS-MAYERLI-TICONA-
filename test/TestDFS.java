package test;
import data.structure.Graph;
public class TestDFS {
    static void testDFS() {
        Graph graph = new Graph(false);
        graph.readFileInput("test3.txt");
        graph.DFSrecorrido();
        graph.printGraph1();
        /*boolean isConnected = graph.isConnected();
        System.out.println("Es connectado: " + isConnected);
        System.out.println("Componentes conectados: " + graph.getComponentConnected());*/
    }

    public static void main(String[] args) {

       testDFS();

    }
    
}
