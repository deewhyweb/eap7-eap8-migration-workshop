# EAP Kitchen sink application using external Postgres database.

To run, first start a postgres database with

```
podman run --name myPostgresDb \
    -p 5432:5432 \
    -e POSTGRES_USER=postgresUser \
    -e POSTGRES_PASSWORD=postgresPW \
    -e POSTGRES_DB=postgresDB \
    -d \
    postgres
```


Create the following environment variables:

```
export POSTGRESQL_DRIVER_VERSION=42.2.19 \
&& export POSTGRESQL_DATABASE=postgresDB \
&& export POSTGRESQL_USER=postgresUser \
&& export POSTGRESQL_PASSWORD=postgresPW \
&& export POSTGRESQL_DATASOURCE=postgresql \
&& export POSTGRESQL_SERVICE_HOST=127.0.0.1 \
&& export POSTGRESQL_SERVICE_PORT=5432
```

Provision JBoss EAP, build and deploy the application, from the repo location run:

`cd sample-app-eap8-ocp`

`mvn clean package -Popenshift`

Once the build has completed, run 

`./target/server/bin/standalone.sh`

Test the kitchen sink app at url:  http://127.0.0.1:8080/index.jsf

