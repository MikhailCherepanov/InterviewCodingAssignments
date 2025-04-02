import java.util.ArrayList;
import java.util.List;

class Test21 {

    public static void main(String[] args) {
        String keyword = "Apple";

        Phone one = new Phone("iPhone 16", "Apple", "test description", "500" );
        Phone two = new Phone("S25", "Samsung", "test description", "400" );
        Phone three = new Phone("Razr", "Moto", "test description", "300" );
        Phone four = new Phone("13R", "OnePlus", "test description", "100" );

        List<Phone> products = new ArrayList<>();

        products.add(one);
        products.add(two);
        products.add(three);
        products.add(four);

        Phone res = solution(products, keyword);

        System.out.println("Result : ");
        System.out.println("name : " + res.getName());
        System.out.println("brand : " + res.getBrand());
        System.out.println("description : " + res.getDescription());
        System.out.println("price : " + res.getPrice());
    }

    public static Phone solution(List<Phone> products, String keyword) {

        for (Phone product : products) {
            if (product.getBrand().equals(keyword)) {
                return product;
            }
        }
        return null;
    }

}