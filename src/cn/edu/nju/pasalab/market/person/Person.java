package cn.edu.nju.pasalab.market.person;

import cn.edu.nju.pasalab.market.Market;

public abstract class Person {
  private final Market market;

  public Person(Market market) {
    this.market = market;
  }

  public void shopping() {
    System.out.println("I'm shopping");
  }

  protected Market getMarket() {
    return market;
  }
}
