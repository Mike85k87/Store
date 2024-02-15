package pro.sky.store.object;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
@SessionScope
public class Cart {
    private final List<Integer> cartlist = new ArrayList<>();

    public void add(Integer id) {
        cartlist.add(id);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(cartlist);
    }
}
