package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class RunnerApplication implements CommandLineRunner {

    @Autowired
    public ProductRepository products;

    public RunnerApplication(ProductRepository products) {
        this.products = products;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            products.addProduct();
        }
    }
}
