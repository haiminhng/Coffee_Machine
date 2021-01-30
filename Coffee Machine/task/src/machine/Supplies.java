package machine;

public class Supplies {
    private int _milk;
    private int _water;
    private int _coffeebeans;
    //private int _countofcups;
    private int _disposable;
    private int _money;

    public int get_disposable() {
        return _disposable;
    }

    public void set_disposable(int _disposable) {
        this._disposable = _disposable;
    }

    public int get_money() {
        return _money;
    }

    public void set_money(int _money) {
        this._money = _money;
    }

    public int get_milk() {
        return _milk;
    }

    public void set_milk(int _milk) {
        this._milk = _milk;
    }

    public int get_water() {
        return _water;
    }

    public void set_water(int _water) {
        this._water = _water;
    }

    public int get_coffeebeans() {
        return _coffeebeans;
    }

    public void set_coffeebeans(int _coffeebeans) {
        this._coffeebeans = _coffeebeans;
    }
    /*
    public int get_countofcups() {
        return _countofcups;
    }

    public void set_countofcups(int _countofcups) {
        this._countofcups = _countofcups;
    }
    /*
    public String makecoffee(int _inputwater, int _inputmilk,int _inputbeans,int _inputcountofcups){
        _inputwater = _inputwater/200;
        _inputmilk = _inputmilk/50;
        _inputbeans = _inputbeans/15;
        int _possiblecup = Math.min(_inputwater,Math.min(_inputmilk,_inputbeans));
        //compare 3 object
        int _remain = _possiblecup - _inputcountofcups;
        String _return = "null";
        if(_inputcountofcups < _possiblecup){
            _return = "Yes, I can make that amount of coffee (and even "+ _remain +" more than that)";
        }
        if(_inputcountofcups % _possiblecup == 0) {
            _return = "Yes, I can make that amount of coffee\n";
        }
        if(_inputcountofcups > _possiblecup){
            _return = "No, I can make only " + _possiblecup + " cup(s) of coffee\n";
        }
            return _return;
    }
    */
    public void mInfo(){
        System.out.println("The coffee machine has:");
        System.out.println(get_water() + " of water");
        System.out.println(get_milk() + " of milk");
        System.out.println(get_coffeebeans() + " of coffee beans");
        System.out.println(get_disposable() + " of disposable cups");
        System.out.println("$" + get_money() + " of money \n");
    }
    public void mBuy(String _choice){
         switch(_choice){
            case "1"://espresso
                if(_water > 250 && _coffeebeans >16){
                    _water = _water - 250;
                    _coffeebeans = _coffeebeans - 16;
                    _money = _money + 4;
                    _disposable = _disposable -1;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                else if(_water < 250){
                    System.out.println("Sorry, not enough water!\n");
                }
                else if(_coffeebeans < 16){
                    System.out.println("Sorry, not enough coffee beans!\n");
                }
                break;
            case "2"://latte
                if(_water > 350 && _milk > 75 && _coffeebeans >20){
                    _water = _water - 350;
                    _milk = _milk - 75;
                    _coffeebeans = _coffeebeans - 20;
                    _money = _money + 7;
                    _disposable = _disposable -1;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                else if(_water < 350){
                    System.out.println("Sorry, not enough water!\n");
                }
                else if(_coffeebeans < 20){
                    System.out.println("Sorry, not enough coffee beans!\n");
                }
                else if(_milk < 75){
                    System.out.println("Sorry, not enough milk!\n");
                }
                break;
            case "3"://cappuccino
                if(_water > 200 && _milk > 100 && _coffeebeans >12){
                    _water = _water - 200;
                    _milk = _milk - 100;
                    _coffeebeans = _coffeebeans - 12;
                    _money = _money + 6;
                    _disposable = _disposable -1;
                    System.out.println("I have enough resources, making you a coffee!\n");
                }
                else if(_water < 200){
                    System.out.println("Sorry, not enough water!\n");
                }
                else if(_coffeebeans < 12){
                    System.out.println("Sorry, not enough coffee beans!\n");
                }
                else if(_milk < 100){
                    System.out.println("Sorry, not enough milk!\n");
                }
                break;
             case "back":
                 break;
            default:
                System.out.println("Options not available");
                break;
        }
    }
    public void mTake(){
        System.out.println("I gave you $"+_money);
        _money = 0;
    }
}
