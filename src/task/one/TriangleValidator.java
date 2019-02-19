/**
 * Создать простейшее приложение, которое определяет, являются ли три заданные пользователем
 * величины сторонами треугольника.
 */

package task.one;

class TriangleValidator {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 5, 8);
        triangle.isTriangle();
    }
}
