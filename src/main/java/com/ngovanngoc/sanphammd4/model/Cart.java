package com.ngovanngoc.sanphammd4.model;

import com.ngovanngoc.sanphammd4.enttity.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {


    private final List<CartItem> cartItems;
    private double total;

    public Cart() {
        cartItems = new ArrayList<>();
        total = 0;
    }

    public CartItem getItem(Product product) {
        for (CartItem cart : cartItems) {
            if (cart.getProduct().getId() == product.getId()) {
                return cart;
            }
        }
        return null;
    }

    public List<CartItem> getItems() {
        return cartItems;
    }

    public int getItemCount() {
        return cartItems.size();
    }

    public void addItem(CartItem item) {
        addItems(item.getProduct(), item.getQuantity());
    }

    public void addItems(Product product, int quantity) {
        CartItem cartItem = getItem(product);
        if (cartItem != null) {
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        } else {
            cartItem = new CartItem(product);
            cartItem.setQuantity(quantity);
            cartItems.add(cartItem);
        }
    }

    public void updateItem(Product product, int quantity) {
        CartItem cartItem = getItem(product);
        if (cartItem != null) {
            cartItem.setQuantity(quantity);
        } else {
            cartItem.setQuantity(quantity);
        }
    }

    public void removeItem(Product product) {
        CartItem cartItem = getItem(product);
        if (cartItem != null) {
            cartItems.remove(cartItem);
        }
    }


    public void clear() {
        cartItems.clear();
        total = 0;
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
