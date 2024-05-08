import java.util.Scanner;

interface a {
    void input();
    void display();
}

class triangle implements a {
    int a, b, area;

    public void input() {
        System.out.println("Enter a and b value:");
        Scanner z = new Scanner(System.in);
        a = z.nextInt();
        b = z.nextInt();
    }

    public void display() {
        area = (int)(0.5 * a * b);
        System.out.println("Area of triangle is: " + area);
    }
}

class rectangle implements a {
    int l, w, area;

    public void input() {
        System.out.println("Enter l and w value:");
        Scanner z = new Scanner(System.in);
        l = z.nextInt();
        w = z.nextInt();
    }

    public void display() {
        area = l * w;
        System.out.println("Area of rectangle is: " + area);
    }
}

class cube implements a {
    int c, area;

    public void input() {
        System.out.println("Enter c value:");
        Scanner z = new Scanner(System.in);
        c = z.nextInt();
    }

    public void display() {
        area = 6 * c * c;
        System.out.println("Area of cube is: " + area);
    }
}

public class demointerface {
    public static void main(String[] args) {
        triangle t = new triangle();
        rectangle r = new rectangle();
        cube e = new cube();
        t.input();
        t.display();
        r.input();
        r.display();
        e.input();
        e.display();
    }
}
