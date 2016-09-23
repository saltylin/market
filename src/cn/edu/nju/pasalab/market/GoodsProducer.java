package cn.edu.nju.pasalab.market;

import cn.edu.nju.pasalab.market.goods.Bag;
import cn.edu.nju.pasalab.market.goods.Goods;
import cn.edu.nju.pasalab.market.goods.Watch;

import java.util.ArrayList;
import java.util.List;

public final class GoodsProducer {
  public GoodsProducer() {}

  public List<Goods> produceGoods() {
    List<Goods> ret = new ArrayList<>();
    for (int i = 0; i != 1000; ++i) {
      ret.add(new Bag());
    }
    for (int i = 0; i != 100; ++i) {
      ret.add(new Watch());
    }
    return ret;
  }
}
