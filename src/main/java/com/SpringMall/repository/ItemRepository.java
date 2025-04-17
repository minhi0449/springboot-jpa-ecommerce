package com.SpringMall.repository;

import com.SpringMall.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/* JpaRepository<T,ID> : 2개의 제네릭 타입을 사용하는데
                             첫 번째에는 엔티티 타입 클래스
                             두 번째에는 기본키 타입을 넣어줌

      [ JpaRepository 에서 지원하는 메소드 ]
      1. <S extends T> save(S entity) : 엔티티 저장 및 수정
      2. void delete(T entity) : 엔티티 삭제
      3. count() : 엔티티 총 개수 반환
      4. Iterable<T> findAll() : 모든 엔티티 조회
    */
public interface ItemRepository extends JpaRepository<Item, Long> {

    // 상품 조회하기
    // itemNm(상품명)으로 데이터를 조회하기 위해서 By 뒤에 필드명인 ItemNm을 메소드의 이름에 붙여줌
    // 엔티티명은 생략 가능하므로 findItemByItemNm 대신에 findByItemNm 으로 메소드명을 만들어줌
    // 매개 변수로는 검색할 때 사용할 상품명 변수를 넘겨줌
    List<Item> findByItemNm(String itemNm);

    // OR 조건 처리하기
    // 상품을 상품명과 상품 상세 설명을 OR 조건을 이용하여 조회하는 쿼리 메소드
    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

    // LessThan 조건 처리하기
    // 파라미터로 넘어온 price 변수보다 값이 작은 상품 데이터를 조회하는 쿼리 메소드
    List<Item> findByPriceLessThan(Integer price);

}
