package OOP;

public class PizzaOrder {
    private String name;
    private Size size;
    private boolean extraSauce;
    private String deliveryAddress;
    private boolean orderAccepted;

    public PizzaOrder(String name, Size size, boolean extraSauce, String deliveryAddress) {
        this.name = name;
        this.size = size;
        this.extraSauce = extraSauce;
        this.deliveryAddress = deliveryAddress;
        this.orderAccepted = false;
    }

    public void order() {
        if (orderAccepted) {
            System.out.println("Order already accepted.");
        } else {
            orderAccepted = true;
            System.out.println("Order accepted. " + size + " pizza \"" + name + "\" with " +
                    (extraSauce ? "sauce" : "no sauce") + " to be delivered to " + deliveryAddress + ".");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            System.out.println("Order canceled.");
            orderAccepted = false;
        } else {
            System.out.println("Order was not accepted.");
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isExtraSauce() {
        return extraSauce;
    }

    public void setExtraSauce(boolean extraSauce) {
        this.extraSauce = extraSauce;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", extraSauce=" + extraSauce +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderAccepted=" + orderAccepted +
                '}';
    }

    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Al Capone", Size.BIG, true, "Yaroslavskaya 101");

        pizzaOrder.order();
        pizzaOrder.cancel();
    }
}

enum Size {
    SMALL, MEDIUM, BIG
}
