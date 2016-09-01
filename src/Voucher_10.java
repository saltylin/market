public class Voucher_10 implements Voucher {
  @Override
  public Goods exchange() {
    return new Apple();
  }
}
