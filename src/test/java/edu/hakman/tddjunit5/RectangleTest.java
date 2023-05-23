package edu.hakman.tddjunit5;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {
    Rectangle underTest = new Rectangle();

    @Test
    void itShouldCalculateDiagonal() {
        // Given
        var expectedResult = 8.5;
        var percentage = Percentage.withPercentage(0.5);

        underTest.setSideA(6);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.getDiagonal();

        //Then
        assertThat(currentResult).isCloseTo(expectedResult, percentage);
    }

    @Test
    void itShouldCalculateArea() {
        // Given
        var expectedResult = 48;

        underTest.setSideA(6);
        underTest.setSideB(8);

        // When
        var currentResult = underTest.getArea();

        //Then
        assertThat(currentResult).isEqualTo(expectedResult);
    }

    @Test
    void isItCanHasInnerCircle() {
        // Given
        underTest.setSideA(6);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.isHavingInnerCircle();

        //Then
        assertThat(currentResult).isEqualTo(true);
    }

    @Test
    void itShouldCalculateOuterCircleRadius() {
        // Given
        var expectedResult = 4.25;
        var percentage = Percentage.withPercentage(0.5);

        underTest.setSideA(6);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.getOuterCircleRadius();

        //Then
        assertThat(currentResult).isCloseTo(expectedResult, percentage);
    }

    @Test
    void itCanCalculateInnerCircleRadius() throws Exception {
        // Given
        var expectedResult = 3;

        underTest.setSideA(6);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.getInnerCircleRadius();

        //Then
        assertThat(currentResult).isEqualTo(expectedResult);
    }

    @Test
    void itShouldCalculateAngelBetweenDiagonals() {
        // Given
        var expectedResult = 74;
        var percentage = Percentage.withPercentage(0.5);

        underTest.setSideA(8);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.getAngelBetweenDiagonals();

        //Then
        assertThat(currentResult).isCloseTo(expectedResult, percentage);
    }

    @Test
    void isItCanBeReal() {
        // Given
        underTest.setSideA(6);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.CanBeReal();

        //Then
        assertThat(currentResult).isEqualTo(true);
    }

    @Test
    void itShouldCalculateDiagonalBetweenTwoNumbers() {
        // Given
        var firstExpected = 8.0;
        var secondExpected = 9.0;

        underTest.setSideA(6);
        underTest.setSideB(6);

        // When
        var currentResult = underTest.getDiagonal();

        //Then
        assertThat(currentResult).isBetween(firstExpected, secondExpected);
    }

    @Test
    void isItRectangle() {
        // Given
        var THISISRECTANGLE = 1;

        // When

        //Then
        assertThat(THISISRECTANGLE).isNotInstanceOf(Rectangle.class);
    }

    @Test
    void isItNotNull() {
        // Given

        // When

        //Then
        assertThat(underTest).isNotNull();
    }

    @Test
    void isItInArray() {
        // Given
        var array = new Object[] { underTest, new Rectangle(), new Rectangle(7, 8), new Rectangle(-6, 7) };

        // When

        //Then
        assertThat(underTest).isIn(array);
    }

    @Test
    void isItSameAs() {
        // Given
        var anotherRect = underTest;

        // When

        //Then
        assertThat(underTest).isSameAs(anotherRect);
    }
}