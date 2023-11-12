# EATS
- 배달 어플리케이션

## 1) 개발 환경
- [Spring Initializr](https://start.spring.io/) 통해서 제작
- Java 17
- Spring Boot 3.1.5
- Dependencies
  - Spring Web
  - Thymeleaf

## 2) API
1. 상품 전체 조회 API
   - GET `/foods`
2. 상품 개별 조회 API
   - GET `/foods/{id}`
3. 상품 등록 API
   - POST `/store/foods/{id}`
4. 상품 삭제 API
   - DELETE `/store/foods/{id}`
5. 장바구니 등록 API
   - POST `/carts/foods/{id}`
6. 장바구니 삭제 API
   - DELETE `/carts/foods/{id}`
7. 상품 주문 API
   - POST `/orders/foods/{id}`