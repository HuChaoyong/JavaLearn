package Chapter11;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
    private float price;

    public House(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "房子价格为：" + price + '}';
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        // 设置变化点
        // 通知所有观察者
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}

class HousePriceObserver implements Observer {

    private String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 判断参数类型
        if (arg instanceof Float) {
            System.out.println(this.name + "观察到的价格是： ");
            System.out.println(((Float) arg).floatValue());
        }
    }
}

public class ObserverModel {
    public static void main(String[] args) {
        House h = new House(100000);
        HousePriceObserver hop1 = new HousePriceObserver("购房者1");
        HousePriceObserver hop2 = new HousePriceObserver("购房者2");
        HousePriceObserver hop3 = new HousePriceObserver("购房者3");

        // 加入观察者
        h.addObserver(hop1);
        h.addObserver(hop2);
        h.addObserver(hop3);

        System.out.println(h);
        h.setPrice(660000);
        System.out.println(h);
    }
}
