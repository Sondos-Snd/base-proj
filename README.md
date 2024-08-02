# boilerplate

This is a refrence project that will keep being enriched with new features as I implement them.

## Table of Contents

1- Basic setup
2- Issues

## Installation

- Spring boot 3
- Mysql db
- Spring JPA
- Spring REST
- Lombok
- Mapstruct
- Web MVC
- Actuator

```bash
# Clone the repository
git clone 

# Navigate into the project directory
cd base-proj
```


## Issues:

- MS2 : db: PostgreSQL
- MS3 : db: MongoDB
- Centralize configuration
- SOAP API
- GraphQL
- WebClient calls
- RestTemplate calls
- Cloud OpenFeign
- Eureka - service registry
- API Gateway
- Load balancing
- Auto refresh
- Distributed tracing
- Circuit breaker
- Documentation
- Kafka integration
- rabbitMQ - event-driven arch
- CI/CD pipeline 
- Caching - Redis
- Notification module - email/sms client
- Indexing db - stored procedures
- records
- pagination
- multi-threading
- cron jobs
- I/O operations
- security: authentication/authorization
- Profiles/envs
- testing
- JWT Tokens
- Theameleaf
- SSO
- nginx proxy
- live-reload (dev tools) - ok

To enable automatic restart and live reload in IntelliJ IDEA, you can use the Spring Boot DevTools and the IntelliJ's built-in tools for hot-swapping code. Here’s how to set them up:

### 1. Using Spring Boot DevTools

Spring Boot DevTools provides features that make the development process more efficient, such as automatic restart and live reload.

#### Step 1: Add Spring Boot DevTools Dependency

Add the following dependency to your `pom.xml` if you are using Maven:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```

Or to your `build.gradle` if you are using Gradle:

```gradle
implementation 'org.springframework.boot:spring-boot-devtools'
```

#### Step 2: Enable Automatic Restart

By default, Spring Boot DevTools enables automatic restart. When you make changes to your code, DevTools will restart your application automatically.

### 2. Using IntelliJ IDEA Hot Swap

IntelliJ IDEA supports hot-swapping of code, which allows you to update your running application without restarting the JVM.

#### Step 1: Enable Compiler. Automatically show first error in editor

Go to `File` > `Settings` > `Build, Execution, Deployment` > `Compiler`, and check the box `Build project automatically`.

#### Step 2: Enable Automatic Recompilation

Enable the "Automatic Compilation" feature in IntelliJ IDEA. Go to `File` > `Settings` > `Advanced Settings` and check the box `Allow auto-make to start even if developed application is currently running`.

#### Step 3: Enable Hot Swap

When running your application in debug mode, IntelliJ IDEA allows for hot-swapping code changes.

1. Run your Spring Boot application in debug mode.
2. Make changes to your code.
3. IntelliJ IDEA will prompt you to reload the classes automatically.

### 3. Using LiveReload

To get a live reload feature, you can use a browser extension like LiveReload:

#### Step 1: Install the LiveReload Browser Extension

Install the LiveReload extension for your preferred browser:

- [LiveReload for Chrome](https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei)
- [LiveReload for Firefox](https://addons.mozilla.org/en-US/firefox/addon/livereload/)

#### Step 2: Start LiveReload Server

Once you have installed Spring Boot DevTools and the browser extension:

1. Run your Spring Boot application.
2. Open the browser and activate the LiveReload extension.

Now, whenever you make changes to your HTML, CSS, or JavaScript files, the browser will automatically refresh to reflect the changes.

### Summary

1. Add Spring Boot DevTools dependency to your project.
2. Enable automatic compilation and hot swap in IntelliJ IDEA settings.
3. Install and activate the LiveReload browser extension.

By following these steps, you should be able to enjoy automatic restart and live reload features, making your development process smoother and more efficient.




