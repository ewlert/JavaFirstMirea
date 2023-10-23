package ru.mirea.task6.opt1;

public interface Movable {
    public void moveUp();

    public void moveDown();

    public void moveLeft();

    public void moveRight();

}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Движение вверх");
    }

    @Override
    public void moveDown() {
        System.out.println("Движение вниз");
    }

    @Override
    public void moveLeft() {
        System.out.println("Движение влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Движение вправо");
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

class MovableCircle extends MovablePoint {
    public int radius;
    public MovablePoint center;

    public MovableCircle(int radius, MovablePoint center, int x, int y, int ySpeed, int xSpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        System.out.println("Движение вверх");
    }

    @Override
    public void moveDown() {
        System.out.println("Движение вниз");
    }

    @Override
    public void moveLeft() {
        System.out.println("Движение влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Движение вправо");
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
