package task3;

public class Main {
    public static void main(String[] args) {

        Square patrat = new Square();
        Circle cerc = new Circle();
        Sphere sfera = new Sphere();
        Cube cub = new Cube();

        System.out.println();
        System.out.println("Aria patratului este : " + patrat.calculateAria(34.3));
        System.out.println("Aria cercului este : " + cerc.calculateAria(23.4));
        System.out.println("Perimetul cubului este : " + cub.calculateAria(3));
        System.out.println("Volumul cubului este : " + cub.calculateVolume(3));
        System.out.println("Perimetrul sferei este : " + sfera.calculateAria(34));
        System.out.println("Volumul sferei este : " + sfera.calculateVolume(34));
    }
}
