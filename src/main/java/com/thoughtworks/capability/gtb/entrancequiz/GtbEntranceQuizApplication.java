package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}

// TODO GTB-综合: * 可以尝试使用Collections.shuffle()实现随机分组
// TODO GTB-完成度: * 完成了所有功能
// TODO GTB-完成度: * 查询学员列表的接口，应返回所有未分组学员，而不是所有学员
// TODO GTB-完成度: * 新增学员时，没有校验姓名是否为空
// TODO GTB-测试: * 包含了Controller的测试，没有cover所有case
// TODO GTB-知识点: * Spring MVC相关的知识点掌握得不错
// TODO GTB-知识点: * Restful API Design相关的知识点掌握得不错
// TODO GTB-知识点: * 使用了CorsFilter设置跨域，抽象了DTO
// TODO GTB-工程实践: * 项目结构划分合理，使用了分组架构
// TODO GTB-工程实践: * git commit message表意，遵循了小步提交
