# Design-Patterns
设计模式
# 单例模式
# 使用场景:
1、要求生成唯一序列号的环境 <br>
2、在整个项目需要一个共享访问点或者共享数据。如:Web页面上的计数器 <br>
3、创建对象需要消耗的资源过多，如：访问IO和数据库 <br>
4、需要定义大量的静态常量和静态方法
# 优点:
1、减少内存开支，特别是对于需要重复创建、销毁 <br>
2、减少系统开销，当一个对象需要比较多资源时，如:读取配置、产生其他依赖对象，可以在应用启动时直接产生一个单例对象，然后永久驻留内存的方式解决 <br>
3、避免对同一个资源的多重占用，例如:同时写的操作 <br>
4、系统设置全局的访问点、优化和共享资源访问。例如：可以设计
一个单例类，负责所有数据表的映射关系
# 缺点:
1、单例模式一般没有接口，扩展困难 <br>
2、不利于测试 <br>
3、与单一职责原则冲突 <br>
# 工厂模式
# 使用场景
1、需要构建灵活的、可拓展的框架（例如设计一个有三种协议的邮件服务器）<br>
2、异构项目（例如:WebService与非Java的项目交互。如：类型问题,WSDL文件支持）<br>
3、测试驱动开发的框架
# 优点:
1、良好的封装性，代码结构清晰 <br>
2、便于扩展 <br>
3、屏蔽产类（经典案例，JDBC的使用）<br>
5、经典的解耦框架
