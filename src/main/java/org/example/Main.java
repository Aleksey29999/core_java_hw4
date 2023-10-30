package org.example;

import org.example.hw4_2.Buyer;
import org.example.hw4_2.Order;
import org.example.hw4_2.Product;
import org.example.w4_1.Autorizaciya;
import org.example.w4_1.WrongLoginException;
import org.example.w4_1.WrongPasswordException;

import java.util.*;



public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        //        Задача №1
        String continue_flag1 = "1";
        while (continue_flag1.equals("1")) {



            System.out.println("Введите логин меньше 20 символов:");
            Scanner login1 = new Scanner(System.in);
            String login = login1.nextLine();



            System.out.println("Введите пароль меньше 20 символов:");
            Scanner password1 = new Scanner(System.in);
            String password = password1.nextLine();

            System.out.println("Введите повторно пароль меньше 20 символов:");
            Scanner confirmpassword1 = new Scanner(System.in);
            String confirmpassword = confirmpassword1.nextLine();
            System.out.println(Autorizaciya.autorizaciya(login, password, confirmpassword));
            continue_flag1 = "2";
        }



//        Задача №2
        ArrayList<String> buyer = new ArrayList<>();
        Buyer buyer1 = new Buyer("Иванов");
        Buyer buyer2 = new Buyer("Петров");
        Buyer buyer3 = new Buyer("Сидоров");
        Buyer buyer4 = new Buyer("Степанов");
        buyer.add(String.valueOf(buyer1));
        buyer.add(String.valueOf(buyer2));
        buyer.add(String.valueOf(buyer3));
        buyer.add(String.valueOf(buyer4));

        ArrayList<String> product = new ArrayList<>();
        Product product1 = new Product("phone");
        Product product2 = new Product("book");
        Product product3 = new Product("notebook");
        Product product4 = new Product("radio");
        product.add(String.valueOf(product1));
        product.add(String.valueOf(product2));
        product.add(String.valueOf(product3));
        product.add(String.valueOf(product4));

        ArrayList<String> order = new ArrayList<>();
        Order order1 = new Order("1");
        Order order2 = new Order("2");
        Order order3 = new Order("3");
        Order order4 = new Order("4");
        order.add(String.valueOf(order1));
        order.add(String.valueOf(order2));
        order.add(String.valueOf(order3));
        order.add(String.valueOf(order4));

        ArrayList<String[]> orderProductPay = new ArrayList<>();


        for (int i = 0; i < order.size(); i++) {
            orderProductPay.add(Order.orderProduct(order.get(i), buyer.get(i), product.get(i)));
        }


        String continue_flag = "1";
        while (continue_flag.equals("1")) {

            Order orderNew = new Order(String.valueOf(orderProductPay.size() + 1));
            order.add(String.valueOf(orderNew));

// Buyer
            System.out.println("Введите фамилию Покупателя:");
            Scanner buy = new Scanner(System.in);
            String buy1 = buy.nextLine();
            Buyer buyerNew = new Buyer(buy1);
            if (buy1.length() <= 1) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
            buyer.add(String.valueOf(buyerNew));
// Product
            System.out.println("Введите название товара кторый хотите купить:");
            Scanner prod = new Scanner(System.in);
            String prod1 = prod.nextLine();
            Product productNew = new Product(prod1);
            if (prod1.length() <= 1) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
            product.add(String.valueOf(productNew));

            orderProductPay.add(Order.orderProduct(String.valueOf(orderNew), String.valueOf(buyerNew), String.valueOf(productNew)));

            System.out.println("Купим еще что-нибудь? 1 - да, любой другой символ - нет");
            Scanner in = new Scanner(System.in);
            continue_flag = in.next();
        }

        for (int i = 0; i < orderProductPay.size(); i++) {
            System.out.println((Arrays.toString(orderProductPay.get(i))));

        }

    }


}