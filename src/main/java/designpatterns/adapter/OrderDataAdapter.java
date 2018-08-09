package designpatterns.adapter;

import java.util.List;

public interface OrderDataAdapter {
    List<Order> getThisMonthsOrders();
}
