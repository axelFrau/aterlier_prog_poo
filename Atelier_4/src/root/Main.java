package root;

import root.Forme2D.*;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle",2);
        Ellipse ellipse = new Ellipse("Ellipse", 1,2);
        Rectangle rectangle = new Rectangle("Rectangle",1,2);
        System.out.println(rectangle.toString());
    }
}
