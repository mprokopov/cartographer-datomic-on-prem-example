# Example to export datomic schema to cartographer entities EDN

## Preapare peer server

run this in datomic on prem installation folder to spin up peer server

```shell
 bin/run -m datomic.peer-server \
 -h 0.0.0.0 \
 -p 8998 \
 -a myaccesskey,mysecret \
 -d db-name,datomic:dev://localhost:4334/db-name
```



check it's running ok
```shell
curl -v -k https://localhost:8998/health
```


#  Execute CLI

```shell
clj
```


```
cartographer-datomic-on-prem clj -M:repl/rebel
Checking out: https://github.com/mprokopov/schema-cartographer.git at 3e6a7a53a5c227a037c5c9eb706e200c1ff948ac
2021-04-05 14:09:17.057:INFO::main: Logging initialized @6294ms to org.eclipse.jetty.util.log.StdErrLog
== Querying Schema ==

-- Exploring Database --

 - Analyzing :account/correspondent references
  - 0 relationships analyzed

..
== resources/db-schema.edn successfully saved. ==
```

Check resources/db-schema.edn and load it into the https://schema-cartographer.com/
