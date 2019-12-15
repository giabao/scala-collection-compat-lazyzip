publishMavenStyle := true

publishTo := sonatypePublishToBundle.value

pomExtra in Global := <url>https://github.com/sandinh/scala-collection-compat-lazyzip</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/sandinh/scala-collection-compat-lazyzip</url>
    <connection>scm:git:git@github.com:sandinh/scala-collection-compat-lazyzip.git</connection>
  </scm>
  <developers>
    <developer>
      <id>giabao</id>
      <name>Bùi Việt Thành</name>
      <email>thanhbv@sandinh.net</email>
      <organization>Sân Đình</organization>
      <organizationUrl>https://sandinh.com</organizationUrl>
    </developer>
  </developers>
