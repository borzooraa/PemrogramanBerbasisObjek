// package jobsheet2;

public class rectangle {
    int width, height;

    rectangle(int w, int h) {
        width = w; //kalau namanya sama ditambahi this.
        height = h;
    }

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }
}
