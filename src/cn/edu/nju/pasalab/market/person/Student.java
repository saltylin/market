package cn.edu.nju.pasalab.market.person;

import cn.edu.nju.pasalab.market.Market;
import cn.edu.nju.pasalab.market.voucher.Voucher;
import cn.edu.nju.pasalab.market.goods.Goods;

public class Student extends Person {
  private final Voucher voucherA;
  private final Voucher voucherB;

  public Student(Market market, Voucher voucherA, Voucher voucherB) {
    super(market);
    this.voucherA = voucherA;
    this.voucherB = voucherB;
  }

  @Override
  public void shopping() {
    super.shopping();
    Market market = getMarket();
    Goods goodsA = market.exchange(voucherA);
    Goods goodsB = market.exchange(voucherB);
    int price = 0;
    if (goodsA != null) {
      price += goodsA.getPrice();
    }
    if (goodsB != null) {
      price += goodsB.getPrice();
    }
    System.out.println(String.format("The price of the exchanged goods is %d", price));
  }
}
