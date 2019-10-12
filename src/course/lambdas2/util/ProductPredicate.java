package course.lambdas2.util;

import course.lambdas2.entities.Product;

import java.util.function.Predicate;

//functional interface
public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
