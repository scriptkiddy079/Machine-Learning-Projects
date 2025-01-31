name := "Credit Risk Classifier"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  Seq(
    "org.apache.spark"                %% "spark-core"                     % "2.3.2",
    "org.apache.spark"                %% "spark-sql"                      % "2.3.2",
    "org.apache.spark"                %% "spark-mllib"                    % "2.3.2",
    "com.datastax.spark"              %% "spark-cassandra-connector"      % "2.3.2",
    "org.slf4j"                       % "slf4j-api"                       % "1.7.5",
    "ch.qos.logback"                  % "logback-classic"                 % "1.0.9"
  )
}

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)
