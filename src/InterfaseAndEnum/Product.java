package InterfaseAndEnum;

import java.util.Random;

public enum Product {
    Fruit,
    Vegetables,
    Clothes,
    Technique,
    Chemistry,
    Other;

    public int getRandom() {
        return new Random().nextInt(500);
    }
}
