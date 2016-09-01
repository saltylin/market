public class Child extends Person {
  private final Voucher voucher;

  public Child(Voucher voucher) {
    this.voucher = voucher;
  }

  @Override
  public int shopping() {
    Goods goods = voucher.exchange();
    return goods.getPrice();
  }
}
