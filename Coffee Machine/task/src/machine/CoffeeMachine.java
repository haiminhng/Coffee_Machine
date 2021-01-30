package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner input = new Scanner(System.in);
    public static Supplies _mngt = new Supplies();
    public static void main(String[] args) {
        int _choice;
        String _choice2;
        boolean _loopcontrol = true;
        /*
        System.out.println("Write how many ml of water the coffee machine has:");
        _mngt.set_water(input.nextInt());
        System.out.println("Write how many ml of milk the coffee machine has:");
        _mngt.set_milk(input.nextInt());
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        _mngt.set_beans(input.nextInt());
        System.out.println("Write how many cups of coffee you will need:");
        _mngt.set_countofcups(input.nextInt());
        System.out.println(_mngt.makecoffee(_mngt.get_water(),
                                            _mngt.get_milk(),
                                            _mngt.get_beans(),
                                            _mngt.get_countofcups()));
        */
        _mngt.set_water(400);
        _mngt.set_coffeebeans(120);
        _mngt.set_milk(540);
        _mngt.set_disposable(9);
        _mngt.set_money(550);
        //_mngt.mInfo();
        while(_loopcontrol) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            _choice2 = input.next();
            switch (_choice2) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    _choice2 = input.next();
                    _mngt.mBuy(_choice2);
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: \n");
                    _choice = input.nextInt();
                    _mngt.set_water(_choice += _mngt.get_water());
                    System.out.println("Write how many ml of milk do you want to add: \n");
                    _choice = input.nextInt();
                    _mngt.set_milk(_choice += _mngt.get_milk());
                    System.out.println("Write how many grams of coffee beans do you want to add: \n");
                    _choice = input.nextInt();
                    _mngt.set_coffeebeans(_choice += _mngt.get_coffeebeans());
                    System.out.println("Write how many disposable cups of coffee do you want to add: \n");
                    _choice = input.nextInt();
                    _mngt.set_disposable(_choice += _mngt.get_disposable());
                    break;
                case "take":
                    _mngt.mTake();
                    break;
                case "remaining":
                    _mngt.mInfo();
                    break;
                case "exit":
                    _loopcontrol = false;
                    break;
                default:
                    break;
            }
        }
    }
}
