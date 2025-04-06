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
    public void testFindAllGreenApple() {
        List<Apple> expectedGreenApples = new ArrayList<>();
        expectedGreenApples.add(new Apple("green", 200));
        expectedGreenApples.add(new Apple("green", 90));
        expectedGreenApples.add(new Apple("green", 50));

        when(appleWarehouse.findAllGreenApple()).thenReturn(expectedGreenApples);

        List<Apple> actualGreenApples = appleWarehouse.findAllGreenApple();

        assertEquals(expectedGreenApples.size(), actualGreenApples.size());
        for (int i = 0; i < expectedGreenApples.size(); i++) {
            assertEquals(expectedGreenApples.get(i).getColor(), actualGreenApples.get(i).getColor());
            assertEquals(expectedGreenApples.get(i).getWeight(), actualGreenApples.get(i).getWeight());
        }
    }

    @Test
    public void testFindAllGreenAppleSimple() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> greenApples = warehouse.findAllGreenApple();
        assertEquals(3, greenApples.size());
    }
}
