package cn.edu.nju.pasalab.market;

import cn.edu.nju.pasalab.market.person.Person;
import cn.edu.nju.pasalab.market.person.Richer;
import cn.edu.nju.pasalab.market.person.Student;
import cn.edu.nju.pasalab.market.person.Child;
import cn.edu.nju.pasalab.market.voucher.Voucher;

import java.util.ArrayList;
import java.util.List;

public class App {
  private static Market market = Market.getInstance();
  private static Factory factory = Factory.getInstance();

  public static void main(String[] args) {
    Person a = newChild();
    a.shopping();
    Person b = newStudent();
    b.shopping();
    Person c = newRicher();
    c.shopping();
  }

  public static Person newChild() {
    return new Child(market, Voucher.Factory.newVoucher());
  }

  private static Person newStudent() {
    return new Student(market, Voucher.Factory.newVoucher(), Voucher.Factory.newVoucher());
  }

  private static Person newRicher() {
    List<Voucher> lst = new ArrayList<>();
    for (int i = 0; i != 100; ++i) {
      lst.add(Voucher.Factory.newVoucher());
    }
    return new Richer(market, lst, factory, 10000000);
  }
}
