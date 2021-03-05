package ru.geekbrains;

import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    public Product product;
    List<Product> products = new ArrayList<>();

    public List<Product> addProduct() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String idS = reader.readLine();
        int id = Integer.parseInt(idS);
        String name = reader.readLine();
        String priceS = reader.readLine();
        double price = Integer.parseInt(priceS);
        Product product = new Product(id, name, price);
        products.add(product);
        return products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String idS = reader.readLine();
        id = Integer.parseInt(idS);
        if (id == product.getId()) {
            System.out.println(product);
        } else {
            System.out.println("Not found.");
        }
        return product;
    }
}
