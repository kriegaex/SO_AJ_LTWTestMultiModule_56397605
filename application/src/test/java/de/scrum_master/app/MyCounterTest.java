package de.scrum_master.app;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MyCounterTest {
  @Test
  public void testCount() {
    assertTrue(new MyCounter().aspectCalled());
  }
}
