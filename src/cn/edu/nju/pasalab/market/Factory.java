package cn.edu.nju.pasalab.market;

import cn.edu.nju.pasalab.market.goods.Car;
import cn.edu.nju.pasalab.market.goods.Goods;

public class Factory {
  private final Goods[] goods;
  private static final Factory INSTANCE;

  static {
    INSTANCE = new Factory();
  }

  public static Factory getInstance() {
    return INSTANCE;
  }

  public synchronized Goods buy(int price, int index) {
    if (index >= 100 || index < 0) {
      return null;
    }
    if (goods[index] == null) {
      return null;
    }
    Goods ret = null;
    if (price >= goods[index].getPrice()) {
      ret = goods[index];
      goods[index] = null;
    }
    return ret;
  }

  private Factory() {
    goods = new Car[100];
    for (int i = 0; i != 100; ++i) {
      goods[i] = new Car(100000 + i * 1000);
    }
  }
}
