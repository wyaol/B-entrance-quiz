### 完成度：
* 完成了所有功能
* 查询学员列表的接口，应返回所有未分组学员，而不是所有学员
* 新增学员时，没有校验姓名是否为空

__Details:__



### 测试：
* 包含了Controller的测试，没有cover所有case

__Details:__



### 知识点：
* Spring MVC相关的知识点掌握得不错
* Restful API Design相关的知识点掌握得不错
* 使用了CorsFilter设置跨域，抽象了DTO

__Details:__
+ \+ 使用了stream操作
+ \+ 使用了CorsFilter
- \- 建议使用构造方法注入bean
- \- 状态码默认为200，可以省略@ResponseStatus注解

### 工程实践：
* 项目结构划分合理，使用了分组架构
* git commit message表意，遵循了小步提交

__Details:__

- \- 建议private，遵循最小访问原则
- \- 异常处理避免直接打印堆栈

### 综合：
* 可以尝试使用Collections.shuffle()实现随机分组

__Details:__



