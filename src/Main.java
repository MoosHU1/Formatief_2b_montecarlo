import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node s4 = new Node("s4");
        Node s5 = new Node("s5");
        Node s6 = new Node("s6");

        Node dobbel1 = new Node("dobbel1");
        Node dobbel2 = new Node("dobbel2");
        Node dobbel3 = new Node("dobbel3");
        Node dobbel4 = new Node("dobbel4");
        Node dobbel5 = new Node("dobbel5");
        Node dobbel6 = new Node("dobbel6");
        

        //Mogelijk volgende state na state x
        List<Node> next0 = new ArrayList<Node>();
        next0.add(s1);
        next0.add(s2);
        List<Node> next1 = new ArrayList<Node>();
        next1.add(s3);
        next1.add(s4);
        List<Node> next2 = new ArrayList<Node>();
        next2.add(s5);
        next2.add(s6);

        List<Node> next3 = new ArrayList<Node>();
        next3.add(s1);
        next3.add(dobbel1);
        List<Node> next4 = new ArrayList<Node>();
        next4.add(dobbel2);
        next4.add(dobbel3);
        List<Node> next5 = new ArrayList<Node>();
        next5.add(dobbel4);
        next5.add(dobbel5);
        List<Node> next6 = new ArrayList<Node>();
        next6.add(dobbel6);
        next6.add(s2);


        //Staat wordt gekoppeld aan mogelijk volgende opties
        HashMap<Node, List<Node>> connecties = new HashMap<>();
        connecties.put(s0,next0);
        connecties.put(s1,next1);
        connecties.put(s2,next2);
        connecties.put(s3,next3);
        connecties.put(s4,next4);
        connecties.put(s5,next5);
        connecties.put(s6,next6);

        FSM montecarlo = new FSM();

        System.out.println(montecarlo.run(s0, connecties));
    }
}
