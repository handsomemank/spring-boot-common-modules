# spring-boot-common
## 描述
将功能原型集成到该github库中，具体如下。
* common-service：spring boot项目原型，处理一些基本配置和日志等配置
* common-aoplog：如记录日志
* common-email：如发送邮件，分析邮件
* common-poi：如导出excel，这里做了2种处理，分为缓存模板导出(SXSSFWorkbook，不支持xls等导出)、及支持xls的导出(不支持缓存导出)
* common-freemarker：freemarker模板导出word
* common-resttemp：resttemplate调用封装
* common-redis：如5种数据类型处理
* common-jpa-hb：jpa-hibernate常用功能支持。如审计功能、返回自定义实体、多对多等关系配置
* common-muldb-hb：jpa-hibernate多数据源功能
* common-muldb-mb：mybatis多数据源功能
* common-util：封装一些常用的工具类，如时间、文件、hibernate验证器等工具类
* common-net：网络编程学习，如bio、nio(netty)、aio
* java-stu：javase知识点，编程题学习代码
* netty4-chatroom：netty4实现的聊天室代码
### 参考项目思路
* Spring Boot自定义Starter(代码较为简单就不具体实现了，代码可参考([教你自己写starter](https://github.com/yidao620c/SpringBootBucket/tree/master/springboot-starter)))
    * [Spring Boot自定义Starter【从零开始学Spring Boot】](http://412887952-qq-com.iteye.com/blog/2395419)
## 参考
* [markdown文件的基本常用编写语法](https://www.cnblogs.com/liugang-vip/p/6337580.html) 
* [利用内存分析工具（Memory Analyzer Tool，MAT）分析java项目内存泄露](https://blog.csdn.net/wanghuiqi2008/article/details/50724676)
* [Java程序员必备的11大Intellij插件](https://www.toutiao.com/a6584934544699294216)
* [Lombok 介绍和使用](https://blog.csdn.net/motui/article/details/79012846)
* [p3c Idea版使用方法](https://blog.csdn.net/garfielder007/article/details/79050875)
### java学习书籍参考
* [https://waylau.com/books/](https://waylau.com/books/)