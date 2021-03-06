import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class FSM {

    private Node currentNode;

    public FSM(){

    }

    public String run (Node currentNode, HashMap<Node, List<Node>> con) {
        System.out.println(currentNode.getNaam());
        while (1==1) {

            List<Node> potentialNext = con.get(currentNode);
            Random rand = new Random();
            int index = rand.nextInt(potentialNext.size());
            //De volgende state wordt één van de twee mogelijk volgende met een 50/50 kans
            Node nextNode = potentialNext.get(index);
            //Als de huidige staat begint met dobbel is er een uitkomst, deze wordt geprint en de fsm stopt
            if ((potentialNext.get(index).getNaam()).matches("dobbel(.*)")) {
                return nextNode.getNaam();

            }
            System.out.println(nextNode.getNaam());
            currentNode = nextNode;


            }
        }
    }


