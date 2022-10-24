# User Stories, Domain Models and Tests

Note: We had a go at doing Bobs Bagels in Java whilst also considering Encapsulation. We tweaked or redid
Jac's domain models from a previous attempt of Bobs Bagels in JavaScript. This was a sandbox learning task
we undertook. We performed TDD in a ping-pong manner between each programmer.

1)
```
As a member of the public
So I can order a bagel when I want to
I'd like to add an item to my basket
```

 | Objects (noun) | 	Properties	                        | Messages (adjective)	 | Output            |
|----------------|-------------------------------------|-----------------------|-------------------|
| Basket         | 	Item basketItems @ArrayList[@Item] | 	addItem(@Item)	      | @Void             |
| -              | 	-                                  | 	getBasketItems()	    | @ArrayList[@Item] |
 | Item           | 	-                                  | 	-                    | -                 |

Test:
1a) Adds 1 to the `size` of the `basketItems` ArrayList
```
As a member of the public,
So that I can change my order
I'd like to remove an item from my basket

```
 | Objects (noun) | 	Properties	                        | Messages (adjective)	 | Output            |
|----------------|-------------------------------------|-----------------------|-------------------|
| Basket         | 	Item basketItems @ArrayList[@Item] | 	removeItem(@Item)	      | @Void             |
 | -              | 	-                                  | 	getBasketItems()	    | @ArrayList[@Item] |
 | Item           | 	-                                  | 	-                    | -                 |


Test:
2a) Removes 1 from the `size` of the `basketItems` ArrayList

3)
```
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

 | Objects (noun) | 	Properties	                        | Messages (adjective)	 | Output            |
|----------------|-------------------------------------|-----------------------|-------------------|
 | Basket         | 	Item basketItems @ArrayList[@Item] | 	addItem(@Item)	      | @String           |
| -              | 	-                                  | 	getBasketItems()	    | @ArrayList[@Item] |
| -              | 	basketCapacity @int                | 		                    |                   |
 | -              | 	                | isBasketFull()		      | @boolean          |
|  Item          | 	-                                  | 	-                    | -                 |

Test 3a - `isBasketFull()` returns `true` when number of items in basket is equal to the `basketCapacity` variable
<br>
Test 3b - `addItem()` returns a `String` to state the basket is full when trying to add to it when basket is full

4)
```
As a Bob's Bagels manager,
So that I can record more sales
I’d like to create baskets with larger capacity when I need to.
```

 | Objects (noun) | 	Properties	                        | Messages (adjective)	          | Output     |
|----------------|-------------------------------------|--------------------------------|------------|
| Basket         | 	Item basketItems @ArrayList[@Item] | 	addItem(@Item)	               | @String    |
| -              | 	-                                  | 	getBasketItems()	             | @ArrayList[@Item] |
 | -              | 	basketCapacity @int                | 	increaseBasketCapacity(@int)	 | @String    |
| -              | 	                | getBasketCapacity()		          | @int       |
 | -              | 	                | isBasketFull()		               | @boolean   |
 | Item           | 	-                                  | 	-                             | -          |

Test 4a - Test that using `increaseBasketCapacity()` increases the `basketCapacity` of `Basket` by 3
<br>
Test 4b - Test that using `increaseBasketCapacity()` returns a string showing increased capacity.

5)
```
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket. In the same way, I want to know if I try to add an item with the same ID already in my basket.
```


| Objects (noun) | 	Properties	                        | Messages (adjective)	          | Output           |
|----------------|-------------------------------------|--------------------------------|------------------|
| Basket         | 	Item basketItems @ArrayList[@Item] | 	addItem(@Item)	               | @String          |
|                | 	                                   | 	removeItem(@Item)	            | @Void            |      
| -              | 	-                                  | 	getBasketItems()	             | @ArrayList[@Item] |
| -              | 	basketCapacity @int                | 	increaseBasketCapacity(@int)	 | @String          |
| -              | 	                                   | getBasketCapacity()		          | @int             |
| -              | 	                                   | isBasketFull()		               | @boolean         |
| -              | -                                   | isItemInBasket(@Item)          | @Boolean |        |      
| Item           | 	-                                  | 	-                             | -                |

Test 5a - isItemInBasket() returns `true` if the Item object is in the `arrayList<Item>` `basketItem` <br>
Test 5b - isItemInBasket() returns `false` if the Item object is not in the `arrayList<Item>` `basketItem`

6)
```
As a member of the public,
So that I can know how much my bagels are,
I’d like to see the price of each item before I add it to my basket.
```
7)
```
As a member of the public,
So that I can prepare to pay
When I go to checkout I'd like to know the total sum of the bagels in my basket
```

