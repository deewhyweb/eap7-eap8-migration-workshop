# EAP 7 to EAP 8 migration workshop

This workshop is designed to guide you through the process of migrating a JBoss EAP 7.4 server to JBoss EAP 8-Beta.  The workshop covers the following areas:

* Configure a JBoss 7.4 instance to connect to an external database
* Build and deploy a JBoss EAP application to a running instance of JBoss EAP 7.4
* Use the server migration tool to migrate a JBoss EAP 7.4 server configuration to JBoss EAP 8-Beta
* Use the MTR to identify code changes required to migrate an application from JBoss EAP 7.4 to JBoss EAP 8-Beta
* Use openrewrite to automate some of the code changes identified by the MTR
* Build, deploy and test the application on JBoss EAP 8-Beta
* Add the eap-maven-plugin to enable the application to be deployed on OpenShift
* Test the eap-maven-plugin in local environment
* Build application image in OpenShift
* Deploy application image to OpenShift using the EAP operator

