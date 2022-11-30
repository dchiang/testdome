# [Ice Cream Machine](https://www.testdome.com/questions/java/ice-cream-machine/83099 "Ice Cream Machine")

Implement the IceCreamMachine's scoops method so that it returns all combinations of one ingredient and one topping. If there are no ingredients or toppings, the method should return an empty list.

For example,

```java
IceCreamMachine machine = new IceCreamMachine(
    new String[]{"vanilla", "chocolate"},
    new String[]{"chocolate sauce"}
);
List<IceCream> scoops = machine.scoops();
for (IceCream iceCream : scoops) {
    System.out.println(iceCream.ingredient + ", " + iceCream.topping);
}
```

should print

```
vanilla, chocolate sauce
chocolate, chocolate sauce
```

### Testing escenarios

* Various ingredients and one topping.
* Various ingredients and toppings.
* No ingredients and no toppings.