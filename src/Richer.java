import java.util.List;

public class Richer extends Person {
  private final List<Voucher> voucherList;

  public Richer(List<Voucher> voucherList) {
    this.voucherList = voucherList;
  }

  @Override
  public int shopping() {
    int total = 0;
    for (Voucher voucher : voucherList) {
      total += voucher.exchange().getPrice();
    }
    return total;
  }
}
