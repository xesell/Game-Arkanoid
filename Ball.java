package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {

    private double dx, dy;
    private double speed;
    private double direction;
    private boolean isFrozen;

    public Ball(double dx, double dy, double speed, double direction) {
        super(dx, dy, 1);
        this.dx = dx;
        this.dy = dy;
        this.speed = speed;
        this.direction = direction;
        isFrozen=true;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        if(!isFrozen){

        }
    }
}
