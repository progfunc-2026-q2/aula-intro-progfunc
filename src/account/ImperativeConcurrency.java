package account;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ImperativeConcurrency {
  private int balance = 0;

  public synchronized void deposit(int amount) // with synchronization
  // public void deposit(int amount) // without synchronization (not thread-safe)
  {
    this.balance += amount;
  }

  public static void main(String[] args) throws InterruptedException {
    ImperativeConcurrency account = new ImperativeConcurrency();
    ExecutorService executor = Executors.newFixedThreadPool(10);

    // 10 threads adding 1000 deposits to the shared balance
    for (int i = 0; i < 10; i++) {
      executor.submit(() -> {
        for (int j = 0; j < 1000; j++) {
          account.deposit(1);
        }
      });
    }

    executor.shutdown();
    executor.awaitTermination(1, TimeUnit.SECONDS);
    System.out.println("Final Balance (Imperative): " + account.balance);
  }
}