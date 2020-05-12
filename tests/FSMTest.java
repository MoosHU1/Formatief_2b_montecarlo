import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {

    @Test
    void run() {
        Node s2 = new Node("s2");
        Node s6 = new Node("s6");
        Node dobbel6 = new Node("dobbel6");

        List<Node> next6 = new ArrayList<Node>();
        next6.add(dobbel6);

        HashMap<Node, List<Node>> connecties = new HashMap<>();
        connecties.put(s6,next6);

        FSM montecarlo = new FSM();
        montecarlo.run(s6, connecties);

        assertEquals("dobbel6", (montecarlo.run(s6,connecties)));

    }
}