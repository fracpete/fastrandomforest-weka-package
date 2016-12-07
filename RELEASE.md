How to make a release
=====================

Preparation
-----------

* Change the artifact ID in `pom.xml` to today's date, e.g.:

  ```
  2016.12.7-SNAPSHOT
  ```

* Update the version, date and URL in `Description.props` to reflect new
  version, e.g.:

  ```
  Version=2016.12.7
  Date=2016-12-07
  PackageURL=https://github.com/fracpete/fastrandomforest-weka-package/releases/download/v2016.12.7/fastrandomforest-2016.12.7.zip
  ```

Weka package
------------

* Commit/push all changes

* Run the following command to generate the package archive for version `2016.12.7`:

  ```
  ant -f build_package.xml -Dpackage=fastrandomforest-2016.12.7 clean make_package
  ```

* Create a release tag on github (v2016.12.7)
* add release notes
* upload package archive from `dist`


Maven
-----

* Run the following command to deploy the artifact:

  ```
  mvn release:clean release:prepare release:perform
  ```

* log into https://oss.sonatype.org and close/release artifacts

* After successful deployment, push the changes out:

  ```
  git push
  ````
