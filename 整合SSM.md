## 整合SSM

### 一、准备工作

1. 引入必要依赖

### 二、整合SpringMVC

​	1.创建web工程

​			file --> project structure --> moudle --> +web  --> edit path （E:\ProgramData\java\source\SSM\src\main\webapp\WEB-INF\web.xml）

​	2.配置web.xml       

> （1）配置Spring编码过滤器-- CharacterEncodingFilter
>
> （2） 配置处理请求方式的处理过滤器--HiddenHttpMethodFilter        
>
> （3）配置SpringMVC的前端控制器--DispatcherServlet
>
> （4）配置Spring监听器，在服务器启动时加载spring的配置文件 -- ContextLoaderListener
>
> （5）设置spring配置文件的位置和名称 -- contextConfigLocation

​	3.配置核心配置文件springmvc.xml

> （1）配置控制层扫描 -- context:component-scan
>
> （2）配置Thymeleaf视图解析器 -- SpringResourceTemplateResolver
>
> （3）配置默认的servlet处理静态资源 -- mvc:default-servlet-handler
>
> （4）开启MVC的注解驱动 -- mvc:annotation-driven
>
> （5）配置视图控制器 --  mvc:view-controller

### 三、整合Spring

​	1.配置核心配置文件spring.xml

> （1）配置控制层以外的扫描 -- context:component-scan
>
> （2）配置数据源 -- DruidDataSource	
>
> （3）配置SqlSessionFactroryBean -- SqlSessionFactoryBean（引入mybatis-config.xml）
>
> （4）配置mapper接口的扫描 --  MapperScannerConfigurer
>
> （5）配置事务管理器 -- DataSourceTransactionManager ，并开启事务注解驱动 -- tx:annotation-driven

### 四、整合Mybatis

​	1.配置核心配置文件mybatis-config.xml

> （1）配置别名 -- typeAliases
>
> （2）配置插件 -- plugins
>
> （3）配置mapper映射文件



### 五、单元测试测Service

> （1）测试类上必须要添加这几个注解，否则会造成注入失效，空指针异常
>
> ```
> @Component // 不添加该注解，会造成Autowired注解失效
> @RunWith(SpringJUnit4ClassRunner.class)  // 设置junit的运行环境的扩展
> @ContextConfiguration(locations = {"classpath:spring.xml"}) // 添加spring的核心配置文件
> ```

​	