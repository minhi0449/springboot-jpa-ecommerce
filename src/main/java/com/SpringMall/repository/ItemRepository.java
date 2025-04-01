package com.SpringMall.repository;

import com.SpringMall.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    /* JpaRepository<T,ID> : 2개의 제네릭 타입을 사용하는데
                             첫 번째에는 엔티티 타입 클래스
                             두 번째에는 기본키 타입을 넣어줌

      [ JpaRepository 에서 지원하는 메소드 ]
      1. <S extends T> save(S entity) : 엔티티 저장 및 수정
      2. void delete(T entity) : 엔티티 삭제
      3. count() : 엔티티 총 개수 반환
      4. Iterable<T> findAll() : 모든 엔티티 조회
    */
}
