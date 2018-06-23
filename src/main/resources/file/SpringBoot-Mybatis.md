### SpringBoot-MyBatis整合

- 单纯使用mybatis-spring-boot-starter
注意，不用使用额外的配置文件，不需要任何xml文件


- pom文件
---
            <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>1.3.1</version>
            </dependency>
    
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>5.1.27</version>
            </dependency>
---

- application.xml
---
    spring:
      datasource:
        driver-class-name: com.mysql.jdbc.Driver
        url: jdbc:mysql://localhost:3306/test
        username: root
        password: 123123
---
注意，没写下面的内容！！！
---
    mybatis:
      mapper-locations: classpath:mybatis/mapper/*.xml
      config-location: classpath:mybatis/mybatis-config.xml
---
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