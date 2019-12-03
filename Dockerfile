# docker build --tag=my_app .
# docker run -it -p 8080:8080 my_app
# if latest command in windows dont work use - alias docker="winpty docker"

FROM jboss/wildfly
# path from dockerfile
ADD ./target/webapp.war /opt/jboss/wildfly/standalone/deployments/