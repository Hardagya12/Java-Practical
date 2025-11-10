class Box {
    double length;
    double width;
    double height;

    Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    Box(double l) {
        length = l;
        width = l;
        height = l;
    }
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(2, 3, 4);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}

