# Description

A reproduction case for a failure to build a native image when linking in GraalWasm. The issue is induced by usage of
the polyglot API.

To see the issue, run:

```
$ mvn -P native-image -D skipTests=true package
```
