# Prerequisites

Before starting, we will set up an instance of JBoss EAP 7.4 with a running application. This will help demonstrate the server configuration migration process.  

We will use the JBoss EAP 7.4 quickstarts kitchensink application with some modifications as follows:

* The application has been updated to connect to a MySQL database. This will allow us to test the migration of J2EE modules and drivers.
* Java Server Faces has been updated from version 2.2 to 2.3, as described in the KCS article.

We can use Podman or Docker to run an instance of MySQL with the correct configuration with the following command:

``` podman run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=eap mysql ```

We have already downloaded a JBoss EAP 7.4.0 distribution, extract the distribution into a local folder (e.g., ~/jboss-eap-74) with the following command:

``` unzip ~/jboss-eap-7.4.0.zip ```

Set the EAP_HOME environment variable.

``` export EAP_HOME=~/jboss-eap-7.4 ```

Now we can start JBoss EAP 7.4 with the following command:

``` $EAP_HOME/bin/standalone.sh ```

