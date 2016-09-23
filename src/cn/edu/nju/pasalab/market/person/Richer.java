package cn.edu.nju.pasalab.market.person;

import cn.edu.nju.pasalab.market.Factory;
import cn.edu.nju.pasalab.market.Market;
import cn.edu.nju.pasalab.market.goods.Goods;
import cn.edu.nju.pasalab.market.voucher.Voucher;

import java.util.List;

public class Richer extends Person {
  private final List<Voucher> voucherList;
  private final Factory factory;
  private final int money;

  public Richer(Market market, List<Voucher> voucherList, Factory factory, int money) {
    super(market);
    this.voucherList = voucherList;
    this.factory = factory;
    this.money = money;
  }

  @Override
  public void shopping() {
    int total = 0;
    for (Voucher voucher : voucherList) {
      Goods goods = getMarket().exchange(voucher);
      if (goods != null) {
        total += goods.getPrice();
      }
    }
    Goods goods = factory.buy(money, 0);
    if (goods != null) {
      total += goods.getPrice();
    }
    System.out.println(String.format("Total price %d", total));
  }
}
