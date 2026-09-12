# 医保目录评审流水服务

这是一个面向业务数据流的后端服务基线。当前仓库提供健康检查、配置约定和测试入口，业务数据模型与流程由后续开发补充。

## 运行

- Java 项目执行 `mvn test`，再运行 `mvn spring-boot:run`。

容器构建命令为 `docker build -t backend-baseline .`；需要配套服务的项目在 `docker-compose.yml` 中声明。健康接口为 `GET /health`。
