package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepo {
    Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                Product[] tmp = new Product[products.length - 1];
                int copyToIndex = 0;

                for (Product oneProduct : products) {
                    if (oneProduct.getId() != id) {
                        tmp[copyToIndex] = oneProduct;
                        copyToIndex++;
                    }
                }

                products = tmp;
            }
        }
    }
}
