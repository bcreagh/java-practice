package designpatterns.adapter;

import designpatterns.adapter.legacyclasses.LegacyOrder;
import designpatterns.adapter.legacyclasses.LegacyOrderRepository;

import java.util.ArrayList;
import java.util.List;

public class LegacyOrderRepositoryAdapter implements OrderDataAdapter {

    private LegacyOrderRepository legacyOrderRepository;

    public LegacyOrderRepositoryAdapter() {
        legacyOrderRepository = new LegacyOrderRepository();
    }

    @Override
    public List<Order> getThisMonthsOrders() {
        List<Order> orders = new ArrayList<>(4);

        LegacyOrder[] legacyOrders = legacyOrderRepository.getThisMonthsOrders();

        for (int i = 0; i < legacyOrders.length; i++) {
            Order order = convertLegacyOrderIntoOrder(legacyOrders[i]);
            orders.add(order);
        }

        return orders;
    }

    private Order convertLegacyOrderIntoOrder(LegacyOrder legacyOrder) {
        Order order = new Order();
        Product product = new Product();

        product.setPrice(legacyOrder.getPrice());
        product.setProductCode(legacyOrder.getProductCode());
        product.setProductName(legacyOrder.getProductName());
        order.setOrderNumber(legacyOrder.getOrderNumber());
        order.setQuantity(legacyOrder.getQuantity());
        order.setProduct(product);

        return order;
    }
}
