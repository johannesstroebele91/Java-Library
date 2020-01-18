package de.hdm_stuttgart.mi.JavaMemoryManagement;

public class Rectangle {

    private int width;
    private int height;


    public int getWidth() {
        return width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
