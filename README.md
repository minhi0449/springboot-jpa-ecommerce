# Spring Boot + JPA 기반 쇼핑몰 시스템 구축 프로젝트
> **Spring Boot 3와 JPA**를 활용하여 **전자상거래(쇼핑몰) 시스템**을 구축하는 프로젝트입니다.  </br>
상품 관리, 회원 관리, 주문 및 결제 기능을 포함하며, **확장성과 유지보수성**을 고려하여 설계되었습니다.

✓ **상품 등록 및 관리, 장바구니, 결제 시스템, 주문 내역 조회** </br>
✓ **Spring Security를 활용한 인증 및 권한 관리** </br>
✓ **클린 아키텍처 적용 및 모듈화** </br>
✓ **AWS를 활용한 배포 및 CI/CD 자동화** </br>

---

## ✸ 사용 기술 (Tech Stack)

| 분야        | 기술 스택 |
|------------|-------------------------------------------------------------------------------------|
| **Backend**  | ![Java 17](https://img.shields.io/badge/Java%2017-007396?style=flat&logo=java&logoColor=white) ![Spring Boot 3.4.3](https://img.shields.io/badge/Spring%20Boot%203.4.3-6DB33F?style=flat&logo=spring-boot&logoColor=white) ![Spring Security 5.7](https://img.shields.io/badge/Spring%20Security%205.7-6DB33F?style=flat&logo=spring&logoColor=white) |
| **Frontend** | ![Thymeleaf 3.0](https://img.shields.io/badge/Thymeleaf%203.0-005F0F?style=flat&logo=thymeleaf&logoColor=white) ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white) ![JavaScript ES6](https://img.shields.io/badge/JavaScript%20ES6-F7DF1E?style=flat&logo=javascript&logoColor=black) |
| **Database** | ![MySQL 8.0](https://img.shields.io/badge/MySQL%208.0-4479A1?style=flat&logo=mysql&logoColor=white) ![JPA/Hibernate](https://img.shields.io/badge/JPA%203.1%2FHibernate%206.4-59666C?style=flat&logo=hibernate&logoColor=white) ![Redis 5.0](https://img.shields.io/badge/Redis%205.0-DC382D?style=flat&logo=redis&logoColor=white) |
| **DevOps**   | ![Docker 20.10](https://img.shields.io/badge/Docker%2020.10-2496ED?style=flat&logo=docker&logoColor=white)  ![AWS](https://img.shields.io/badge/AWS%20(EC2%20%7C%20RDS%20%7C%20S3)-F7931E?style=flat&logo=amazon-aws&logoColor=white) ![GitHub Actions CI/CD](https://img.shields.io/badge/GitHub%20Actions%20CI%2FCD-2088FF?style=flat&logo=github-actions&logoColor=white) |
---

## ✦ 주요 기능 (Core Features)

### **1. 상품 관리 (Product Management)**
- 상품 등록, 수정, 삭제 기능 제공  
- 카테고리별 상품 분류 및 검색  
- 판매 여부 설정 (판매 중 / 품절)  

### **2. 장바구니 (Shopping Cart)**
- 상품을 장바구니에 추가 및 삭제  
- 장바구니 내 상품 수량 조정  

### **3. 주문 및 결제 (Order & Payment)**
- 주문 내역 조회 및 주문 취소 기능 제공  
- PG(Payment Gateway) 연동을 통한 결제 처리  

### **4. 회원 관리 (User Management)**
- Spring Security를 활용한 로그인 및 권한 관리  
- 회원가입 및 비밀번호 암호화 (BCrypt)  
- 관리자(Admin) 및 일반 사용자(User) 구분  

---
