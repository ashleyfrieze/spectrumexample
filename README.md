# Simple example of a maven project with Spectrum

Perform a build with

```bash
mvn clean verify
```

This will execute the tests in the given `Specs` as integration tests.

Output includes:

```bash
INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running uk.org.webcompere.HelloSpecs
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.134 s - in uk.org.webcompere.HelloSpecs
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-failsafe-plugin:2.20.1:verify (default) @ SpectrumExample ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```