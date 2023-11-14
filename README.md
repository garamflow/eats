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
   - POST `/foods/{id}`
4. 상품 삭제 API
   - DELETE `/foods/{id}`
5. 상품 수정 API
   - PUT `/foods/{id}` 
6. 장바구니 등록 API
   - POST `/carts/foods/{id}`
7. 장바구니 삭제 API
   - DELETE `/carts/foods/{id}`
8. 상품 주문 API
   - POST `/orders/foods/{id}`

## 3) DB 테이블
### (1) 상품 (음식)
| 필드          | 타입           | 키       |
|-------------|--------------|---------|
| id          | int          | PRIMARY |
| name        | varchar(100) |         |
| price       | int          |         |
| description | text         |         |
| createdDate | Date         |         |
| updatedDate | Date         |         |
