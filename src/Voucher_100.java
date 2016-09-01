public class Voucher_100 implements Voucher {
  @Override
  public Goods exchange() {
    return new Watch();
  }
}
