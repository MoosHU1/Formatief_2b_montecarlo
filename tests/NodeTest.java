import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getNaam() {
        Node nodeTest = new Node("nodeTest");
        assertEquals("nodeTest", nodeTest.getNaam());
    }
}