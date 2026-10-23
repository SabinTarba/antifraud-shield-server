# AntiFraud Shield Server

This Maven reactor contains two independently runnable Spring Boot applications
and a shared Java library:

| Module | Responsibility |
| --- | --- |
| `antifraud-shield-server-api` | Public HTTP API for third-party integrations |
| `antifraud-shield-server-admin` | Backend HTTP API for the admin UI |
| `antifraud-shield-server-common` | Shared entities, DTOs, enums, and framework-independent utilities |

The API and admin applications are separate deployables. Keep their controllers,
security configuration, and application-specific services in their respective
modules. Put only types that genuinely need to be shared in `common`; avoid
putting application-specific behavior there.

## Requirements

- JDK 17
- Maven 3.9 or later

## Build

From this directory, build all modules with:

```shell
mvn clean verify
```

Build one application and its shared dependency, then run its executable JAR:

```shell
mvn -pl antifraud-shield-server-api -am package
java -jar antifraud-shield-server-api/target/antifraud-shield-server-api-0.1.0-SNAPSHOT.jar

mvn -pl antifraud-shield-server-admin -am package
java -jar antifraud-shield-server-admin/target/antifraud-shield-server-admin-0.1.0-SNAPSHOT.jar
```
