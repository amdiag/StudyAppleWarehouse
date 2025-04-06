package com.amdiag.appleWarehouse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AppleWarehouseTest {

    @Mock
    private AppleWarehouse appleWarehouse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testfindApplesByColorGreen() {
        final String color = "green";
        List<Apple> expectedGreenApples = new ArrayList<>();
        expectedGreenApples.add(new Apple(color, 200));
        expectedGreenApples.add(new Apple(color, 90));
        expectedGreenApples.add(new Apple(color, 50));

        when(appleWarehouse.findApplesByColor(color)).thenReturn(expectedGreenApples);

        List<Apple> actualGreenApples = appleWarehouse.findApplesByColor(color);

        assertEquals(expectedGreenApples.size(), actualGreenApples.size());
        for (int i = 0; i < expectedGreenApples.size(); i++) {
            assertEquals(expectedGreenApples.get(i).getColor(), actualGreenApples.get(i).getColor());
            assertEquals(expectedGreenApples.get(i).getWeight(), actualGreenApples.get(i).getWeight());
        }
    }

    @Test
    public void testFindApplesByColorRed() {
        final String color = "red";
        List<Apple> expectedRedApples = new ArrayList<>();
        expectedRedApples.add(new Apple(color, 100));
        expectedRedApples.add(new Apple(color, 300));

        when(appleWarehouse.findApplesByColor(color)).thenReturn(expectedRedApples);

        List<Apple> actualRedApples = appleWarehouse.findApplesByColor(color);
    }

    @Test
    public void testFindApplesByColorGreenSimple() {
        final String color = "green";
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> greenApples = warehouse.findApplesByColor(color);
        assertEquals(3, greenApples.size());
    }

    @Test
    public void testFindApplesByColorRedSimple() {
        final String color = "red";
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> redApples = warehouse.findApplesByColor(color);
        assertEquals(3, redApples.size());
    }

    @Test
    public void testFindApplesByColorYellowSimple() {
        final String color = "yellow";
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> yellowApples = warehouse.findApplesByColor(color);
        assertEquals(2, yellowApples.size());
    }
}
