package net.greg.examples.salient.errorhandling;

public class Delegate extends Base {

  public void anyMethod() { // throws RuntimeException {

    System.err.println("ENTER Delegate.anyMethod()");

    try {

      super.anyMethod();
    }
    //*
    catch (Throwable e) {

      System.err.println(
        "\n\n" + RED + "Stacktrace: " + NC +
        "\nThe name of this class: Delegate" +
        "\nException-origin class: " +
        getClass().getSimpleName() + "\n");

      e.printStackTrace();
    }
    //*/
    finally {

      System.err.println(
        GRN + "\n\nfinally block, Delegate" + NC +
        "\nCurrent class: " + GRN + "Delegate" + NC +
        "\nReport  class: " + GRN +
          getClass().getSimpleName() + NC + "\n");
    }
  }

  public static final String NC = "\u001B[0m";
  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
}
