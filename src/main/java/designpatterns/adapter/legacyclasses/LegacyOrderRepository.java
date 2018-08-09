package designpatterns.adapter.legacyclasses;

import designpatterns.adapter.legacyclasses.LegacyOrder;

public class LegacyOrderRepository {
    public LegacyOrder[] getThisMonthsOrders() {
        LegacyOrder order1 = createSampleLegacyOrder();
        LegacyOrder order2 = createSampleLegacyOrder();
        LegacyOrder order3 = createSampleLegacyOrder();
        LegacyOrder order4 = createSampleLegacyOrder();

        LegacyOrder[] orders = { order1, order2, order3, order4 };
        return orders;
    }

    private LegacyOrder createSampleLegacyOrder() {
        LegacyOrder order = new LegacyOrder();
        order.setOrderNumber(1);
        order.setPrice(250);
        order.setProductCode(1);
        order.setProductName("Apple");
        order.setQuantity(1);
        return order;
    }

}
