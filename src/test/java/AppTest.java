import org.junit.Assert;
import org.junit.Test;

import hello.LeapYears;

public class AppTest {

    @Test
    public void isLeapYearsYearDivisibleBy400ShouldReturnTrue() {
        int year = 2000; // Arrange -> Année divisible par 400
        LeapYears leapYears = new LeapYears(); // Constructeur de la classe LeapYears
        // Nous avons besoin d'une instance de la classe LeapYears afin de pouvoir
        // appeler la fonction isLeapYears
        boolean isLeapYears = leapYears.isLeapYears(year); // Act -> On regarde le résultat avec l'année que nous avons
                                                           // renseignée durant l'étape Arrange.
        Assert.assertTrue(isLeapYears); // Assert -> Le test est bon si isLeapYears est vrai.
    }

    @Test
    public void isLeapYearsYearDivisibleBy100ButNotBy400ShouldReturnFalse() {
        // Arrange
        int year = 1900;
        LeapYears leapYears = new LeapYears();
        // Act
        boolean isLeapYears = leapYears.isLeapYears(year);
        // Assert
        Assert.assertFalse(isLeapYears);
    }

    @Test
    public void isLeapYearsYearDivisibleBy4ButNotBy100ShouldReturnTrue() {
        // Arrange
        int year = 1960;
        LeapYears leapYears = new LeapYears();
        // Act
        boolean isLeapYears = leapYears.isLeapYears(year);
        // Assert
        Assert.assertTrue(isLeapYears);
    }

    @Test
    public void isLeapYearsYearNotDivisibleBy4ShouldReturnFalse() {
        // Arrange
        int year = 2019;
        LeapYears leapYears = new LeapYears();
        // Act
        boolean isLeapYears = leapYears.isLeapYears(year);
        // Assert
        Assert.assertFalse(isLeapYears);
    }
}
