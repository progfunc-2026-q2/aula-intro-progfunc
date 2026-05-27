package account;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class FunctionalConcurrency {
  public static void main(String[] args) {
    // Create an immutable list of transactions (10,000 deposits of 1)
    List<Integer> transactions = new ArrayList<>(Collections.nCopies(10000, 1));

    // .parallelStream() automatically handles data partitioning across cores safely
    int finalBalance = transactions.parallelStream().reduce(0, (acc, amount) -> acc + amount);

    System.out.println("Final Balance (Functional): " + finalBalance);
  }
}