## spring boot + sping mvc + jpa/batis + mysql + jwt +vue

---

### Token验证流程

1.从Request Header 取出Token

2.判断JWT Token是否过期

3.解析token

4.向SpringSecurity的Context中加入认证信息

![img1.jpg](/img/img1.jpg)

---

### 测试
- 没有tocken就没有访问权限

![img.png](/img/img.png)

- 模拟登录

![img_1.png](/img/img_1.png)

- 对应前端登录

![img_3.png](/img/img_3.png)

- 成功登录返回token

![img_2.png](/img/img_2.png)

- 将token加入header后便可访问api，前端直接封装

![img_4.png](/img/img_4.png)

- 权限控制定义使用Role相关字段

![img_5.png](/img/img_5.png)