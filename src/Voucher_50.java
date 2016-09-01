public class Voucher_50 implements Voucher {
  @Override
  public Goods exchange() {
    return new Bag();
  }
}
