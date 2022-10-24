import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    Item testItem = new Item();

    @Test
    @DisplayName("1a - Add 1 to the length of the basketItems ArrayList")
    void testAddItem(){
        // Arrange
        Basket testBasket = new Basket(1);
        // Act
        testBasket.addItem(testItem);
        // Assert
        // expected left, actual/result right
        assertEquals(1, testBasket.getBasketItems().size());
    }

    @Test
    @DisplayName("2a - Remove 1 from the length of the basketItems ArrayList")
    void testRemoveItem(){
        // Arrange
        Basket testBasket = new Basket(1);
        // Act
        testBasket.addItem(testItem);
        testBasket.removeItem(testItem);
        // Assert
        // expected left, actual/result right
        assertEquals(0, testBasket.getBasketItems().size());
    }

    @Test
    @DisplayName("3a - `isBasketFull()` returns `true` when number of items in basket is equal to the `basketCapacity` variable")
    void testIsBasketFull(){
        // Arrange
        int testBasketCapacity = 1;
        Basket testBasket = new Basket(testBasketCapacity);
        // Act
        testBasket.addItem(new Item());
        boolean actual = testBasket.isBasketFull();
        // Assert
        assertEquals(true, actual);
    }

    @Test
    @DisplayName("3b -  addItem() returns a String to state the basket is full when trying to add to it when basket is full")
    void basketFullNoAdd(){
        // Arrange
        int testBasketCapacity = 1;
        Basket testBasket = new Basket(testBasketCapacity);
        // Act
        testBasket.addItem(new Item());
        String actual = testBasket.addItem(new Item());
        // Assert
        assertEquals("Can't do that - basket is full", actual);
    }

    @Test
    @DisplayName("4a - using `increaseBasketCapacity()` increases the `basketCapacity` of `Basket` by 3")
    void testIncreaseBasketCapacity(){
        // Arrange
        int testBasketCapacity = 1;
        Basket testBasket = new Basket(testBasketCapacity);
        // Act
        testBasket.increaseBasketCapacity();
        int actual = testBasket.getBasketCapacity();
        // Assert
        assertEquals(testBasketCapacity + 3, actual);
    }

    @Test
    @DisplayName("4b - using `increaseBasketCapacity()` returns string to show capacity has increased")
    void testIncreaseBasketCapacityString(){
        // Arrange
        int testBasketCapacity = 1;
        Basket testBasket = new Basket(testBasketCapacity);
        // Act
        String actual = testBasket.increaseBasketCapacity();

        // Assert
        assertEquals("Basket capacity has been increased and is now " + testBasket.getBasketCapacity(), actual);
    }

    @Test
    @DisplayName("5a - isItemInBasket() returns `true` if the Item object is in the `arrayList<Item>` `basketItem`")
    void testIsItemInBasket(){
        // Arrange
        int testBasketCapacity = 1;
        Basket testBasket = new Basket(testBasketCapacity);
        // Act
        Item item1 = new Item();
        testBasket.addItem(item1);
        boolean actual = testBasket.isItemInBasket(item1);
        // Assert
        assertEquals(true, actual);
    }

}
