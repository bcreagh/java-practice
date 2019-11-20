# Adapter Pattern

This code is a very simple example of how the adapter pattern can be used.

I've imagined a scenario where a company takes orders from customers for its products. All the orders for the current month can be retrieved using a LegacyOrderRepository object. As the name suggests, this class is legacy code. It retrieves an array of LegacyOrder objects.

The company has since created an Order class to replace the LegacyOrder class. They want to create a ReportGenerator class which calculates the total monthly sales from a List of Order objects.

The ReportGenerator requires a List of Order objects for the current month, and the LegacyOrderRepository provides an array of LegacyOrder objects for the current month. In order to allow these classes to work together, the company uses the adapter pattern.