scalaVersion := "2.11.12"

name := "matrix-multiply"
version := "1.0"
libraryDependencies ++= Seq(
    "com.github.fommil.netlib" % "all" % "1.1.2",
    "org.apache.spark" %% "spark-core" % "2.4.5",
    "org.apache.spark" %% "spark-mllib" % "2.4.5",
    "org.scalanlp" %% "breeze" % "0.11.2",
    "org.scalanlp" %% "breeze-natives" % "0.11.2"
)