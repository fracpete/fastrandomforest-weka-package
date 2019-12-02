fastrandomforest-weka-package
=============================

An efficient implementation of the Random Forest classifier for Java.

Fork of original project hosted on Google Code:

https://code.google.com/archive/p/fast-random-forest/


Classifier
----------

The full classname of the classifier implementation:

```
hr.irb.fastRandomForest.FastRandomForest
```


Releases
--------

* [2019.12.3](https://github.com/fracpete/fastrandomforest-weka-package/releases/download/v2019.12.3/fastrandomforest-2019.12.3.zip)
* [2019.11.10](https://github.com/fracpete/fastrandomforest-weka-package/releases/download/v2019.11.10/fastrandomforest-2019.11.10.zip)
* [2016.12.7](https://github.com/fracpete/fastrandomforest-weka-package/releases/download/v2016.12.7/fastrandomforest-2016.12.7.zip)


How to use packages
-------------------

For more information on how to install the package, see:

https://waikato.github.io/weka-wiki/packages/manager/


Maven
-----

Add the following dependency in your `pom.xml` to include the package:

```xml
    <dependency>
      <groupId>com.github.fracpete</groupId>
      <artifactId>fastrandomforest-weka-package</artifactId>
      <version>2019.12.3</version>
      <type>jar</type>
      <exclusions>
        <exclusion>
          <groupId>nz.ac.waikato.cms.weka</groupId>
          <artifactId>weka-dev</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
```

