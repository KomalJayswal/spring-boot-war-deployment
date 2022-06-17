# Configuration Details

1. Marked the servlet container (Tomcat) as provided.

_Maven dependency **scope provided** is used during build and test the project. They are also required to run, but should not exported, because the dependency will be provided by the runtime, for instance, by servlet container or application server._

```bash
    <dependency>  
        <groupId>org.springframework.boot</groupId>  
        <artifactId>spring-boot-starter-tomcat</artifactId>  
        <scope>provided</scope>  
    </dependency>    
```

2. We need to deploy WAR file so change the package type to WAR in pom.xml file.

```bash
<packaging>war</packaging>  
```
3. Modify the final WAR file name by using the <finalName> tag to avoid including the version numbers. We have created a WAR file with the name web-services.

```bash
<finalName>web-services</finalName>  
```