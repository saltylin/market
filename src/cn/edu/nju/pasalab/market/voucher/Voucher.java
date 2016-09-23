package cn.edu.nju.pasalab.market.voucher;

public interface Voucher {
  int getValue();

  class Factory {
    private Factory() {}

    public static Voucher newVoucher() {
      return new Voucher_50();
    }
  }
}
