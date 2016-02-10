# library donwload #

Through the source management you can download the source and run mvn compile Or you can download a binary

This library is meant as an example and can be used as a jar for example in a web application project.

# Usage #

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