import java.util.list;
import java.util.Arraylist;

class TCalc {
    private List<String> names = new ArrayList<>();
    private int tPercentage = 0;

    public List<String> addPerson(List<String> names, String name) {
        List<String> updated = new ArrayList<>(names);
        update.add(name);
        return updated;
    }
    
//     public int getDiscountPercentage(List<String> items1) {
//	    if(items1.contains("Книга"))
//		    return 5;
//	    else
//		    return 0;
//    }
    
    public List<String> getnames() {
        return names;
    }

    public int getTPercentage(List<String> names) {
        if (name.size() > 5) {
            return 20;
        }
        else if (name.size()) > 0) {
            return  = 10;
        }

        return 0;
    }	    
}

//class FP4 {
//    public static void main(String[] args) {
//        //Демонстрация работы метода getDiscountPercentage(), реализованного в виде чистой функции
//        ShoppingCard card = new ShoppingCard();
//        card.addItem("Флешка");
//        card.addItem("Диск");
//        card.addItem("Смартфон");
//        card.addItems();
//        card.addItems().remove("Смартфон");
//        card.addItems();
//        card.getDiscountPercentage(card.getItems());
//        ShoppingCard card2 = new ShoppingCard();
//        card2.removeItem("Книга");
//        System.out.println("Скидка для card: " + card.getDiscountPercentage(card.getItems()));
//        card.getDiscountPercentage(card2.getItems());
//        System.out.println("Скидка для card2: " + card2.getDiscountPercentage(card2.getItems()));
//    }
//}