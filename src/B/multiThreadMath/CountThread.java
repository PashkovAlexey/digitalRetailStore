package B.multiThreadMath;
import B.model.Size;
import java.util.List;

public class CountThread implements Runnable {

private final List<Size> arrayList;
private final CommonResource commonResource;

    public CountThread(CommonResource commonResource, List<Size> arrayList) {
        this.commonResource = commonResource;
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        synchronized (commonResource) {
            commonResource.sumOfAll = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                commonResource.sumOfAll = commonResource.sumOfAll + arrayList.get(i).getPrice();;
            }
            try {
                System.out.println("Ждем 5 секунд, поток CountThread с блокированным ресурсом работает, имплементация интерфейса Runnable");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Поймали ошибку InterruptedException");
            }
            System.out.println("Стоимость товаров типа " + Thread.currentThread().getName() + " составляет " + commonResource.sumOfAll + " рублей");
            System.out.println("Товар в количестве " + arrayList.size() + " штуки имеется на складе, возможно переходить к оплате");
        }
    }

}
