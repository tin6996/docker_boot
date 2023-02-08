package com.cjh.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @projectName: docker_boot
 * @package: com.cjh.docker
 * @className: DockerBootApplication
 * @author: tinkouka
 * @date: 2023/2/7 22:27
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.cjh.docker.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class DockerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class,args);
    }
}
