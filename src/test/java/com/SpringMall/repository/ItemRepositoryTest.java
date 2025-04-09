package com.SpringMall.repository;

import com.SpringMall.constant.ItemSellStaus; // 판매 상태 상수 (SELL, SOLD_OUT)
import com.SpringMall.entity.Item; // 상품 정보를 담는 엔티티 클래스
import org.junit.jupiter.api.DisplayName; // 테스트에 이름을 붙이는 어노테이션
import org.junit.jupiter.api.Test; // JUnit 테스트 어노테이션
import org.springframework.beans.factory.annotation.Autowired; // 의존성 자동 주입
import org.springframework.boot.test.context.SpringBootTest; // 스프링 부트 테스트 환경 설정
import org.springframework.test.context.TestPropertySource; // 테스트 설정 적용
import java.time.LocalDateTime; // 현재 시간 쓰려고 import
import static org.junit.jupiter.api.Assertions.*; // 단언문 사용 가능하게 import

/*
    import org.junit.jupiter.api.*;
    -> 우리가 코드를 잘 짰는지 자동으로 확인해주는 도구

    import org.springframework.boot.test.context.SpringBootTest;
    -> Spring Boot 전체 설정을 "테스트 모드"로 실행하라는 뜻

    import org.springframework.test.context.TestPropertySource;
    -> 테스트용 설정파일(application-test.properties)을 사용하겠다는 선언
 */

@SpringBootTest // 스프링 부트 통합 테스트 환경 선언
@TestPropertySource(locations="classpath:application-test.properties") // 테스트 전용 설정파일 지정
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository; // Item 저장소 객체를 Spring이 자동으로 주입
    /*
        ItemRepository 란?
        JpaRepository를 상속받은 인터페이스. DB랑 연결돼서 CRUD 작업 담당.
     */


    @Test
    @DisplayName("상품 저장 테스트") // 테스트 이름 지정
    public void createItemTest(){
        Item item = new Item(); // 빈 상품 하나 소환 (new Item = 텅 빈 인형)
        item.setItemNm("테스트 상품"); // 이름 지정 : "테스트 상품"
        item.setPrice(10000); // 가격은 10,000원
        item.setItemDetail("테스트 상품 상세 설명"); // 상품 상세 내용 추가
        item.setItemSellStaus(ItemSellStaus.SELL); // 판매 상태를 'SELL' 설정
        item.setStockNumber(100); // 재고 수량은 100개
        item.setRegTime(LocalDateTime.now()); // 등록 시간 : 지금
        item.setUpdateTime(LocalDateTime.now()); // 업데이트 시간 : 지금
        Item savedItem = itemRepository.save(item); // save() 으로 DB 저장 -> 저장 시 savedItem 에 DB 에서 돌아온 값이 들어감 (id 자동부여)
        System.out.println(savedItem.toString()); // 저장된 아이템 정보를 콘솔에 출력


        /*
            데이터 흐름 시나리오 요약
            1. 빈아이템 만들고 (new Item())
            2. 값들 세팅하고
            3. 저장 (itemRepository.save())
            4. 저장된 값 확인 (System.out.println())
         */
    } // end of createItemTest


    public void createItemList(){
        for (int i=1; i<=10; i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStaus(ItemSellStaus.SELL);

        }
    }



} // end of class