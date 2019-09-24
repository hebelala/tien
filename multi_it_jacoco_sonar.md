# sonar anaysis by jacoco

## jacoco maven:

https://www.jacoco.org/jacoco/trunk/doc/maven.html

Define `jacoco.append` as `true`, `jacoco.destFile` as the one file

## sonar maven

https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/

or 

https://github.com/SonarSource/sonar-scanner-maven

Define property <sonar.skip>true</sonar.skip> in the pom.xml of the module you want to exclude, like for integration tests

https://github.com/SonarSource/sonar-scanning-examples

Get some examples

https://stackoverflow.com/questions/13031219/how-to-configure-multi-module-maven-sonar-jacoco-to-give-merged-coverage-rep?r=SearchResults

Maybe this is helpful