# scala-collection-compat-lazyzip
scala 2.13's LazyZipOps (LazyZip2, LazyZip3, LazyZip4) backport for scala 2.12

[all test from scala 2.13.1](https://github.com/scala/scala/blob/v2.13.1/test/junit/scala/collection/LazyZipOpsTest.scala) passed!

## How to use
+ install [from maven center](https://search.maven.org/artifact/com.sandinh/scala-collection-compat-lazyzip_2.12)
ex:
```sbt
libraryDependencies += "com.sandinh" %% "scala-collection-compat-lazyzip" % "2.13.1"
```
+ use
```scala
import scala.collection.LazyZipOpsImplicits._
```
then use as normal :D - see [LazyZipOpsTest](src/test/scala/scala/collection/LazyZipOpsTest.scala)

note: this library ONLY contains a empty object for scala 2.13:
```scala
package scala.collection
object LazyZipOpsImplicits {}
```


## Licence
This software is licensed under the Apache 2 license:
http://www.apache.org/licenses/LICENSE-2.0

Copyright 2019 Sân Đình (https://sandinh.com)
