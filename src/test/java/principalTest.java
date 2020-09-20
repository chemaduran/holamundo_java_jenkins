import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class principalTest {

  @Test
  public void testHelloWorld() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    principal.main(null);

    // assertion
    assertEquals("Hola mundo!", bos.toString().replace("\n", ""));

    // undo the binding in System
    System.setOut(originalOut);
  }
}