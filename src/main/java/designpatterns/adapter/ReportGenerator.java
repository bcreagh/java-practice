package designpatterns.adapter;

import java.util.List;

public class ReportGenerator {
    public int calculateMonthlySales(OrderDataAdapter orderDataAdapter) {
        List<Order> orders = orderDataAdapter.getThisMonthsOrders();
        int totalSales = 0;

        for(Order order: orders) {
            totalSales += getTotalCostOfOrder(order);
        }

        return totalSales;
    }

    private int getTotalCostOfOrder(Order order) {
        return order.getProduct().getPrice() * order.getQuantity();
    }
}
