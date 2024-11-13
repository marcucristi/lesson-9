package task2;

public class Parallelogram {
    public static void main(String[] args){
        BackOffice square = new BackOffice();
        BackOffice rectangle = new BackOffice();
        System.out.println("Perimetrul patratului "+square.calculatePerimeter(7));
        System.out.println("Aria patratului "+square.calculateArea(9));
        System.out.println("Permitetrul dreptunghiului "+rectangle.calculatePerimeter(5,8));
        System.out.println("Aria dreptunghiului "+rectangle.calculateArea(7,4.68));
    }

}
