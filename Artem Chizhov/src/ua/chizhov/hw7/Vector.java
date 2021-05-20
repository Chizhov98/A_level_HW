package ua.chizhov.hw7;

import java.util.Random;

public class Vector {
    int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected double length() {
        return Math.abs(Math.sqrt((x * x) + (y * y) + (z * z)));
    }

    protected Vector vectorMulti(Vector vectorB) {
        int newX = (this.y * vectorB.z) - (this.z * vectorB.y);
        int newY = (this.z * vectorB.x) - (this.x * vectorB.z);
        int newZ = (this.x * vectorB.y) - (this.y * vectorB.x);

        return new Vector(newX, newY, newZ);
    }

    protected int scalarMulti(Vector vectorB) {
        return this.x * vectorB.x + this.y * vectorB.y + this.z * vectorB.z;
    }

    protected double cosWithVectorB(Vector vectorB) {
        return scalarMulti(vectorB) / (length() * vectorB.length());
    }

    protected Vector sumWithVectorB(Vector vectorB) {
        return new Vector(this.x + vectorB.x, this.y + vectorB.y, this.z + vectorB.z);
    }

    protected Vector subWithVectorB(Vector vectorB) {
        return new Vector(this.x - vectorB.x, this.y - vectorB.y, this.z - vectorB.z);
    }

    final static public Vector[] vectorsArray(int n) {
        Vector vectorArray[] = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vectorArray[i] = new Vector(random.nextInt(41) - 20, random.nextInt(41) - 20, random.nextInt(41) - 20);
        }
        return vectorArray;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
