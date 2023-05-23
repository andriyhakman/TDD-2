package edu.hakman.tddjunit5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle {
    private double sideA;
    private double sideB;

    public double getDiagonal() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public double getArea() {
        return sideA * sideB;
    }

    public boolean isHavingInnerCircle() {
        return sideA == sideB;
    }

    public double getOuterCircleRadius() {
        return getDiagonal() / 2;
    }

    public double getInnerCircleRadius() throws Exception {
        if (!isHavingInnerCircle()) {
            throw new IllegalArgumentException("This rectangle can't has inner circle");
        }

        return sideA / 2;
    }

    public double getAngelBetweenDiagonals() {
        var diagonalHalf = getDiagonal() / 2;
        var cornerCos = 1 - Math.pow(sideB, 2) / (2 * Math.pow(diagonalHalf, 2));

        return Math.acos(cornerCos) * 57.296;
    }

    public boolean CanBeReal() {
        return sideA > 0 && sideB > 0;
    }
}
