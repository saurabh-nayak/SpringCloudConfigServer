package com.saurabh.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@Value("${spring.cloud.config.server.git.uri}")
String str;

@RequestMapping("/get")
public String getString()
{
	return str;
}
}
