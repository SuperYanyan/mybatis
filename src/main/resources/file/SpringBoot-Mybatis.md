### SpringBoot-MyBatis整合

- 单纯使用mybatis-spring-boot-starter
注意，不用使用额外的配置文件，不需要任何xml文件

- Application.java
添加注解
---
    @EnableAutoConfiguration
    @SpringBootApplication
    @MapperScan("com.db.mapper") //自动扫描Mapper的位置
---

- Mapper类
添加Mapper注解

- 额外的说明
SpringBoot 启动Web工程时，Controller的注解要使用@RestController，不用@Controller
否则http访问时候拿不到return的String