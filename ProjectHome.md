This is a java demo project for the persistence layer.

# Technologies #
This demo of a persistence implementation uses the following technologies
  1. Maven
  1. Spring 3.0
  1. JPA
  1. Hibernate

# Instructions #
Through the source management you can download the source and run mvn compile
Or you can download a binary

This library is meant as an example and can be used as a jar for example in a web application project.

If you whish to use the in memory database provided with this library in your web application, you should include in your webapplication on the classpath a file named: **local.config**

in this config file you should inculde something like the following parameters

> |ds\_driverclassname | org.hsqldb.jdbcDriver  |
|:-------------------|:-----------------------|
> |ds\_url             |            path-to-your-db-location/test|
> |ds\_username        |       sa               |
> |ds\_password        |                        |
> |vendor\_dbplatform  | org.hibernate.dialect.HSQLDialect |
> |showsql             |            false       |
> |generateddl         |        false           |

Kind regards,

http://www.linkedin.com/in/marcdekwant
