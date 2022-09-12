# HOWse

## 프로젝트 소개
<b>사용자를 위한, 사용자에 의한 서비스 :house: HOWse 를 사용해 보세요.</b>  
> 거주할 곳을 찾을 때 근처에 마트, 지하철역 등 '이것' 만큼은 있었으면 좋겠지만 일일이 찾아봐야 되나요?  
> HOWse는 내가 원하는 정보들을 포함한 집들 중에서 알아서 추천을 해줍니다.  


## 프로젝트 일정 및 인원
<b>:date: 프로젝트 일정 : 2022.05.19 ~ 05.26</b>  
<b>:runner: 프로젝트 인원 : 3명</b>  
  
<b>[팀장]</b> 조다연 : 인프라 구현, 주변시설 필터  
<b>[팀원]</b> 송선아 : 지도 매핑, 매물 찜하기  
<b>[팀원]</b> 전승준 : 키워드 검색, 채팅 서비스  

<img src ="https://user-images.githubusercontent.com/26267376/189614925-51c3b319-2fa1-4816-8127-86f3a89ed156.png" width=60% height=60%>

### 기획 배경 및 목표  
<img src ="https://user-images.githubusercontent.com/26267376/189620781-cd77cbec-b374-4bc1-9d9f-c8270dced7b7.png" width=60% height=60%>  
HappyHouse 라는 대주제를 부여받아 브레인스토밍을 해서 사용자에게 필요한 게 무엇인지 생각했고 아래와 같은 결과를 도출했습니다.<br><br>  
  
* <b>투자가치</b> : 거래 유형과 금액에 맞는 아파트 실거래가 제공  
* <b>주변에 여러 시설이 있는 곳</b> : 은행, 마트, 교육, 교통 등 집 주변의 인프라 정보 제공  
* <b>개인 맞춤형 서비스</b> : 개인 성향에 따라 은행, 마트 등과 같은 인프라 카테고리를 선택하여 그에 맞는 최적의 집 추천  
* <b>소통 공간</b> : 사용자들과 정보 공유를 할 수 있는 채팅 서비스<br><br>


이러한 4가지 필요점들을 구상했고 기획 배경 및 목표를 아래와 같이 설정했습니다.
<img src ="https://user-images.githubusercontent.com/26267376/189621533-1a0d44e6-3933-47e7-880e-07dae7a4f4b0.png" width=60% height=60%>

## 프로젝트 개발 환경
<img src ="https://user-images.githubusercontent.com/26267376/189623230-f1027cb8-1ca4-4683-b32b-de4b4cb483d6.png" width=70% height=70%>
이외에 지도 사용을 위해 Kakao API를 사용했습니다.

## 프로젝트 상세 내용

### 주요 기능
<img src ="https://user-images.githubusercontent.com/26267376/189624017-774dbd02-e22d-4f1b-bb83-5a0d6513fd1d.png" width=70% height=70%>

#### 인프라 정보
<img src ="https://user-images.githubusercontent.com/26267376/189626005-48b98bfb-6d97-4df5-8bb9-940cc477d637.png" width=30% height=30%>  

- 조회한 아파트 위치로부터 500m 안에 있는 주변 시설을 거리가 가까운 순으로 정보 제공  
  
#### 매물 추천
<img src ="https://user-images.githubusercontent.com/26267376/189626035-928f3aa0-621f-40d0-99ee-c05e30f9915c.png" width=40% height=40%>  

- 키워드 검색으로 위치 확인  
- 거래 유형에 따라 거래 금액 선택  
- 개인이 원하는 주변 시설 선택  
- 선택된 조건을 바탕으로 지도 내에 있는 매물 중 모든 조건을 만족하는 집 추천  
  
#### 찜하기 기능
<img src ="https://user-images.githubusercontent.com/26267376/189626077-e5860af9-8a15-4337-bbc4-d72b9a6f918c.png" width=40% height=40%>

- 즐겨찾기 했을 시 상세 조회의 하트 아이콘과 지도의 마커가 변경되어 쉽게 구분 가능  
- 관심있는 매물을 '찜한 매물' 페이지에서 관리할 수 있음  
  
#### 채팅
<img src ="https://user-images.githubusercontent.com/26267376/189626120-66edeb83-7583-4ab9-8669-cac6e5839b9d.png" width=40% height=40%>

- 로그인한 id로 사용자들과 자유로운 채팅 가능  
- 로그인하지 않은 유저는 익명아이디로 채팅 가능  
  
### 프로젝트 일정
<img src ="https://user-images.githubusercontent.com/26267376/189622692-d5110d2b-e90c-4af9-a7da-aa0177f2b734.png" width=60% height=60%>

### 개인별 일정
<img src ="https://user-images.githubusercontent.com/26267376/189623040-fe0d2134-b814-4965-8582-a84143fa4cc3.png" width=70% height=70%>
