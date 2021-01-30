import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String action = input.next();
        double a,b,c,r;
        switch(action){
            case "triangle":
                a = input.nextDouble();
                b = input.nextDouble();
                c = input.nextDouble();
                double p = (a + b + c) / 2;
                double areatriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(areatriangle);
            break;
            case "rectangle":
                a = input.nextDouble();
                b = input.nextDouble();
                double arearectangle = a * b  ;
                System.out.println(arearectangle);
                break;
            case "circle":
                r = input.nextDouble();
                double areacircle = (r * r) * 3.14;
                System.out.println(areacircle);
                break;
            default:
                System.out.println("error!");
        }
    }
}