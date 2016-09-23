package cn.edu.nju.pasalab.market.person;

import cn.edu.nju.pasalab.market.Market;
import cn.edu.nju.pasalab.market.goods.Goods;
import cn.edu.nju.pasalab.market.voucher.Voucher;

public class Child extends Person {
  private final Voucher voucher;

  public Child(Market market, Voucher voucher) {
    super(market);
    this.voucher = voucher;
  }

  @Override
  public void shopping() {
    super.shopping();
    Goods goods = getMarket().exchange(voucher);
    int price = 0;
    if (goods != null) {
      price = goods.getPrice();
    }
    System.out.println(String.format("The price of the exchanged goods is %d", price));
  }
}
