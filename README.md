<h1>JPA_SAMPLE</h1>
<div>Spring Boot+Hibernate+Mysql+Lombok 샘플</div>
<div>*Lombok으로 인해 annotation 세팅이 필요</div>

<h2>CRUD Sample</h2>
<pre>
[등록]
POST /api/v1/members
request
{
  "name": "addUser",
  "email": "addUser@test.com"
}
[리스트]
GET /api/v1/members
[수정] 
PUT /api/v1/members/{id}
request 
{
  "name":"update",
  "email":"update@email.com"
}
[삭제]
DELETE /api/v1/members/{id}
</pre>
