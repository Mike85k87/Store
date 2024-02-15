package pro.sky.store.service;

import pro.sky.store.object.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Integer> items) {
        items.forEach(cart::add);

    }

    @Override
    public List<Integer> get() {
        return cart.get();
    }
}
