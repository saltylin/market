package cn.edu.nju.pasalab.market;

import cn.edu.nju.pasalab.market.goods.Goods;
import cn.edu.nju.pasalab.market.voucher.Voucher;

import java.util.List;

public class Market {
  private final List<Goods> goodsList;
  private static final Market INSTANCE;

  static {
    INSTANCE = new Market(new GoodsProducer().produceGoods());
  }

  public static Market getInstance() {
    return INSTANCE;
  }

  private Market(List<Goods> goodsList) {
    this.goodsList = goodsList;
  }

  public synchronized Goods exchange(Voucher voucher) {
    if (goodsList.isEmpty()) {
      return null;
    }
    int randomIndex = (int) (Math.random() * goodsList.size());
    Goods goods = goodsList.get(randomIndex);
    if (voucher.getValue() >= goods.getPrice()) {
      goodsList.remove(randomIndex);
      return goods;
    }
    return null;
  }
}
