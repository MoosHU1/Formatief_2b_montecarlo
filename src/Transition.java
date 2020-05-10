import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Transition {

    private Node currentNode;

    public Transition(){

    }

    public void run (Node currentNode, HashMap<Node, List<Node>> con) {
        System.out.println(currentNode.getNaam());
        while (1==1) {

            List<Node> potentialNext = con.get(currentNode);
            Random rand = new Random();
            int index = rand.nextInt(potentialNext.size());
            Node nextNode = potentialNext.get(index);
            if ((potentialNext.get(index).getNaam()).matches("dobbel(.*)")) {
                System.out.println(nextNode.getNaam());
                break;
            }
            System.out.println(nextNode.getNaam());
            currentNode = nextNode;

            }
        }
    }


