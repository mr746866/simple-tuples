# Simple Tuples for Java

Java library that provides simple tuples (heterogeneous, fixed size containers). All tuple classes are type safe and immutable.

Java does not provide tuples out of the box. This library aims to fill that gap with very simple implementations.

*Warning: This is still a work in progress.*

### Installing

## Gradle

Simple Tuples library is available on both JCenter and Maven Central.

Add the following to your build.gradle file, if you are not already using atleast one of JCenter and Maven Central.

```
repositories {
    jcenter()
    // Or
    mavenCentral()
}
```

And then add the following in your dependencies block.

```
dependencies {
    implementation 'com.github.mr746866:simple-tuples:1.0.1'
}
```
