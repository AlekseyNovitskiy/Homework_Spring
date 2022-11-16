package org.skypro.homework_spring.service;

import org.skypro.homework_spring.component.Cart;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> idsToAdd) {
        cart.addToCart(idsToAdd);

    }

    public List<Integer> getItems() {
        return cart.getCartContent();
    }
}
