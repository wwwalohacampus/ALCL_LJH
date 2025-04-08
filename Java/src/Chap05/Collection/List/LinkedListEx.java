package Chap05.Collection.List;

import java.util.LinkedList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Product {
  String name;      // 상품명
  int price;        // 가격
  int count;        // 재고 수
}

public class LinkedListEx {
  public static void main(String[] args) {
    // LinkedList 생성 - 상품 목록
    LinkedList<Product> productList = new LinkedList<>();
    Product product1= Product.builder()
                             .name("아이폰")
                             .price(5000)
                             .count(10)
                             .build();
    Product product2 = Product.builder()
                              .name("기계식 키보드")
                              .price(55000)
                              .count(20)
                              .build();
    Product product3 = Product.builder()
                              .name("노트북")
                              .price(15000000)
                              .count(5)
                              .build();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);

    // 첫번째/마지막 요소 제거
    productList.removeFirst();
    productList.removeLast();
    System.out.println(productList);

    // 첫번째/마지막 요소 추가
    productList.addFirst( new Product("모니터", 200000, 10) );
    productList.addLast( new Product("컴퓨터", 17000000, 5));
    System.out.println(productList);

    System.out.println("상품 개수 : " + productList.size());

    productList.clear();
    System.out.println("::::: 상품 목록 :::::");
    System.out.println(productList);

  }  
}
