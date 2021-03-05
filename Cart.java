package ru.geekbrains;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

@Component
public class Cart {
    Scanner sc = new Scanner(System.in);
    public Product product;
    public List<Product> cartList;
    ProductRepository products;

    public void addProductById(int id) throws IOException {
        id = sc.nextInt();
        if (id == product.getId()) {
           cartList.add(products.getProductById(id));
           System.out.println(cartList);
        } else {
            System.out.println("Not found.");
        }
    }

    public void deleteById(int id) {
        id = sc.nextInt();
        for (Product product: cartList) {
            if (id == product.getId()) {
                cartList.remove(product.getId());
            } else {
                throw new NoSuchElementException("Product with ID = " + id + " is not found.");
            }
        }
        sc.close();
    }

}
