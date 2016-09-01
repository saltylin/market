import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      throw new IllegalArgumentException("Usage: java Main <name>");
    }
    Person person = giveMeAPerson(args[0]);
    int costedMoney = person.shopping();
    System.out.println(costedMoney);
  }

  public static Person giveMeAPerson(String name) {
    switch (name) {
      case "Child":
        return new Child(new Voucher_10());
      case "Student":
        return new Student(new Voucher_10(), new Voucher_50());
      case "Richer":
        List<Voucher> voucherList = new ArrayList<>();
        voucherList.add(new Voucher_10());
        voucherList.add(new Voucher_100());
        return new Richer(voucherList);
      default:
        throw new IllegalArgumentException("No corresponding person name");
    }
  }
}
