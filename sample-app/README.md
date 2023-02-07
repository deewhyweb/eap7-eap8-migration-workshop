# EAP Kitchen sink application using external MySQL database.

To run, first start a mysql database using docker-compose

`docker-compose up`

or using podman

docker run --name myPostgresDb -p 5432:5432 -e POSTGRES_USER=postgresUser -e POSTGRES_PASSWORD=postgresPW  -e POSTGRES_DB=postgresDB -d postgres

Run wildfly, from the EAP_HOME folder, run:

`./bin/standalone.sh`

Copy the contents of the modules folder to the EAP_HOME/modules folder.

deploy the Kitchen sink application, from the repo location run:


`mvn clean install wildfly:deploy`

Add the driver and datasource, from the EAP_HOME folder, run:


```

jboss-cli.sh

/subsystem=datasources/jdbc-driver=postgresql:add(driver-name=postgresql,driver-module-name=org.postgresql)

data-source add --name=postgresql --jndi-name=java:/jdbc/postgresql --driver-name=postgresql --connection-url=jdbc:postgresql://127.0.0.1:5432/postgresDB --user-name=postgresUser --password=postgresPW
```

Test the kitchen sink app at url:  http://127.0.0.1:8080/kitchensink/index.jsf



        