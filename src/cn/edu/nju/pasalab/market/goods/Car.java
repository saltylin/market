package cn.edu.nju.pasalab.market.goods;

public class Car extends Goods {
  private final int price;

  public Car(int price) {
    this.price = price;
  }

  @Override
  public int getPrice() {
    return price;
  }
}
