public class Student extends Person {
  private final Voucher voucherA;
  private final Voucher voucherB;

  public Student(Voucher voucherA, Voucher voucherB) {
    this.voucherA = voucherA;
    this.voucherB = voucherB;
  }

  @Override
  public int shopping() {
    Goods goodsA = voucherA.exchange();
    Goods goodsB = voucherB.exchange();
    int priceA = goodsA.getPrice();
    int priceB = goodsB.getPrice();
    return priceA + priceB;
  }
}
